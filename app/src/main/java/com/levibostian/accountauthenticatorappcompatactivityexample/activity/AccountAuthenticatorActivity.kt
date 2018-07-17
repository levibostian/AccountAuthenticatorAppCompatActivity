package com.levibostian.accountauthenticatorappcompatactivityexample.activity

import android.accounts.Account
import android.accounts.AccountManager
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.levibostian.accountauthenticatorappcompatactivity.activity.AccountAuthenticatorAppCompatActivity
import com.levibostian.accountauthenticatorappcompatactivityexample.R
import com.levibostian.accountauthenticatorappcompatactivityexample.auth.AccountAuthenticator
import com.levibostian.accountauthenticatorappcompatactivityexample.fragment.EmailLoginFragment
import kotlinx.android.synthetic.main.activity_account_auth.*

class AccountAuthenticatorActivity: AccountAuthenticatorAppCompatActivity(), EmailLoginFragment.Listener {

    companion object {
        fun getIntent(context: Context): Intent = Intent(context, AccountAuthenticatorActivity::class.java)
    }

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)

        setContentView(R.layout.activity_account_auth)

        if (icicle == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, EmailLoginFragment.newInstance())
                    .commit()
        }
    }

    override fun finishLogin(email: String, authToken: String) {
        val accountManager = AccountManager.get(application)
        val res = Intent()
        res.putExtra(AccountManager.KEY_ACCOUNT_NAME, email)
        res.putExtra(AccountManager.KEY_ACCOUNT_TYPE, AccountAuthenticator.ACCOUNT_TYPE)
        res.putExtra(AccountManager.KEY_AUTHTOKEN, authToken)

        val account = Account(email, AccountAuthenticator.ACCOUNT_TYPE)
        accountManager.addAccountExplicitly(account, null, null)
        accountManager.setAuthToken(account, AccountAuthenticator.ACCOUNT_TYPE, authToken)

        setAccountAuthenticatorResult(res.extras)
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

}