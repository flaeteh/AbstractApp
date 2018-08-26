package com.root.abstractapp.Activity123

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.root.abstractapp.BaseActivity
import com.root.abstractapp.R
import kotlinx.android.synthetic.main.activity_two.*

class ActivityTwo : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        activity_one_button.setOnClickListener {
            val intent = Intent(this, ActivityOne::class.java)
            startActivity(intent)
        }

        activity_three_button.setOnClickListener {
            val intent = Intent(this, ActivityThree::class.java)
            startActivity(intent)
        }

        showButton2.setOnClickListener {
            showMessage("Two", 2)
            showProgressDialog()
        }

        val bBrowser = findViewById<Button>(R.id.button_browser)
        button_browser.setOnClickListener{
            openBrowser(bBrowser)
        }
    }
}
