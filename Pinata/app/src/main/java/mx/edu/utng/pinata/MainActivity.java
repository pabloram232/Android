package mx.edu.utng.pinata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private EditText edtNumeroPicos;
    private EditText edtMaterial;
    private EditText edtTamaño;
    private Button btnClonar;
    private GridView grvPinata;

    private ArrayList<Pinata> pinatas;
    private Pinata pinata;
    private PinataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumeroPicos = (EditText)findViewById(R.id.edt_numeroPicos);
        edtMaterial = (EditText)findViewById(R.id.edt_material);
        edtTamaño = (EditText)findViewById(R.id.edt_tamaño);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvPinata = (GridView) findViewById(R.id.grv_pinatas);

        pinatas = new ArrayList<Pinata>();
        pinata = new Pinata();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pinata.setNumeroPicos(Integer.parseInt(edtNumeroPicos.getText().toString()));
                pinata.setMaterial(edtMaterial.getText().toString());
                pinata.setTamaño(edtTamaño.getText().toString());


                Pinata clon = (Pinata) pinata.clonar();
                pinatas.add(clon);
                adapter = new PinataAdapter(
                        MainActivity.this, pinatas);
                grvPinata.setAdapter(adapter);

            }
        });


    }

}
