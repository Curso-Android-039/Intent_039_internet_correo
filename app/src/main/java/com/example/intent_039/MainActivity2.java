package com.example.intent_039;

import android.content.Intent;
import android.net.Uri;
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

public class MainActivity2 extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.internet);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "http://www.youtube.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("url"));
                startActivity(intent);
            }
        }); // cierre button internet

           button2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   enviarCorreo();
               }
           });


    }

    public void enviarCorreo(){

// CREAR INTENT PARA ENVIAR CORREO ELECTRONICO

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");
        // Especificar el destinatario(s), asunto y cuerpo del correo directamente en el método
        emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"correo@atencionalcliente.cl"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Asunto del correo");
        emailIntent.putExtra(Intent.EXTRA_TEXT,"Este es el cuerpo del correo");
        try{

        startActivity(Intent.createChooser(emailIntent,"Enviar correo usando"));

        }catch(android.content.ActivityNotFoundException ex){

            Toast.makeText(MainActivity2.this,"no hay aplicaciones de correo instaladas",Toast.LENGTH_LONG).show();
        }

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