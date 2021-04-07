package com.example.pis_project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class imageCreatorActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imageView;
    private ImageButton open_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_creator);
        toolbar=findViewById(R.id.appToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Nota de imagen");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        /*
         * Métodos para acceder a la cámara
         */

        /*
        //Asignamos variables
        imageView = findViewById(R.id.cameraView);
        open_button = findViewById(R.id.cameraButton);
        //Pedimos permisos de la cámara
        if(ContextCompat.checkSelfPermission(imageCreatorActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(imageCreatorActivity.this, new String[] {Manifest.permission.CAMERA}, 100);
        }
        open_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abrir cámara
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 100);
            }
        });

         */
    }
/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100 && data != null) {
            //Capturamos imagen
            Bitmap captureImage = (Bitmap) data.getExtras().get("data");
            //Llevamos la imagen a cameraView
            imageView.setImageBitmap(captureImage);
            Intent intent = new Intent(imageCreatorActivity.this, imageViewActivity.class);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.image_menu, menu);
        return true;
    }

 */
}
