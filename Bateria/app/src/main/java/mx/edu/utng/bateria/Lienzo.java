package mx.edu.utng.bateria;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by juan- on 11/09/2016.
 */
public class Lienzo extends View{
    private Control estado;
    private Bateria bateria;
    public Lienzo(Context context, Control estado, Bateria bateria){
        super(context);
        this.estado=estado;
        this.bateria = bateria;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && bateria != null){
            bateria.setCanvas(canvas);
            estado.presionarSwitch(bateria,canvas);
        }
    }

    public Bateria getTv() {
        return bateria;
    }

    public void setTv(Bateria bateria) {
        this.bateria = bateria;
    }

    public Control getEstado() {
        return estado;
    }
    public void setEstado(Control estado) {
        this.estado = estado;
    }
}
