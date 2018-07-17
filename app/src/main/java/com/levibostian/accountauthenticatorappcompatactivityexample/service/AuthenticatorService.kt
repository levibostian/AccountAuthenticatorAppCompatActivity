package com.levibostian.accountauthenticatorappcompatactivityexample.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.levibostian.accountauthenticatorappcompatactivityexample.auth.AccountAuthenticator

class AuthenticatorService: Service() {

    override fun onBind(intent: Intent): IBinder {
        return AccountAuthenticator(this).iBinder
    }

}