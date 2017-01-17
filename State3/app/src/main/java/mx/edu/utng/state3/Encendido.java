package mx.edu.utng.state3;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
/**
 * Created by juan- on 12/09/2016.
 */
public class Encendido extends Control {
    @Override
    public void presionarSwitch(Foco foco, Canvas canvas) {
        foco.setEstado(new Apagado());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        float mitadX = canvas.getWidth()/2;
        float mitadY = canvas.getHeight()/2;
        paint.setColor(Color.GREEN);
        canvas.drawCircle((canvas.getWidth() / 2), (canvas.getHeight() / 2), 100, paint);
    }
}
