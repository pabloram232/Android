package mx.edu.utng.viaje01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtasiento;
    private EditText edtdestino;
    private EditText edtorigen;
    private Button btninsertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtasiento = (EditText)findViewById(R.id.edt_asiento);
        edtdestino = (EditText)findViewById(R.id.edt_destino);
        btninsertar = (Button)findViewById(R.id.btn_insertar);
        edtorigen=(EditText)findViewById(R.id.edt_origen);

        btninsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Viaje viaje = Viaje.getViaje();
                viaje.setDestino(edtdestino.getText().toString());
                Toast.makeText(MainActivity.this, "Destino: "+ viaje.getDestino(),
                        Toast.LENGTH_SHORT).show();
                viaje.setOrigen (edtorigen.getText().toString());
                Toast.makeText(MainActivity.this, "Origen: "+ viaje.getOrigen(),
                        Toast.LENGTH_SHORT).show();
                viaje.setAsiento(Integer.parseInt (edtasiento.getText().toString()));
                Toast.makeText(MainActivity.this, "Asiento: "+ viaje.getAsiento(),
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
}
