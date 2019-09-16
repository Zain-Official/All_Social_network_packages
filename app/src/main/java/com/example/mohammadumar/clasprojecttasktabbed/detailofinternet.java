package com.example.mohammadumar.clasprojecttasktabbed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class detailofinternet extends AppCompatActivity {

    LinearLayout linearLayout;
    String x;
    Button btn;
    public static String companyType;
    TextView packageType, packageName, packagePrice, packageVolum, packageDuration, packageActiCode, packageDeActiCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailofinternet);
        Bundle position = getIntent().getExtras();

        packageType = findViewById(R.id.pakage_Type);
        packageName = findViewById(R.id.pakage_Name);
        packagePrice = findViewById(R.id.pakage_Price);
        packageVolum = findViewById(R.id.pakage_Volum);
        packageDuration = findViewById(R.id.pakage_Duration);
        packageActiCode = findViewById(R.id.pakage_ActiCode);
        packageDeActiCode = findViewById(R.id.pakage_DeActiCode);
        btn = findViewById(R.id.activate);


        linearLayout = (LinearLayout)findViewById(R.id.internet_detail);

        companyType = position.getString("company");

        if (companyType.equalsIgnoreCase("jazz")){
            linearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.jazzbackgroundstyling));
        }
        else if (companyType.equalsIgnoreCase("ufone")){
            linearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.ufonebackgroundstyling));
        }
        else if(companyType.equalsIgnoreCase("telenor")){
            linearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.telenorbackgroundstyling));
        }
        else if(companyType.equalsIgnoreCase("zong")){
            linearLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.zongbackgrpundstyling));
        }
        else {}

        packageType.setText(position.getString("type"));
        packageName.setText(position.getString("internetpakageName"));
        packagePrice.setText(position.getString("internetpakagePrice"));
        packageVolum.setText(position.getString("internetpakageVolum"));
        packageDuration.setText(position.getString("internetpakageDuration"));
        packageActiCode.setText(position.getString("internetpakageActiC"));
        packageDeActiCode.setText(position.getString("internetpakageDeActi"));

        x = position.getString("internetpakageActiC");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(detailofinternet.this, "ok", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+Uri.encode(x)));
                startActivity(intent);
            }


        });


    }

}
