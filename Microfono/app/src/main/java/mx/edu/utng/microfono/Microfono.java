package mx.edu.utng.microfono;

/**
 * Created by PabloRam on 13/12/2016.
 */
public class Microfono implements Clonable {
    private int numero;
    private String marca;
    private String color;


public Microfono(){}

    public Microfono(int numero, String marca, String color) {
        this.numero = numero;
        this.marca = marca;
        this.color = color;
    }

    @Override
   public Clonable clonar(){
        Microfono clon=new Microfono(numero, marca,color);
        return  clon;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}