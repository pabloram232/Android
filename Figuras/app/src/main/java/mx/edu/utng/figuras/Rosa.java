package mx.edu.utng.figuras;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by PabloRam on 04/01/2017.
 */
public class Rosa  implements Figura  {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        //pincel.setColor(Color.argb(255, 240, 178, 72));
        pincel.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path = new Path();

        path.moveTo(100,50);

        canvas.drawLine(100,50,150,100,pincel);
        canvas.drawLine(150,100,250,50,pincel);
        canvas.drawLine(250,50,350,100,pincel);
        canvas.drawLine(350,100,400,50,pincel);
        canvas.drawLine(400,50,400,200,pincel);
        canvas.drawLine(400,200,350,250,pincel);
        canvas.drawLine(350,250,150,250,pincel);
        canvas.drawLine(150,250,100,200,pincel);
        canvas.drawLine(100,200,100,50,pincel);

        canvas.drawLine(300,250,250,300,pincel);
        canvas.drawLine(250,300,200,250,pincel);

        canvas.drawLine(250,300,250,600,pincel);

        canvas.drawLine(250,450,350,350,pincel);
        canvas.drawLine(350,350,400,350,pincel);
        canvas.drawLine(400,350,400,400,pincel);
        canvas.drawLine(400,400,300,500,pincel);
        canvas.drawLine(300,500,250,500,pincel);
        canvas.drawLine(400,350,250,500,pincel);

        canvas.drawLine(250,400,200,350,pincel);
        canvas.drawLine(200,350,150,350,pincel);
        canvas.drawLine(150,350,150,400,pincel);
        canvas.drawLine(150,400,200,450,pincel);
        canvas.drawLine(200,450,250,450,pincel);
        canvas.drawLine(250,450,150,350,pincel);


        path.close();
        canvas.drawPath(path, pincel);

    }
}

