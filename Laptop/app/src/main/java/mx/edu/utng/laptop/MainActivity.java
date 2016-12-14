package mx.edu.utng.laptop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtmarca;
    private EditText edtram;
    private EditText edtprocesador;
    private EditText edtdiscoDuro;
    private Button btninsertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtmarca = (EditText)findViewById(R.id.edt_marca);
        edtram = (EditText)findViewById(R.id.edt_ram);
        btninsertar = (Button)findViewById(R.id.btn_insertar);
        edtprocesador=(EditText)findViewById(R.id.edt_procesador);
        edtdiscoDuro=(EditText)findViewById(R.id.edt_discoDuro);

        btninsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Laptop laptop = Laptop.getLaptop();
                laptop.setMarca(edtmarca.getText().toString());
                laptop.setRam(edtram.getText().toString());
                laptop.setProcesador(edtprocesador.getText().toString());
                laptop.setDiscoDuro(edtdiscoDuro.getText().toString());

                Toast.makeText(MainActivity.this, "lAPTOP: "
                                +"\nMarca: "+laptop.getMarca()
                                +"\nRAM: "+laptop.getProcesador()
                                +"\nProcesador: "+laptop.getRam()
                                +"\nDisco Duro: "+laptop.getDiscoDuro(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
