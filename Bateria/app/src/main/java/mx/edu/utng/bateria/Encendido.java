package mx.edu.utng.bateria;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by juan- on 12/09/2016.
 */
public class Encendido extends Control {
    @Override
    public void presionarSwitch(Bateria bateria, Canvas canvas) {
        bateria.setEstado(new Apagado());

        Paint paint1=new Paint();
        Path path1 = new Path();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.parseColor("#000000"));

        path1.moveTo(200,100);

        path1.lineTo(400,100);
        path1.lineTo(400,150);
        path1.lineTo(450,150);
        path1.lineTo(450,600);
        path1.lineTo(150,600);
        path1.lineTo(150,150);
        path1.lineTo(200,150);
        path1.lineTo(200,100);

        path1.close();

        canvas.drawPath(path1,paint1);

        Paint paint2=new Paint();
        Path path2 = new Path();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.parseColor("#00FF00"));


        path2.moveTo(200,200);
        path2.lineTo(400,200);
        path2.lineTo(400,250);
        path2.lineTo(200,250);
        path2.lineTo(200,200);

        path2.close();

        canvas.drawPath(path2, paint2);

        Paint paint3 = new Paint();
        Path path3 = new Path();
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.parseColor("#00FF00"));


        path3.moveTo(200,300);
        path3.lineTo(400,300);
        path3.lineTo (400,400);
        path3.lineTo(200,400);
        path3.lineTo (200,300);

        path3.close();

        canvas.drawPath(path3, paint3);

        Paint paint4 = new Paint();
        Path path4 = new Path();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(Color.parseColor("#00FF00"));


        path4.moveTo(200,450);
        path4.lineTo(400,450);
        path4.lineTo (400,550);
        path4.lineTo(200,550);
        path4.lineTo (200,450);

        path4.close();

        canvas.drawPath(path4, paint4);




    }
}


