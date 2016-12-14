package mx.edu.utng.cancion01;

/**
 * Created by PabloRam on 19/09/2016.
 */
public class Cancion {
    private String nombre;
    private String autor;
    private int duracion;
    private  static Cancion cancion;

    private Cancion() {
        this.nombre = "";
        this.autor = "";
        this.duracion = 0;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public static void setCancion(Cancion cancion) {
        Cancion.cancion = cancion;
    }


    public static Cancion getCancion(){
        if(cancion==null){
            cancion = new Cancion();
        }
        return cancion;


    }
}
