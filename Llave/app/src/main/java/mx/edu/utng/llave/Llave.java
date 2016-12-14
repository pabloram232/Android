package mx.edu.utng.llave;

/**
 * Created by PabloRam on 14/12/2016.
 */
public class Llave implements Clonable {

    private int numero;
    private String marca;
    private  String tamaño;
            public Llave(){}


    public Llave(int numero, String marca, String tamaño) {
        this.numero = numero;
        this.marca = marca;
        this.tamaño = tamaño;
    }
    @Override
    public Clonable clonar() {
        Llave clon =
                new Llave( numero, marca,tamaño);
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
