package com.example.mohammadumar.clasprojecttasktabbed;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mohammadumar.clasprojecttasktabbed.MyAdapter.SimpleGetID;

import static com.example.mohammadumar.clasprojecttasktabbed.R.drawable.telenorbackgroundtext;

/**
 * Created by Mohammad Umar on 27/02/2019.
 */

public class MyAdapter extends ArrayAdapter<String> {

    Context context;
   /* public static int companyImage;*/
    public static String[] PakagesName;
    public  int mColor;

    public MyAdapter(Context context,String[]pkgName, int color ) {
        super(context, R.layout.list_view_pkages,R.id.pakagename,pkgName);

        this.context = context;
        this.PakagesName = pkgName;
        this.mColor = color;
      /*  this.companyImage = image ;*/
    }




    static class SimpleGetID{
        TextView textView;
    /*    ImageView imageView;
*/

        public  SimpleGetID (View view){
            this.textView = view.findViewById(R.id.pakagename);
            /*this.imageView = view.findViewById(R.id.image_Company);*/
        }
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view==null){

            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.list_view_pkages, parent, false);
            SimpleGetID simpleGetID = new SimpleGetID(view);
            view.setTag(simpleGetID);
        }
        SimpleGetID simpleGetID = (SimpleGetID) view.getTag();
        simpleGetID.textView.setText(PakagesName[position]);
       // simpleGetID.textView.setTextColor(R.color.textColor);
        switch (mColor){
            case 1:

                simpleGetID.textView.setTextColor(Color.parseColor("#ffffff"));
                //simpleGetID.textView.setBackgroundColor(Color.parseColor("#4283f2"));
                simpleGetID.textView.setBackgroundResource(R.drawable.telenorbackgroundtext);
                break;
            case 2:
                simpleGetID.textView.setTextColor(Color.parseColor("#ffffff"));
                simpleGetID.textView.setBackgroundResource(R.drawable.ufonebackgroundtext);
                break;
            case 3:
                simpleGetID.textView.setTextColor(Color.parseColor("#ffffff"));
                simpleGetID.textView.setBackgroundResource(R.drawable.jazzbackgroundtrext);
                break;
            case 4:
                simpleGetID.textView.setTextColor(Color.parseColor("#ffffff"));
                simpleGetID.textView.setBackgroundResource(R.drawable.zongbackgroundtext);
                break;
        }
     /*   simpleGetID.imageView.setImageResource(companyImage);*/
        return view;
    }



        }







