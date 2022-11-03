package com.trisnasejati.androidtools;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import org.apache.http.conn.ConnectTimeoutException;

import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

public class DialogTools {

    public static void snackBar(View view, Throwable throwable){
        snackBar(view, throwableHelper(throwable));
    }

    public static void snackBar(View view, String message){
        if(view!=null) Snackbar.make(view, message, BaseTransientBottomBar.LENGTH_SHORT).show();
    }

    public static void snackBar(View view, Throwable throwable, boolean isIndent){
        snackBar(view, throwableHelper(throwable), true);
    }

    public static void snackBar(View view, String message, boolean isIndent){
        if (isIndent) {
            if(view!=null) Snackbar.make(view, message, BaseTransientBottomBar.LENGTH_LONG).show();
        }else{
            if(view!=null) Snackbar.make(view, message, BaseTransientBottomBar.LENGTH_INDEFINITE).show();
        }
    }

    public static void alert(Activity activity, String title, Throwable throwable){
        alert(activity, title, throwableHelper(throwable));
    }

    public static void alert(Activity activity, String title, String message){
        if (activity!=null && title!=null && message!=null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(message).setTitle(title);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }

    public static void toast(Context context, Throwable throwable){
        toast(context, throwableHelper(throwable));
    }

    public static void toast(Context context, String message){
        if (context!=null) Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static String throwableHelper(Throwable throwable){
        throwable.printStackTrace();
        Log.e("Throwable", throwable.getMessage());
        String message;
        if (throwable instanceof ConnectTimeoutException || throwable instanceof TimeoutException || throwable instanceof UnknownHostException) {
            message = "Sinyal internet lemah! Silahkan coba lagi!";
        }else if(throwable instanceof IllegalStateException){
            message = "Server Error! Silahkan coba lagi nanti atau hubungi kami!";
        }else{
            message = throwable.getLocalizedMessage();
        }
        return message;
    }

}
