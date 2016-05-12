package mx.com.logydes.contactos;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditUser extends AppCompatActivity {

    private DialogFragment newFragment = new DatePickerFragment();

    EditText etFecha;
    Button btnFecha;

    EditText etNombre;
    EditText etTelefono;
    EditText etEmail;
    EditText etDescripcion;

    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);

        etNombre      = (EditText) findViewById(R.id.etNombre);
        etTelefono    = (EditText) findViewById(R.id.etTelefono);
        etFecha       = (EditText) findViewById(R.id.etFecha);
        etEmail       = (EditText) findViewById(R.id.etEmail);
        etDescripcion = (EditText) findViewById(R.id.etDescripcion);


        btnFecha = (Button) findViewById(R.id.btnFecha);
        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newFragment.show(getSupportFragmentManager(), "etFecha");
            }
        });

        btnShow = (Button) findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EditUser.this,ShowUser.class);
                intent.putExtra( getResources().getString(R.string.pNombre), etNombre.getText().toString() );
                intent.putExtra( getResources().getString(R.string.pFecha), etFecha.getText().toString() );
                intent.putExtra( getResources().getString(R.string.pTelefono), etTelefono.getText().toString() );
                intent.putExtra( getResources().getString(R.string.pEmail), etEmail.getText().toString() );
                intent.putExtra( getResources().getString(R.string.pDescripcion), etDescripcion.getText().toString() );
                startActivity(intent);
                finish();

            }
        });

    }

}
