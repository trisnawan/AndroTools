package com.trisnasejati.androidtools;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeTools {

   public static String getDuration(long timestamp){
      long timeNow = new Date().getTime()/1000L;
      long seconds = (timestamp/1000L) - timeNow;
      long hours = seconds / 3600;
      long minutes = (seconds % 3600) / 60;
      long secs = seconds % 60;
      return String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, secs);
   }

   public static String formatDateFull(long timestamp){
      @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
      return dateFormat.format(new Date(timestamp));
   }

   public static String formatTimeFull(long time1, long time2){
      @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm, dd MMMM yyyy");
      return dateFormat.format(time1) + " s/d " +dateFormat.format(time2);
   }

   public static int getMinute(long timestamp){
      return (int) timestamp / 1000 / 60;
   }

   public static String getDayName(int code){
      String ret = "";
      switch (code){
         case 0:
            ret = "Minggu";
            break;
         case 1:
            ret = "Senin";
            break;
         case 2:
            ret = "Selasa";
            break;
         case 3:
            ret = "Rabu";
            break;
         case 4:
            ret = "Kamis";
            break;
         case 5:
            ret = "Jumat";
            break;
         case 6:
            ret = "Sabtu";
            break;
      }
      return ret;
   }

}
