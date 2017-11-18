package com.example.shobhitpc.vcare;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by shobhit pc on 12-Jul-17.
 */

public class MedicationList extends Activity {
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicationlist);
        btn=(Button)findViewById(R.id.save_list);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MedicationList.this,"Saved Successfuly",Toast.LENGTH_LONG).show();
            }
        });


    }




}
