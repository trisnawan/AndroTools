package com.trisnasejati.androidtools;

public class AppTools {
   public static boolean isNotNull(String string){
      if (string!=null){
         return string.length() > 0;
      }else{
         return false;
      }
   }
}
