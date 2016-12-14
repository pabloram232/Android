package mx.edu.utng.microfono;

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
    private EditText edtColor;
    private Button btnClonar;
    private GridView grvMicrofono;

    private ArrayList<Microfono> microfonos;
    private Microfono microfono;
    private MicrofonoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = (EditText)findViewById(R.id.edt_numero);
        edtMarca = (EditText)findViewById(R.id.edt_marca);
        edtColor = (EditText)findViewById(R.id.edt_color);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvMicrofono = (GridView) findViewById(R.id.grv_microfonos);

        microfonos= new ArrayList<Microfono>();
        microfono = new Microfono();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                microfono.setNumero(Integer.parseInt(edtNumero.getText().toString()));
                microfono.setMarca(edtMarca.getText().toString());
                microfono.setColor(edtColor.getText().toString());


                Microfono clon = (Microfono)microfono.clonar();
                microfonos.add(clon);
                adapter = new MicrofonoAdapter(
                        MainActivity.this, microfonos);
                grvMicrofono.setAdapter(adapter);

            }
        });


    }

}
