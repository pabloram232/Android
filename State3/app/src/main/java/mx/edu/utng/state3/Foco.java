package mx.edu.utng.state3;

import android.graphics.Canvas;

/**
 * Created by juan- on 11/09/2016.
 */
public class Foco {

    private Control estado;
    private Canvas canvas;

    public Foco(Control estado){
        this.estado=estado;
    }

    public  void presionarBoton(){
        estado.presionarSwitch(this,canvas);
    }
    public Control getEstado() {
        return estado;
    }

    public void setEstado(Control estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }




}

