package mx.edu.utng.state3;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by juan- on 11/09/2016.
 */
public class Lienzo extends View{
    private Control estado;
    private Foco foco;
    public Lienzo(Context context, Control estado, Foco foco){
        super(context);
        this.estado=estado;
        this.foco=foco;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && foco != null){
            foco.setCanvas(canvas);
            estado.presionarSwitch(foco,canvas);
        }
    }

    public Foco getTv() {
        return foco;
    }

    public void setTv(Foco foco) {
        this.foco = foco;
    }

    public Control getEstado() {
        return estado;
    }
    public void setEstado(Control estado) {
        this.estado = estado;
    }
}
