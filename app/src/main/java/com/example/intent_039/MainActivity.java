package com.example.intent_039;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "boton Presionado",Toast.LENGTH_LONG);
                makeIntent();
            }
        });

    }


    private void makeIntent() {

        Intent mIntent = new Intent(this, MainActivity2.class);
        startActivity(mIntent);

    }


    @Override
    protected void onStart() {

        super.onStart();
        Log.d(TAG,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "OnResume");
    }
    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG,"OnPause");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnDestroy");
    }
}