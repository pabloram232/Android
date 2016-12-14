package mx.edu.utng.llanta;

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
    private EditText edtCapacidad;
    private Button btnClonar;
    private GridView grvLlanta;

    private ArrayList<Llanta> llantas;
    private Llanta llanta;
    private LlantaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = (EditText)findViewById(R.id.edt_numero);
        edtMarca = (EditText)findViewById(R.id.edt_marca);
        edtCapacidad = (EditText)findViewById(R.id.edt_tamaño);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvLlanta = (GridView) findViewById(R.id.grv_llantas);

        llantas= new ArrayList<Llanta>();
        llanta = new Llanta();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llanta.setNumero(Integer.parseInt(edtNumero.getText().toString()));
                llanta.setMarca(edtMarca.getText().toString());
                llanta.setTamaño(edtCapacidad.getText().toString());


                Llanta clon = (Llanta)llanta.clonar();
                llantas.add(clon);
                adapter = new LlantaAdapter(
                        MainActivity.this, llantas);
                grvLlanta.setAdapter(adapter);

            }
        });


    }
}
