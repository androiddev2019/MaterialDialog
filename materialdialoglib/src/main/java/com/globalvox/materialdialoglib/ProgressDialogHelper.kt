package com.globalvox.materialdialoglib

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog

@SuppressLint("InflateParams")
open class ProgressDialogHelper(context: Context) : BaseDialogHelper() {

    override val dialogView: View by lazy {
        LayoutInflater.from(context).inflate(R.layout.progress_indicator, null)
    }

    override val builder: AlertDialog.Builder = AlertDialog.Builder(context).setView(dialogView)

    /*Views initializer*/
    private val cirLoader: DotProgressIndicator by lazy {
        dialogView.findViewById<DotProgressIndicator>(R.id.cirLoader)
    }

    /*Views initializer*/


    private fun View.setClickListenerToDialogIcon(func: (() -> Unit)?) = setOnClickListener {
        func?.invoke()
        dialog?.dismiss()
    }

    fun startProgressIndicator(isCancelable:Boolean){
        cancelable=isCancelable
        this@ProgressDialogHelper.create().show()
        cirLoader.startAnimation()
    }
    fun stopProgressIndicator(){
        cirLoader.stopAnimation()
        dialog?.dismiss()
    }
}