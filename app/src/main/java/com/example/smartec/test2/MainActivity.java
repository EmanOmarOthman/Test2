package com.example.smartec.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sumlibrary.SumClass;

public class MainActivity extends AppCompatActivity {

    SumClass sumClass=new SumClass();

    Button btn;
    EditText editText1;
    EditText editText2;
    TextView textView;

    int sum;

    int sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=(EditText) findViewById(R.id.editText1);
        editText2=(EditText) findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  x=Integer.parseInt(editText1.getText().toString());
                int y=Integer.parseInt(editText2.getText().toString());
                sum=sumClass.calculateSum(x,y);
                textView.setText(sum+"");

            }
        });


    }
}
