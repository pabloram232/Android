package mx.edu.utng.ram;

/**
 * Created by PabloRam on 13/12/2016.
 */
public class Ram implements Clonable {
    private int numero;
    private String marca;
    private int capacidad;

    public Ram(){}

    public Ram(String marca, int numero, int capacidad) {
        this.marca = marca;
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public Clonable clonar() {
        Ram clon =
                new Ram(marca, numero, capacidad);
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
