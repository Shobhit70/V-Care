package com.example.shobhitpc.vcare;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by shobhit pc on 10-Jul-17.
 */

public class Main extends Activity {
    ImageView register,about,doctor_detail,logout,appointment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       register=(ImageView)findViewById(R.id.register);
        about=(ImageView)findViewById(R.id.aboutus);
       doctor_detail=(ImageView)findViewById(R.id.doctordetail);
        logout=(ImageView)findViewById(R.id.logout);
        appointment=(ImageView)findViewById(R.id.takeappointment);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main.this,Appointment.class);
                startActivity(i);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main.this,Register.class);
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main.this,About.class);
                startActivity(i);
            }
        });

        doctor_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main.this,Details.class);
                startActivity(i);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main.this,Login.class);
                Toast.makeText(Main.this,"Logout Successfuly",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }

}
