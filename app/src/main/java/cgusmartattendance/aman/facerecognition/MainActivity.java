package cgusmartattendance.aman.facerecognition;

import android.os.Bundle;

import com.atharvakale.facerecognition.R;
import com.atharvakale.facerecognition.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.navigation.ui.AppBarConfiguration;

public class MainActivity extends AppCompatActivity {
    Button Button;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button=(Button)findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
//              Intent intent=new Intent(MainActivity.this, com.atharvakale.facerecognition.MainActivity6.class);
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}