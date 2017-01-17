package mx.edu.utng.rectangulo;


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
    private Rectangulo rectangulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnSwitch=(ImageButton) findViewById(R.id.btn_switch);
        estadoInicial = new Apagado();
        rectangulo = new Rectangulo(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, rectangulo);
        layPrincipal.addView(lienzo);

        btnSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                lienzo.setEstado(rectangulo.getEstado());
                rectangulo.presionarBoton();
                lienzo.invalidate();
            }
        });
    }
}
