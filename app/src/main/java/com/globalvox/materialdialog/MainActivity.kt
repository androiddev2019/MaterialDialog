package com.globalvox.materialdialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.globalvox.materialdialoglib.ConfirmDialogHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d = ConfirmDialogHelper(this@MainActivity)
        d.setMessage("Are you sure want to exit?")
        d.setPositiveButtonText("OK")
        d.setNegativeButtonText("Cancel")
        d.setAlertDialog()
        d.setPositiveClickListner {
            d.dialog?.dismiss()
        }
        d.setNegativeClickListener {
            d.dialog?.dismiss()
        }
        d.create().show()
    }
}
