package mx.edu.utng.rectangulo;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by juan- on 11/09/2016.
 */
public class Lienzo extends View{
    private Control estado;
    private Rectangulo rectangulo;
    public Lienzo(Context context, Control estado, Rectangulo rectangulo){
        super(context);
        this.estado=estado;
        this.rectangulo = rectangulo;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && rectangulo != null){
            rectangulo.setCanvas(canvas);
            estado.presionarSwitch(rectangulo,canvas);
        }
    }

    public Rectangulo getTv() {
        return rectangulo;
    }

    public void setTv(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    public Control getEstado() {
        return estado;
    }
    public void setEstado(Control estado) {
        this.estado = estado;
    }
}
