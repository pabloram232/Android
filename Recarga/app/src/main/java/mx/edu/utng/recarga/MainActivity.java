package mx.edu.utng.recarga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edtnumero;
    private EditText edtcantidad;
    private EditText edtcompañia;
    private Button btninsertar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    edtnumero = (EditText)findViewById(R.id.edt_numero);
    edtcantidad = (EditText)findViewById(R.id.edt_cantidad);
    btninsertar = (Button)findViewById(R.id.btn_insertar);
    edtcompañia=(EditText)findViewById(R.id.edt_compañia);


    btninsertar.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Recarga recarga = Recarga.getRecarga();
            recarga.setNumero(Integer.parseInt(edtnumero.getText().toString()));
            recarga.setCantidad(Integer.parseInt(edtcantidad.getText().toString()));
            recarga.setCompañia(edtcompañia.getText().toString());


            Toast.makeText(MainActivity.this, "   RECARGA   "
                            +"\nNumero: "+recarga.getNumero()
                            +"\nCantidad: "+recarga.getCantidad()
                            +"\nCompañia: "+recarga.getCompañia(),

                    Toast.LENGTH_SHORT).show();
        }
    });

}
}
