package modelo;

public class Rutina {
    //Atributos
    private int dia;
    private String nombreEjercicio;
    private int cantidadSerie;
    private String cantidadRepeticiones;
    private int tiempoDescanso; //Esta en segundos
    

    // Constructor
    public Rutina(int dia, String nombreEjercicio,int cantidadSerie,String cantidadRepeticiones,int tiempoDescanso){
        this.dia= dia;
        this.nombreEjercicio= nombreEjercicio;
        this.cantidadSerie= cantidadSerie;
        this.cantidadRepeticiones = cantidadRepeticiones;
        this.tiempoDescanso= tiempoDescanso;
    }

    //Metodos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


}
