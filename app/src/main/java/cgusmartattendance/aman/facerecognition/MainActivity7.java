package cgusmartattendance.aman.facerecognition;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;
import android.widget.Toast;

import com.atharvakale.facerecognition.R;
import com.google.android.gms.tasks.OnSuccessListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity7 extends AppCompatActivity {
    TextView textViewname1;
    TextView textViewdate1;
    TextView textViewtime1;

    @SuppressLint("SetTextI18n")
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textViewname1 = (TextView) findViewById(R.id.textViewname1);
        textViewdate1 = (TextView) findViewById(R.id.textViewdate1);
        textViewtime1 = (TextView) findViewById(R.id.textViewtime1);

        Intent intent = getIntent();
        String strName = intent.getStringExtra("myName");
        String myCurrentTime = intent.getStringExtra("myCurrentTime");
        String myCurrentDate = intent.getStringExtra("myCurrentDate");

        textViewname1.setText(strName);
        textViewtime1.setText(myCurrentTime);
        textViewdate1.setText(myCurrentDate);
    }
}