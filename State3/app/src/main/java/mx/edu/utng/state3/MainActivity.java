package mx.edu.utng.state3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private LinearLayout layPrincipal;
    private ImageButton btnSwitch;
    private Lienzo lienzo;

    private Apagado estadoInicial;
    private Foco foco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch=(ImageButton) findViewById(R.id.btn_switch);
        estadoInicial = new Apagado();
        foco= new Foco(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, foco);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                lienzo.setEstado(foco.getEstado());
                foco.presionarBoton();
                lienzo.invalidate();
            }
        });
    }
}
