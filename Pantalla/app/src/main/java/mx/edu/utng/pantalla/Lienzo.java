package mx.edu.utng.pantalla;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by juan- on 11/09/2016.
 */
public class Lienzo extends View{
    private Control estado;
    private Pantalla pantalla;
    public Lienzo(Context context, Control estado, Pantalla pantalla){
        super(context);
        this.estado=estado;
        this.pantalla = pantalla;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && pantalla != null){
            pantalla.setCanvas(canvas);
            estado.presionarSwitch(pantalla,canvas);
        }
    }

    public Pantalla getTv() {
        return pantalla;
    }

    public void setTv(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Control getEstado() {
        return estado;
    }
    public void setEstado(Control estado) {
        this.estado = estado;
    }
}
