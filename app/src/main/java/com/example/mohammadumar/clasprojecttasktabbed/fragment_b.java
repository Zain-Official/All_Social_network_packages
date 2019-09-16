package com.example.mohammadumar.clasprojecttasktabbed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class fragment_b extends Fragment {

    static int z ;

    ListView listView;

    static int colorT;

    public static String[] smsPakagesName;
    public static String[] smsPakagesPric;
    public static String[] smsPakagesVolum;
    public static String[] smsPakagesDuration;
    public static String[] smsPakagesActivationCode;
    public static String[] smsPakagesDeActivationCode;
   /* public static int companyImage;
*/  public static String companyType;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_fragment_b,container,false);
        listView = view.findViewById(R.id.lvsmspkg);
        // Inflate the layout for this fragment
        MyAdapter adapter = new MyAdapter(getActivity(),smsPakagesName , colorT/*,companyImage*/);


     /*   if (companyType.equalsIgnoreCase("jazz")){

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
                Intent intent = new Intent(getContext() , Detailsms.class);
                intent.putExtra("company",companyType);
                intent.putExtra("type" , "SMS Package");
                intent.putExtra("pakageName" , smsPakagesName[position]);
                intent.putExtra("pakagePrice" , smsPakagesPric[position]);
                intent.putExtra("pakageVolum" , smsPakagesVolum[position]);
                intent.putExtra("pakageDuration" , smsPakagesDuration[position]);
                intent.putExtra("pakageActiC" , smsPakagesActivationCode[position]);
                intent.putExtra("pakageDeActi" , smsPakagesDeActivationCode[position]);

                startActivity(intent);
            }
        });
        return view;

    }

    public  void setData (String companyType,String[]pkgName , String[]pkgPrice ,String[]pkgVolum , String[]pkgDuration , String[]pkgActiCode , String[]pkgDeActiCode ,  int tC /*, int companyImage*/ ){
        this.smsPakagesName = pkgName;
        this.smsPakagesPric = pkgPrice;
        this.smsPakagesVolum = pkgVolum;
        this.smsPakagesDuration = pkgDuration;
        this.smsPakagesActivationCode = pkgActiCode;
        this.smsPakagesDeActivationCode=pkgDeActiCode;
       /* this.companyImage = companyImage;*/
        this.companyType = companyType;
        this.colorT = tC;
    }

    public void fragmb (int b)
    {
        z = b;
    }


}
