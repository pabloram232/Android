package mx.edu.utng.llave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumero;
    private EditText edtMarca;
    private EditText edtTamaño;
    private Button btnClonar;
    private GridView grvLlave;

    private ArrayList<Llave> llaves;
    private Llave llave;
    private LlaveAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = (EditText)findViewById(R.id.edt_numero);
        edtMarca = (EditText)findViewById(R.id.edt_marca);
        edtTamaño = (EditText)findViewById(R.id.edt_tamaño);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvLlave = (GridView) findViewById(R.id.grv_llaves);

        llaves= new ArrayList<Llave>();
        llave = new Llave();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llave.setNumero(Integer.parseInt(edtNumero.getText().toString()));
                llave.setMarca(edtMarca.getText().toString());
                llave.setTamaño(edtTamaño.getText().toString());


                Llave clon = (Llave)llave.clonar();
                llaves.add(clon);
                adapter = new LlaveAdapter(
                        MainActivity.this, llaves);
                grvLlave.setAdapter(adapter);

            }
        });


    }

}
