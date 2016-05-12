package mx.com.logydes.contactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShowUser extends AppCompatActivity {

    EditText etFecha;
    EditText etNombre;
    EditText etTelefono;
    EditText etEmail;
    EditText etDescripcion;

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);


        Bundle params = getIntent().getExtras();

        String Nombres = params.getString(getResources().getString(R.string.pNombre));
        String Telefono = params.getString(getResources().getString(R.string.pTelefono));
        String Email = params.getString(getResources().getString(R.string.pEmail));
        String Fecha = params.getString(getResources().getString(R.string.pFecha));
        String Descripcion = params.getString(getResources().getString(R.string.pDescripcion));

        etNombre = (EditText) findViewById(R.id.etNombre);
        etTelefono = (EditText) findViewById(R.id.etTelefono);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etFecha = (EditText) findViewById(R.id.etFecha);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);

        etNombre.setText(Nombres);
        etTelefono.setText(Telefono);
        etEmail.setText(Email);
        etFecha.setText(Fecha);
        etDescripcion.setText(Descripcion);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowUser.this,EditUser.class);
                startActivity(intent);
            }
        });


    }

}
