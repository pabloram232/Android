package mx.edu.utng.figuras;

import android.content.Context;
import android.graphics.Canvas;

/**
 * Created by qas on 12/02/16.
 */
public class FiguraFactory {
    private Figura figura;


    public Figura crearFigura(String tipo){
        if(tipo==null){
            return null;
        }
        if(tipo.equalsIgnoreCase("CIRCULO")){
            return new Circulo();
        }else  if(tipo.equalsIgnoreCase("RECTANGULO")){
            return new Rectangulo();
        }else if(tipo.equalsIgnoreCase("CUADRADO")){
            return new Cuadrado();
        }else if(tipo.equalsIgnoreCase("ESTRELLA")){
            return new Estrella();
        }else if(tipo.equalsIgnoreCase("CARA")){
                return new Cara();
        }else if(tipo.equalsIgnoreCase("GANZO")){
            return new Ganzo();
        }else if(tipo.equalsIgnoreCase("Castillo")){
            return new Castillo();
        }else if(tipo.equalsIgnoreCase("Rosa")){
            return new Rosa();
        }else if(tipo.equalsIgnoreCase("TRIANGULO")){
            return new Triangulo();
        }
        return null;
    }
}
