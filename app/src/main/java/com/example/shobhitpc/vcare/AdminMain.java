package com.example.shobhitpc.vcare;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by shobhit pc on 10-Jul-17.
 */

public class AdminMain extends Activity {
   ImageView check_name,update,info,logout,appointment;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminmain);
        check_name=(ImageView) findViewById(R.id.checkname);
        info=(ImageView) findViewById(R.id.checkdetail);
        update=(ImageView) findViewById(R.id.update);
        logout=(ImageView)findViewById(R.id.logout);
        appointment=(ImageView)findViewById(R.id.checklist);
appointment.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(AdminMain.this,ShowAppointment.class);
        startActivity(i);
    }
});

        check_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AdminMain.this,ShowData.class);
                startActivity(i);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AdminMain.this,Checkinfo.class);
                startActivity(i);
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AdminMain.this,UpdateDetail.class);
                startActivity(i);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AdminMain.this,AdminLogin.class);
                Toast.makeText(AdminMain.this,"Logout Successfuly",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });


    }
}
