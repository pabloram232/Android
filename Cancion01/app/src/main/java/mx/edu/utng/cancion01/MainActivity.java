package mx.edu.utng.cancion01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edtnombre;
    private EditText edtautor;
    private EditText edtduracion;
    private Button btninsertar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    edtnombre = (EditText)findViewById(R.id.edt_nombre);
    edtautor = (EditText)findViewById(R.id.edt_autor);
    btninsertar = (Button)findViewById(R.id.btn_insertar);
    edtduracion=(EditText)findViewById(R.id.edt_duracion);


    btninsertar.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Cancion cancion = Cancion.getCancion();
            cancion.setNombre(edtnombre.getText().toString());
            cancion.setAutor(edtautor.getText().toString());
            cancion.setDuracion(Integer.parseInt(edtduracion.getText().toString()));


            Toast.makeText(MainActivity.this, "   Cancion   "
                            +"\nNombre: "+cancion.getNombre()
                            +"\nAutor: "+cancion.getAutor()
                            +"\nDuracion: "+cancion.getDuracion(),

                    Toast.LENGTH_SHORT).show();
        }
    });

}
}
