package mx.edu.utng.recarga;

/**
 * Created by PabloRam on 19/09/2016.
 */
public class Recarga {
    private int numero;
    private int cantidad;
    private  String compañia;
    private  static  Recarga recarga;

    private Recarga(){
        this.numero=0;
        this.cantidad=0;
        this.compañia="";


    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public static void setRecarga(Recarga recarga) {
        Recarga.recarga = recarga;
    }
    public static Recarga getRecarga(){
        if(recarga==null){
            recarga = new Recarga();
        }
        return recarga;


    }
}
