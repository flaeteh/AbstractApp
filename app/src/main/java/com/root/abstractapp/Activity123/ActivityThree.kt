package com.root.abstractapp.Activity123

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.root.abstractapp.BaseActivity
import com.root.abstractapp.R
import kotlinx.android.synthetic.main.activity_three.*

class ActivityThree : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        activity_one_button.setOnClickListener {
            val intent = Intent(this, ActivityOne::class.java)
            startActivity(intent)
        }

        activity_two_button.setOnClickListener {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }

        showButton3.setOnClickListener {
            showProgressDialog()
            showMessage("Three", 3)
        }

        val bBrowser = findViewById<Button>(R.id.button_browser)
        button_browser.setOnClickListener{
            openBrowser(bBrowser)
        }

    }
}
