package com.hanif.makanan;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Fooddata {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("mie_goreng", "Makananan Mie Goreng", 5000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("cireng", "Makananan Cireng", 5000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("donut", "Makananan DONAT", 5000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("kopi_hitam", "Makananan Kopi Hitam", 5000, context.getDrawable(R.drawable.kopi_hitam)));
        return list;
    }
}
