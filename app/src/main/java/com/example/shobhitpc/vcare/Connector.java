package com.example.shobhitpc.vcare;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by shobhit pc on 10-Jul-17.
 */

public class Connector extends Activity {



    Context ct;
    public Connector(Context c)
    {

        ct=c;
    }
    public boolean isConnected()
    {
        ConnectivityManager connectivity=(ConnectivityManager)ct.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivity!=null)
        {
            NetworkInfo networkInfo=connectivity.getActiveNetworkInfo();
            if(networkInfo!=null)
            {
                if(networkInfo.getState()== NetworkInfo.State.CONNECTED)
                {
                    return  true;
                }
            }

        }
        return  false;
    }
}

