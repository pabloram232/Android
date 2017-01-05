package mx.edu.utng.figuras;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by PabloRam on 04/01/2017.
 */
public class Ganzo implements Figura  {
    @Override
    public void dibujar(Canvas canvas) {
        Paint pincel = new Paint();
        pincel.setColor(Color.argb(255, 240, 178, 72));
        pincel.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path = new Path();


        path.moveTo(130,156);
        canvas.drawLine(130,156,260,52,pincel);
        canvas.drawLine(260,52,390,52,pincel);
        canvas.drawLine(390,52,455,156,pincel);
        canvas.drawLine(455,156,455,260,pincel);
        canvas.drawLine(455,260,325,364,pincel);
        canvas.drawLine(325,364,455,364,pincel);
        canvas.drawLine(455,364,650,468,pincel);
        canvas.drawLine(650,468,700,468,pincel);
        canvas.drawLine(700,468,585,676,pincel);
        canvas.drawLine(585,676,455,676,pincel);
        canvas.drawLine(455,676,195,520,pincel);
        canvas.drawLine(195,520,195,364,pincel);
        canvas.drawLine(195,364,325,260,pincel);
        canvas.drawLine(325,260,325,156,pincel);
        canvas.drawLine(325,156,130,156,pincel);
        canvas.drawLine(325,156,195,104,pincel);
        canvas.drawLine(455,676,455,728,pincel);
        canvas.drawLine(585,676,650,728,pincel);
        canvas.drawLine(650,728,260,728,pincel);
        canvas.drawLine(260,728,325,780,pincel);
        canvas.drawLine(325,780,455,728,pincel);
        canvas.drawLine(455,728,520,780,pincel);
        canvas.drawLine(520,780,650,720,pincel);
        canvas.drawLine(260,52,260,104,pincel);
        canvas.drawLine(260,104,325,104,pincel);
        canvas.drawLine(325,104,260,52,pincel);
        path.close();
        canvas.drawPath(path, pincel);




    }
    }
