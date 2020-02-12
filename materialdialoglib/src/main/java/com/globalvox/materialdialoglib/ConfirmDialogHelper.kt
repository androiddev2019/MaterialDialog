package com.globalvox.materialdialoglib

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

@SuppressLint("InflateParams")
open class ConfirmDialogHelper(context: Context) : BaseDialogHelper() {

    override val dialogView: View by lazy {
        LayoutInflater.from(context).inflate(R.layout.dialog_alert_confirm, null)
    }

    override val builder: AlertDialog.Builder = AlertDialog.Builder(context).setView(dialogView)

    /*Views initializer*/
    private val tvPositive: TextView by lazy {
        dialogView.findViewById<TextView>(R.id.tvPositive)
    }

    private val tvMsg: TextView by lazy {
        dialogView.findViewById<TextView>(R.id.tvMsg)
    }

    private val tvNegative: TextView by lazy {
        dialogView.findViewById<TextView>(R.id.tvNegative)
    }
    /*Views initializer*/

    /*Listener method*/
    fun setNegativeClickListener(func: (() -> Unit)? = null) =
        with(tvNegative) {
            setClickListenerToDialogIcon(func)
        }

    fun setPositiveClickListner(func: (() -> Unit)? = null) = with(tvPositive) {
        setClickListenerToDialogIcon(func)
    }
    /*Listener method*/

    private fun View.setClickListenerToDialogIcon(func: (() -> Unit)?) = setOnClickListener {
        func?.invoke()
        dialog?.dismiss()
    }

    fun setMessage(msg:String): ConfirmDialogHelper {
        tvMsg.text = msg
        return this
    }
    fun setPositiveButtonText(pText:String): ConfirmDialogHelper {
        tvPositive.text = pText
        return this
    }
    fun setNegativeButtonText(pText:String): ConfirmDialogHelper {
        tvNegative.text = pText
        return this
    }

    fun setAlertDialog(): ConfirmDialogHelper {
        tvNegative.visibility=View.GONE
        return this
    }
}