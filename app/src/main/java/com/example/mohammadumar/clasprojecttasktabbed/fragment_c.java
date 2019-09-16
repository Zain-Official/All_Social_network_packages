package com.example.mohammadumar.clasprojecttasktabbed;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class fragment_c extends Fragment {

    ListView listView;
    static int c;
    static int colorT;

    public static String[] internetPakagesName;
    public static String[] internetPakagesPric;
    public static String[] internetPakagesVolum;
    public static String[] interrnetPakagesDuration;
    public static String[] internetPakagesActivationCode;
    public static String[] internetPakagesDeActivationCode;
  /*  public static int companyImage;
*/  public static String companyType;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_fragment_c, container, false);
        listView = view.findViewById(R.id.lvinternetpkg);
        MyAdapter adapter = new MyAdapter(getActivity(), internetPakagesName, colorT);

      /*  if (companyType.equalsIgnoreCase("jazz")){

        }
        else if (companyType.equalsIgnoreCase("ufone")){

        }
        else if(companyType.equalsIgnoreCase("telenor")){

        }
        else if(companyType.equalsIgnoreCase("zong")){

        }
        else {}
*/
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getContext(), detailofinternet.class);
                intent.putExtra("company",companyType);
                intent.putExtra("type", "Internet Package");
                intent.putExtra("internetpakageName", internetPakagesName[position]);
                intent.putExtra("internetpakagePrice", internetPakagesPric[position]);
                intent.putExtra("internetpakageVolum", internetPakagesVolum[position]);
                intent.putExtra("internetpakageDuration", interrnetPakagesDuration[position]);
                intent.putExtra("internetpakageActiC", internetPakagesActivationCode[position]);
                intent.putExtra("internetpakageDeActi", internetPakagesDeActivationCode[position]);

                startActivity(intent);
            }
        });
        return view;

        // Inflate the layout for this fragment

    }

    public void setData(String companyType,String[] pkgName, String[] pkgPrice, String[] pkgVolum, String[] pkgDuration, String[] pkgActiCode, String[] pkgDeActiCode , int tC/*, int companyImage*/) {
        this.internetPakagesName = pkgName;
        this.internetPakagesPric = pkgPrice;
        this.internetPakagesVolum = pkgVolum;
        this.interrnetPakagesDuration = pkgDuration;
        this.internetPakagesActivationCode = pkgActiCode;
        this.internetPakagesDeActivationCode = pkgDeActiCode;
        this.companyType=companyType;

        this.colorT = tC;
       /* this.companyImage = companyImage;*/


    }

    public void fragmc(int v){

         c  = v;
    }
}