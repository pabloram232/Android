package mx.edu.utng.pantalla;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private LinearLayout layPrincipal;
    private ImageButton btnSwitch;
    private Lienzo lienzo;

    private Apagado estadoInicial;
    private Pantalla pantalla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch=(ImageButton) findViewById(R.id.btn_switch);
        estadoInicial = new Apagado();
        pantalla = new Pantalla(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, pantalla);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                lienzo.setEstado(pantalla.getEstado());
                pantalla.presionarBoton();
                lienzo.invalidate();
            }
        });
    }
}
