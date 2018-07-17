package com.levibostian.accountauthenticatorappcompatactivityexample.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.levibostian.accountauthenticatorappcompatactivityexample.R
import kotlinx.android.synthetic.main.fragment_email_login.*

class EmailLoginFragment: Fragment() {

    private lateinit var listener: Listener

    interface Listener {
        fun finishLogin(email: String, authToken: String)
    }

    companion object {
        fun newInstance(): EmailLoginFragment = EmailLoginFragment()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        listener = (parentFragment as? Listener) ?: (activity as Listener)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_email_login, container, false)
    }

    override fun onStart() {
        super.onStart()

        setupViews()
    }

    private fun setupViews() {
        login_button.setOnClickListener {
            listener.finishLogin(login_email_edittext.text.toString(), "123")

            Toast.makeText(activity, "Logged in! Check for your created account in the Settings app.", Toast.LENGTH_LONG).show()
        }
    }

}