package com.example.shobhitpc.vcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by shobhit pc on 10-Jul-17.
 */

public class AdminLogin extends Activity {
    EditText admin_name,admin_password;
    Button signup;
    String name,pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);
        admin_name=(EditText)findViewById(R.id.username_admin);
        admin_password=(EditText)findViewById(R.id.password_admin);
        signup=(Button)findViewById(R.id.signin_admin);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              name=admin_name.getText().toString();
                pass=admin_password.getText().toString();
                if(name.equals("admin")&&pass.equals("admin123"))
                {
                    Toast.makeText(AdminLogin.this,"Login successfuly as Admin",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(AdminLogin.this,AdminMain.class);
                    startActivity(i);

                }
               else
                {
                    Toast.makeText(AdminLogin.this,"Wrong Credentials",Toast.LENGTH_SHORT).show();
                }



            }
        });




    }
}
