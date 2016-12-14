package mx.edu.utng.llanta;

/**
 * Created by PabloRam on 13/12/2016.
 */
public class Llanta implements Clonable{

    private int numero;
    private String marca;
    private String tamaño;

    public Llanta(){}

    public Llanta(int numero, String marca, String tamaño) {
        this.numero = numero;
        this.marca = marca;
        this.tamaño = tamaño;
    }
    @Override
    public Clonable clonar() {
        Llanta clon =
                new Llanta ( numero,marca, tamaño);
        return clon;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
