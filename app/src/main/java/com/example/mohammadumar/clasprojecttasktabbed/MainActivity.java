package com.example.mohammadumar.clasprojecttasktabbed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mohammadumar.clasprojecttasktabbed.Data.Jazz;
import com.example.mohammadumar.clasprojecttasktabbed.Data.Telenor;
import com.example.mohammadumar.clasprojecttasktabbed.Data.Ufone;
import com.example.mohammadumar.clasprojecttasktabbed.Data.Zong;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    Button telenor,ufone,jazz,zong;
    Telenor t;
    Ufone u;
    Jazz j;
    Zong z;
    int tC,jC,zC,uC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        telenor = findViewById(R.id.telenor);
        ufone = findViewById(R.id.ufone);
        jazz = findViewById(R.id.jazz);
        zong = findViewById(R.id.zong);
        telenor.setOnClickListener(this);
        ufone.setOnClickListener(this);
        jazz.setOnClickListener(this);
        zong.setOnClickListener(this);
        setTitle("Packages");

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.telenor){


            tC = 1;
            fragment_b sms = new fragment_b();
            fragment_a call = new fragment_a();
            /*setTitle("TELENOR");*/

            call.setData( "telenor",t.callPakagesName ,t.callPakagesPrice , t.callPakagesVolum , t.callPakagesDuration , t.callPakagesActivationCode , t.callPakagesDeActivationCode ,tC/*, t.TelenorImage */);



            fragment_c internet = new fragment_c();
            internet.setData( "telenor",t.internetPakagesName,t.internetPakagesPrice,t.internetPakagesVolum,t.internetPakagesDuration,t.internetPakagesActivationCode,t.internetPakagesDeActivationCode,tC/*, t.TelenorImage*/ );
            sms.setData( "telenor", t.smsPakagesName ,t.smsPakagesPrice , t.smsPakagesVolum , t.smsPakagesDuration , t.smsPakagesActivationCode , t.smsPakagesDeActivationCode,tC  /*, t.TelenorImage*/ );
            Intent intent = new Intent(this , navigation.class );

            intent.putExtra("key",0);
            startActivity(intent);
        }

        else if (v.getId() == R.id.ufone){

            uC = 2;
            fragment_a cal = new fragment_a();
            cal.setData("ufone",u.callPakagesName, u.callPakagesPrice, u.callPakagesVolum, u.callPakagesDuration, u.callPakagesActivationCode,u.callPakagesDeActivationCode,uC/*,u.ufoneimage*/ );
            fragment_b sms = new fragment_b();
            sms.setData("ufone",u.smsPakagesName,u.smsPakagesPrice,u.smsPakagesVolum,u.smsPakagesDuration,u.smsPakagesActivationCode,u.smsPakagesDeActivationCode,uC/*,u.ufoneimage*/);
            fragment_c internet = new fragment_c();
            internet.setData("ufone",u.internetPakagesName,u.internetPakagesPrice,u.internetPakagesVolum,u.internetPakagesDuration,u.internetPakagesActivationCode,u.internetPakagesDeActivationCode,uC/*,u.ufoneimage*/);
            Intent a = new Intent(this,navigation.class);
            a.putExtra("key",1);
            startActivity(a);
        }

        else if (v.getId() == R.id.jazz){

            jC = 3;
            fragment_a call = new fragment_a();
            call.setData("jazz",j.callPakagesName,j.callPakagesPrice,j.callPakagesVolum,j.callPakagesDuration,j.callPakagesActivationCode,j.callPakagesDeActivationCode,jC/*,j.jazzimage*/);
            fragment_b sms = new fragment_b();
            sms.setData("jazz",j.smsPakagesName,j.smsPakagesPrice,j.smsPakagesVolum,j.smsPakagesDuration,j.smsPakagesActivationCode,j.smsPakagesDeActivationCode,jC/*,j.jazzimage*/);
            fragment_c internet = new fragment_c();
            internet.setData("jazz",j.internetPakagesName,j.internetPakagesPrice,j.internetPakagesVolum,j.internetPakagesDuration,j.internetPakagesActivationCode,j.internetPakagesDeActivationCode,jC/*,j.jazzimage*/);
            Intent c = new Intent(this,navigation.class);

            c.putExtra("key",2);
           /* c.putExtra("background",2);*/


            startActivity(c);
        }

        else if (v.getId() == R.id.zong){

            zC = 4;
            fragment_a call = new fragment_a();
            call.setData("zong",z.callPakagesName,z.callPakagesPrice,z.callPakagesVolum,z.callPakagesDuration,z.callPakagesActivationCode,z.callPakagesDeActivationCode,zC/*,z.zongimage*/);
            fragment_b sms = new fragment_b();
            sms.setData("zong",z.smsPakagesName,z.smsPakagesPrice,z.smsPakagesVolum,z.smsPakagesDuration,z.smsPakagesActivationCode,z.smsPakagesDeActivationCode,zC/*,z.zongimage*/);
            fragment_c internet = new fragment_c();
            internet.setData("zong",z.internetPakagesName,z.internetPakagesPrice,z.internetPakagesVolum,z.internetPakagesDuration,z.internetPakagesActivationCode,z.internetPakagesDeActivationCode,zC/*,z.zongimage*/);
            Intent d = new Intent(this,navigation.class);
            d.putExtra("key",3);
            startActivity(d);
        }

    }
}
