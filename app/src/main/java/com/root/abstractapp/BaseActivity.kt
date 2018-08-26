package com.root.abstractapp

import android.app.ProgressDialog
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.util.Log
import org.jetbrains.anko.indeterminateProgressDialog
import org.jetbrains.anko.toast
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.appcompat.R.id.message
import android.view.View

abstract class BaseActivity : AppCompatActivity() {
    lateinit var progressDialog : ProgressDialog

    //TOAST MESSAGE
    fun showMessage(message: String, message2: Int) {
        toast ("message = " + message)
    }

    //SHOW PROGRESS DIALOG
    fun showProgressDialog () {
        progressDialog = indeterminateProgressDialog("Loading...")
        progressDialog.show()
    }

    //DISMISS PROGRESS DIALOG
    fun dismissProgressDialog () {
        progressDialog.dismiss()
    }

    //LAUNCH A WEB BROWSER AND LOAD THE URL
    fun openBrowser (view: View) {
        val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.spot.ph"))
        startActivity(intent)
    }

    //OPEN SMS APP THEN MAY NUMBER AND MESSAGE NA
    fun openSms (view: View) {
        val smsintent = Intent (Intent.ACTION_VIEW,
                Uri.fromParts("sms", "09178837315", null))
        smsintent.putExtra("sms_body", "Welcome to NTT Data Philippines!")
        startActivity(smsintent)
    }

    //SPECIFIC E-MAIL ADD AND, SUBJECT, AND BODY
    fun openEmail (view: View) {
        val email = "florence.lae.teh@gmail.com"
        val subject = "Test Email"
        val body = "This is a test e-mail!"

        val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        emailIntent.putExtra(Intent.EXTRA_TEXT, body)
        startActivity(Intent.createChooser(emailIntent, "Chooser Title"))
    }

    //SET LATITUDE AND LONGITUDE TO VIEW A SPECIFIC LOCATION
    fun openMaps (view: View) {
        //call longitude and latitude from api
        var latitude = ""
        var longitude = ""
        val strUri = "http://maps.google.com/maps?q=loc:$latitude$longitude(NTT Data Philippines)"
        val intent = Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri))
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity")
        startActivity(intent)
    }
}