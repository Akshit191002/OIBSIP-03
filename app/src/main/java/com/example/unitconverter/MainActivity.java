package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.text);
        sp1 = findViewById(R.id.chn);
        sp2 = findViewById(R.id.chn2);
        b1 = findViewById(R.id.btn);

        String[] from = {"FEET","KM","INCHES","METER"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"FEET","INCHES","KM","METER"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Double tot;
                Double amt=Double.parseDouble(ed1.getText().toString());
                if(sp1.getSelectedItem().toString()=="FEET" && sp2.getSelectedItem().toString()=="INCHES")
                {
                    tot = amt * 12;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="FEET" && sp2.getSelectedItem().toString()=="KM")
                {
                    tot = amt * 0.0003048;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="FEET" && sp2.getSelectedItem().toString()=="METER")
                {
                    tot = amt * 0.3048;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="KM" && sp2.getSelectedItem().toString()=="FEET")
                {
                    tot = amt * 3280.8399;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="KM" && sp2.getSelectedItem().toString()=="INCHES")
                {
                    tot = amt * 39370.0787;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="KM" && sp2.getSelectedItem().toString()=="METER")
                {
                    tot = amt * 1000;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="INCHES" && sp2.getSelectedItem().toString()=="FEET")
                {
                    tot = amt * 0.083333333;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }

                else if(sp1.getSelectedItem().toString()=="INCHES" && sp2.getSelectedItem().toString()=="METER")
                {
                    tot = amt * 0.0254;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="METER" && sp2.getSelectedItem().toString()=="FEET")
                {
                    tot = amt * 3.2808399;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="METER" && sp2.getSelectedItem().toString()=="INCHES")
                {
                    tot = amt * 39.3700787;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
                else if(sp1.getSelectedItem().toString()=="METER" && sp2.getSelectedItem().toString()=="KM")
                {
                    tot = amt * 0.001;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}