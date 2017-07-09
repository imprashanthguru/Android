package com.example.rohit.accountcreationapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class AccountCreationActivity extends AppCompatActivity {
    char gender;
    private EditText e1,e2,e3,e4,e5,e6;
  //  private RadioButton r=new RadioButton(this);
    private boolean b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creation);

    }

    public void onRadioButtonclicked(View view)
    {

        b=((RadioButton ) view).isChecked();
        switch (view.getId())
        {
            case R.id.Male_RB_ID:
                if(b)
                {
                    gender='M';
                }
                break;
            case R.id.Female_RB_ID:
                if(b)
                {
                    gender='F';
                }
                break;

        }
    }



    public void onButtonClick(View view)
    {
        e1=(EditText) findViewById(R.id.First_Name_ID);
        String fname= e1.getText().toString();
        e2=(EditText) findViewById(R.id.Last_Name_ID);
        String lname=e2.getText().toString();

       // r=(RadioButton) findViewById(R.id.Male_RB_ID);

        e3=(EditText) findViewById(R.id.EmailId_ID);
        String eid=e3.getText().toString();

        e4=(EditText) findViewById(R.id.Number_ID);
        String num=e4.getText().toString();

      //  Display(fname, lname, eid, num);

        e5=(EditText) findViewById(R.id.Password1_ID);
        String p1=e5.getText().toString();

        e6=(EditText) findViewById(R.id.Password2_ID);
        String p2=e6.getText().toString();
       // onRadioButtonclicked(view);
       if(p1.equals(p2))
            Display(fname, lname, eid, num,gender);


    }       //end of function onButtonClick






    private void Display(String fname,String lname,String eid,String num,char gender)
    {
        TextView t=(TextView) findViewById(R.id.details_ID);

        t.setTextSize(14);

        String name="\nName       :     " + fname + " " + lname;
        t.setText(name);
        String email="\nEmail-ID  :     " + eid;
        t.append(email);
        String n="\nNumber   :     " + num;
        t.append(n);
        t.append("\nGender   :     " + gender);
       // t.setText(" Name: " + fname + " " + lname);
       /* Log.v("AccountCreationActivity","Name: "+ name);


*/
    }

}
