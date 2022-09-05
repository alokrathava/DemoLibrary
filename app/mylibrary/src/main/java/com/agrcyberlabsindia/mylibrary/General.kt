package com.agrcyberlabsindia.mylibrary

import android.content.Context
import android.widget.Toast

class General {

    fun showMsg(msg: String, context: Context) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

}