package mx.edu.utng.ram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.DataFormatException;


public class MainActivity extends AppCompatActivity {

    private EditText edtNumero;
    private EditText edtMarca;
    private EditText edtCapacidad;
    private Button btnClonar;
    private GridView grvRam;

    private ArrayList<Ram> rams;
    private Ram ram;
    private RamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = (EditText)findViewById(R.id.edt_numero);
        edtMarca = (EditText)findViewById(R.id.edt_marca);
        edtCapacidad = (EditText)findViewById(R.id.edt_capacidad);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvRam = (GridView) findViewById(R.id.grv_rams);

        rams= new ArrayList<Ram>();
        ram = new Ram();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ram.setNumero(Integer.parseInt(edtNumero.getText().toString()));
                ram.setMarca(edtMarca.getText().toString());
                ram.setCapacidad(Integer.parseInt(edtCapacidad.getText().toString()));


                Ram clon = (Ram)ram.clonar();
                rams.add(clon);
                adapter = new RamAdapter(
                        MainActivity.this, rams);
                grvRam.setAdapter(adapter);

            }
        });


    }
}