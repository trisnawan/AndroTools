package com.trisnasejati.androidtools;

import android.content.Context;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerTools {
   public static void settingVertical(Context context, RecyclerView recyclerView){
      settingVertical(context, recyclerView, false, false);
   }
   public static void settingVertical(Context context, RecyclerView recyclerView, boolean isDivider){
      settingVertical(context, recyclerView, isDivider, false);
   }
   public static void settingVertical(Context context, RecyclerView recyclerView, boolean isDivider, boolean reverse){
      RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, reverse);
      RecyclerView.ItemDecoration decoration = new DividerItemDecoration(context, DividerItemDecoration.VERTICAL);
      recyclerView.setLayoutManager(layoutManager);
      if (isDivider) {
         recyclerView.addItemDecoration(decoration);
      }
      recyclerView.setNestedScrollingEnabled(false);
   }
}
