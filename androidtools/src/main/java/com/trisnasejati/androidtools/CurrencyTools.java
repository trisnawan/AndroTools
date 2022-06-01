package com.trisnasejati.androidtools;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyTools {
   public static String rupiah(Double number){
      Locale locale = new Locale("in", "ID");
      NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
      return numberFormat.format((double) number);
   }

   public static String rupiah(String number){
      Locale locale = new Locale("in", "ID");
      NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
      return numberFormat.format(Double.parseDouble(number));
   }
}
