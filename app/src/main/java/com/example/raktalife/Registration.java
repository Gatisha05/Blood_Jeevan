package com.example.raktalife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name,phone,email,pwd;
    Spinner dist,state,lastdonated,bloodgrp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        email=findViewById(R.id.email);
        pwd=findViewById(R.id.pwd);
        bloodgrp=findViewById(R.id.bloodgrp);
        lastdonated=findViewById(R.id.lastdonated);
        state=findViewById(R.id.state);
        dist=findViewById(R.id.dist);
        state.setOnItemSelectedListener(this);
        String full_name = name.getText().toString();
        String phone_num = phone.getText().toString();
        String email_id = email.getText().toString();
        String password = pwd.getText().toString();

        String[] State = {"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
        state.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,State));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String str = (String) state.getItemAtPosition(position);
        String[] Andhra_Pradesh = {"Anantapur","Chittoor","East Godavari","Guntur","Kadapa","Krishna","Kurnool","Prakasam","Nellore","Srikakulam","Visakhapatnam","Vizianagaram","West Godavari"};
        String[] Arunachal_Pradesh ={""};
        String[] Assam={};
        String[] Bihar={};
        String[] Chhattisgarh={};
        String[] Goa={};
        String[] Gujarat={};
        String[] Haryana={};
        String[] Himachal_Pradesh={};
        String[] Jammu_Kashmir={};
        String[] Jharkhand={};
        String[] Karnataka={};
        String[] Kerala={};
        String[] Madhya_Pradesh={};
        String[] Maharashtra={};
        String[] Manipur={};
        String[] Meghalaya={};
        String[] Mizoram={};
        String[] Nagaland={};
        String[] Odisha={};
        String[] Punjab={};
        String[] Rajasthan={};
        String[] Skkim={};
        String[] Tamil_Nadu={};
        String[] Telangana={};
        String[] Tripura={};
        String[] Uttar_Pradesh={};
        String[] Uttarakhand={};
        String[] West_Bengal={};

        if(position==0)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Andhra_Pradesh));
        }
        else if(position==1)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Arunachal_Pradesh));
        }
        else if(position==2)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Assam));
        }
        else if(position==3)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Bihar));
        }
        else if(position==4)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Chhattisgarh));
        }
        else if(position==5)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Goa));
        }
        else if(position==6)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Gujarat));
        }
        else if(position==7)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Haryana));
        }
        else if(position==8)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Himachal_Pradesh));
        }
        else if(position==9)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Jammu_Kashmir));
        }
        else if(position==10)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Jharkhand));
        }
        else if(position==11)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Karnataka));
        }
        else if(position==12)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Kerala));
        }
        else if(position==13)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Madhya_Pradesh));
        }
        else if(position==14)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Maharashtra));
        }
        else if(position==15)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Manipur));
        }
        else if(position==16)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Meghalaya));
        }
        else if(position==17)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Mizoram));
        }
        else if(position==18)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Nagaland));
        }
        else if(position==19)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Odisha));
        }
        else if(position==20)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Punjab));
        }
        else if(position==21)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Rajasthan));
        }
        else if(position==22)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Skkim));
        }
        else if(position==23)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Tamil_Nadu));
        }
        else if(position==24)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Telangana));
        }
        else if(position==25)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Tripura));
        }
        else if(position==26)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Uttar_Pradesh));
        }
        else if(position==27)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Uttarakhand));
        }
        else if(position==28)
        {
            dist.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,West_Bengal));
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
