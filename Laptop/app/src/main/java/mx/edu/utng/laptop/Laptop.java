package mx.edu.utng.laptop;

/**
 * Created by PabloRam on 19/09/2016.
 */
public class Laptop {
    private String marca;
    private String ram;
    private  String procesador;
    private String discoDuro;
    private  static  Laptop laptop;

    private Laptop(){
        this.marca="";
        this.ram="";
        this.procesador="";
        this.discoDuro="";

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }



    public static void setLaptop(Laptop laptop) {
        Laptop.laptop = laptop;
    }
    public static Laptop getLaptop(){
        if(laptop==null){
            laptop = new Laptop();
        }
        return laptop;


    }
}
