package com.example.shobhitpc.vcare;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shobhit pc on 12-Jul-17.
 */

public class ShowData extends Activity {
    ArrayAdapter<String> madapter;
    ListView listtask;
    DBhelper dbh;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdata);
        listtask=(ListView)findViewById(R.id.show_list);
    dbh=new DBhelper(this);

        ArrayList<String> tasklist=dbh.getTaskList();
        if(madapter==null)
        {
            madapter=new ArrayAdapter<String>(this,R.layout.mylist,R.id.name,tasklist);

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


