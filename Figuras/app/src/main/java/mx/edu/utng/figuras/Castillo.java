package mx.edu.utng.figuras;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by PabloRam on 04/01/2017.
 */
public class Castillo  implements Figura  {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        //pincel.setColor(Color.argb(255, 240, 178, 72));
        pincel.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path = new Path();

        path.moveTo(50,180);

        canvas.drawLine(300,720,300,540,pincel);
        canvas.drawLine(300,540,350,480,pincel);
        canvas.drawLine(350,480,400,540,pincel);
        canvas.drawLine(400,540,400,720,pincel);
        canvas.drawLine(350,480,350,720,pincel);

        canvas.drawLine(50,180,150,60,pincel);
        canvas.drawLine(150,60,250,180,pincel);
        canvas.drawLine(500,180,600,60,pincel);
        canvas.drawLine(600,60,700,180,pincel);
        canvas.drawLine(700,180,50,180,pincel);
        canvas.drawLine(50,180,50,720,pincel);
        canvas.drawLine(50,720,700,720,pincel);
        canvas.drawLine(700,720,700,180,pincel);

        canvas.drawLine(100,240,200,240,pincel);
        canvas.drawLine(200,240,200,360,pincel);
        canvas.drawLine(200,360,100,360,pincel);
        canvas.drawLine(100,360,100,240,pincel);

        canvas.drawLine(650,240,650,360,pincel);
        canvas.drawLine(650,360,550,360,pincel);
        canvas.drawLine(550,360,550,240,pincel);
        canvas.drawLine(550,240,650,240,pincel);

        canvas.drawLine(250,180,250,420,pincel);
        canvas.drawLine(250,420,300,420,pincel);
        canvas.drawLine(300,420,300,360,pincel);
        canvas.drawLine(300,360,350,360,pincel);
        canvas.drawLine(350,360,350,420,pincel);
        canvas.drawLine(350,420,400,420,pincel);
        canvas.drawLine(400,420,400,360,pincel);
        canvas.drawLine(400,360,450,360,pincel);
        canvas.drawLine(450,360,450,420,pincel);
        canvas.drawLine(450,420,500,420,pincel);
        canvas.drawLine(500,420,500,180,pincel);





        path.close();
        canvas.drawPath(path, pincel);




    }
}
