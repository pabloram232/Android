package mx.edu.utng.viaje01;

/**
 * Created by TICLAB1 on 29/08/2016.
 */
public class Viaje {
    private int asiento;
    private String destino;
    private String origen;
    private  static  Viaje viaje;

    private Viaje(){
        this.asiento=0;
        this.destino="";
        this.origen="";

    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }



    public static Viaje getViaje(){
        if(viaje==null){
            viaje = new Viaje();
        }
        return viaje;


    }

}
