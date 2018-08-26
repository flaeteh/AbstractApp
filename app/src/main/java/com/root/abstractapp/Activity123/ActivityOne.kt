package com.root.abstractapp.Activity123

import android.app.Activity
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import com.root.abstractapp.BaseActivity
import com.root.abstractapp.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_one.*
import java.util.*

class ActivityOne : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        //Rx
      /*  val animalsObservable = getAnimalsObservable()
        val animalsObserver = getAnimalsObserver()
        animalsObservable
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(animalsObserver)*/

        activity_two_button.setOnClickListener {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }

        activity_three_button.setOnClickListener {
            val intent = Intent(this, ActivityThree::class.java)
            startActivity(intent)
        }

        showButton1.setOnClickListener {
           showMessage("One", 1)
        }

        val bBrowser = findViewById<Button>(R.id.button_browser)
        button_browser.setOnClickListener{
            openBrowser(bBrowser)
        }

        val bSms = findViewById<Button>(R.id.button_sms)
        button_sms.setOnClickListener {
            openSms(bSms)
        }

        val bEmail = findViewById<Button>(R.id.button_email)
        button_email.setOnClickListener {
            openEmail(bEmail)
        }

        val bMaps = findViewById<Button>(R.id.button_maps)
        button_maps.setOnClickListener {
            openMaps(bMaps)
        }

        //PROGRESS DIALOG - RXJAVA
    }

  /*  //PROGRESS DIALOG - RXJAVA
    val ProgressObserver:Observer<String>
    get() {
        return object:Observer<String>
        fun onSubscribe (d: Disposable) {
            Log.d(TAG, "onSubscribe")
        }

        fun onNext (s:String) {
            Log.d(TAG, "")
        }

        fun onError (e:Throwable) {
            Log.e(TAG, "onError" + e.message)
        }


    }*/

    companion object {
        private val TAG = ActivityOne::class.java!!.simpleName
    }
}
