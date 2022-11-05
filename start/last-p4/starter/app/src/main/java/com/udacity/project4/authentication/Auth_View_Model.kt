package com.udacity.project4.authentication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map

class Auth_View_Model: ViewModel() {

    enum class AuthenticationState {
        Authenticated, UNAUTHENTICATED
    }

    val AuthenticationState = FirebaseUserLiveData().map { user ->
        if(user != null) {
            AuthenticationState.Authenticated
        } else {
            AuthenticationState.UNAUTHENTICATED
        }
    }

}