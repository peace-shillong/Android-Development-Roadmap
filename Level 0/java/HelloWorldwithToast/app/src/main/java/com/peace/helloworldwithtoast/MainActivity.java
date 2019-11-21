package com.peace.helloworldwithtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
    }

    public void toastHello(View view) {
        Toast.makeText(this,"Hello "+et.getText(),Toast.LENGTH_SHORT).show();
    }
}
