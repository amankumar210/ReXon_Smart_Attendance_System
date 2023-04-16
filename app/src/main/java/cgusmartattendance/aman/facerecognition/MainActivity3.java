package cgusmartattendance.aman.facerecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.atharvakale.facerecognition.R;

public class MainActivity3 extends AppCompatActivity {
    Button Buttton5;
    Button Buttton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Buttton5=(Button)findViewById(R.id.button5);
        Buttton2=(Button)findViewById(R.id.button2);
        Buttton5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(intent);
            }
        });
        Buttton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i= new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
    }
}