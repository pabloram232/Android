package mx.edu.utng.pantalla;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by juan_ on 06/09/2016.
 */
public class Apagado extends Control{

    @Override
    public void presionarSwitch(Pantalla pantalla, Canvas canvas) {
        pantalla.setEstado(new Encendido());

        Paint paint1=new Paint();
        Path path1 = new Path();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.parseColor("#000000"));

        path1.moveTo(100,100);

        path1.lineTo(450,100);
        path1.lineTo(450,400);
        path1.lineTo(100,400);
        path1.lineTo(100,100);


        path1.close();

        canvas.drawPath(path1,paint1);

        Paint paint2=new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#FFFFFF"));


        path2.moveTo(150,150);
        path2.lineTo(400,150);
        path2.lineTo(400,350);
        path2.lineTo(150,350);
        path2.lineTo(150,150);

        path2.close();

        canvas.drawPath(path2, paint2);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.parseColor("#000000"));


        path3.moveTo(100,400);
        path3.lineTo(450,400);
        path3.lineTo (600,600);
        path3.lineTo(250,600);
        path3.lineTo (100,400);

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#848484"));


        path4.moveTo(200,450);
        path4.lineTo(450,450);
        path4.lineTo (500,550);
        path4.lineTo(250,550);
        path4.lineTo (200,450);

        path4.close();

        canvas.drawPath(path4, paint4);







    }
}



