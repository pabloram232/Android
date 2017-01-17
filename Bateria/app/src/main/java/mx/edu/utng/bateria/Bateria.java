package mx.edu.utng.bateria;

import android.graphics.Canvas;

/**
 * Created by juan- on 11/09/2016.
 */
public class Bateria {

    private Control estado;
    private Canvas canvas;

    public Bateria(Control estado){
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

