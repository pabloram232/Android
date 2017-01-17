package mx.edu.utng.pinata;

/**
 * Created by PabloRam on 13/12/2016.
 */
public class Pinata implements Clonable {
    private int numeroPicos;
    private String material;
    private String tamaño;


public Pinata(){}

    public Pinata(int numero, String material, String tamaño) {
        this.numeroPicos = numeroPicos;
        this.material = material;
        this.tamaño = tamaño;
    }

    @Override
   public Clonable clonar(){
        Pinata clon=new Pinata(numeroPicos, material,tamaño);
        return  clon;
    }

    public int getNumeroPicos() {
        return numeroPicos;
    }

    public void setNumeroPicos(int numeroPicos) {
        this.numeroPicos = numeroPicos;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}