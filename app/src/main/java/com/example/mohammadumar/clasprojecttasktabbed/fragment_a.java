package com.example.mohammadumar.clasprojecttasktabbed;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class fragment_a extends Fragment {
    ListView listView;
    TextView textView;
    static int x;
    static int colorT;


    public static String[] callPakagesName;
    public static String[] callPakagesPric;
    public static String[] callPakagesVolum;
    public static String[] callPakagesDuration;
    public static String[] callPakagesActivationCode;
    public static String[] callPakagesDeActivationCode;
   public static String companyType;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_fragment_a,container,false);
        listView = view.findViewById(R.id.lvcallpkg);
        textView = view.findViewById(R.id.pakagename);
        MyAdapter adapter = new MyAdapter(getActivity(),callPakagesName , colorT/*,companyImage*/);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(getContext() , Detailofcalls.class);
                intent.putExtra("company",companyType);
                intent.putExtra("type" , "call Package");
                intent.putExtra("callpakageName" , callPakagesName[position]);
                intent.putExtra("callpakagePrice" , callPakagesPric[position]);
                intent.putExtra("callpakageVolum" , callPakagesVolum[position]);
                intent.putExtra("callpakageDuration" , callPakagesDuration[position]);
                intent.putExtra("callpakageActiC" , callPakagesActivationCode[position]);
                intent.putExtra("callpakageDeActi" , callPakagesDeActivationCode[position]);


                startActivity(intent);

            }
        });
        return view;
    }

    public  void setData (String companyType,String[]callpkgName , String[] callpkgPrice ,String[] callpkgVolum , String[] callpkgDuration , String[] callpkgActiCode , String[] callpkgDeActiCode, int tC/* , int companyImage*/ ){
        this.callPakagesName = callpkgName;
        this.callPakagesPric= callpkgPrice;
        this.callPakagesVolum = callpkgVolum;
        this.callPakagesDuration= callpkgDuration;
        this.callPakagesActivationCode = callpkgActiCode;
        this.callPakagesDeActivationCode=callpkgDeActiCode;
        this.colorT = tC;
      this.companyType = companyType;

    }

    public void fragma (int a){

        x = a;

    }








}
