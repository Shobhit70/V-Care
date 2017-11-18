package com.example.shobhitpc.vcare;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by shobhit pc on 25-Aug-17.
 */

public class ShowAppointment extends Activity {
    ArrayAdapter<String> madapter;
    ListView listtask;
    Mydb mdb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_appintment);
        listtask=(ListView)findViewById(R.id.show_list1);
        mdb=new Mydb(this);

        ArrayList<String> tasklist=mdb.getTaskList();
        if(madapter==null)
        {
            madapter=new ArrayAdapter<String>(this,R.layout.namelist,R.id.name1,tasklist);

            listtask.setAdapter(madapter);

        }
        else
        {
            madapter.clear();
            madapter.addAll(tasklist);
            madapter.notifyDataSetChanged();
        }

    }




}

