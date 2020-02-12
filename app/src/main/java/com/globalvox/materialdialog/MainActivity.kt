package com.globalvox.materialdialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.globalvox.materialdialoglib.ProgressDialogHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d = ProgressDialogHelper(this@MainActivity)
        d.startProgressIndicator(false)

        /*val d = ConfirmDialogHelper(this@MainActivity)
        d.setMessage("File deleted.")
        d.setPositiveButtonText("OK")
        d.setNegativeButtonText("Cancel")
        d.setAlertDialog().cancelable = false
        d.setPositiveClickListner {
            d.dialog?.dismiss()
        }
        d.setNegativeClickListener {
            d.dialog?.dismiss()
        }
        d.create().show()*/
    }
}
