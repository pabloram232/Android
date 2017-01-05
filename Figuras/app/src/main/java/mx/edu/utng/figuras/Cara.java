package mx.edu.utng.figuras;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by PabloRam on 29/12/2016.
 */
public class Cara implements Figura {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        pincel.setColor(Color.argb(255, 240, 178, 72));
        pincel.setStyle(Paint.Style.FILL);
        Path path = new Path();
         path = new Path();


        path.moveTo(50,50);
        canvas.drawLine(50,50,350,50,pincel);
        canvas.drawLine(350,50,400,150,pincel);
        canvas.drawLine(400,150,500,150,pincel);
        canvas.drawLine(500,150,400,200,pincel);
        canvas.drawLine(400,200,450,300,pincel);
        canvas.drawLine(450,300,400,300,pincel);
        canvas.drawLine(400,300,400,400,pincel);
        canvas.drawLine(400,400,350,450,pincel);
        canvas.drawLine(350,450,300,450,pincel);
        canvas.drawLine(300,450,300,500,pincel);
        canvas.drawLine(300,500,150,500,pincel);
        canvas.drawLine(150,500,150,450,pincel);
        canvas.drawLine(150,450,100,400,pincel);
        canvas.drawLine(100,400,100,350,pincel);
        canvas.drawLine(100,350,50,300,pincel);
        canvas.drawLine(50,300,50,50,pincel);

        canvas.drawLine(50,150,400,150,pincel);

        canvas.drawLine(300,150,400,200,pincel);

        canvas.drawLine(100,350,100,300,pincel);
        canvas.drawLine(100,300,150,300,pincel);
        canvas.drawLine(150,300,150,200,pincel);
        canvas.drawLine(150,200,200,200,pincel);
        canvas.drawLine(200,200,200,250,pincel);
        canvas.drawLine(200,250,250,300,pincel);
        canvas.drawLine(250,300,250,150,pincel);


        canvas.drawLine(350,200,350,250,pincel);
        canvas.drawLine(350,250,300,250,pincel);
        canvas.drawLine(300,250,350,200,pincel);








        path.close();
        canvas.drawPath(path, pincel);






    }
}
