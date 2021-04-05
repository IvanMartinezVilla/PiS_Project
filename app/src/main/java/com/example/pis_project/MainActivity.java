package com.example.pis_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_image_creator);
        toolbar=findViewById(R.id.appToolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bloc de notas");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        //inflater.inflate(R.menu.image_menu, menu);
        return true;
    }

    /*
     *
     * @param item
     * Mensaje de confirmación paraa eliminar una nota
     */
    public void showDeleteDialog (MenuItem item) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Confirmación");
        alert.setTitle("Seguro que quieres eliminar esta nota?");

        alert.setPositiveButton("Eliminar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Nota eliminada", Toast.LENGTH_SHORT).show();
            }
        });

        alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Operación Cancelada", Toast.LENGTH_SHORT).show();
            }
        });

        alert.create().show();
    }

}