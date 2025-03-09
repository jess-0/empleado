public class Empleado{
    private String nombre; //inicializando atributos de la clase 
    private float sueldo;
    private int yearServicio;
    //lector 
    public String getNombre(){
        return nombre;
    }
    public float getSueldo(){
        return sueldo;
    }
    public int getYearServicio(){
        return yearServicio;
    }
    //modificador
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSueldo( float sueldo){
        this.sueldo=sueldo;
    }
    public void setYearServicio(int yearServicio){
        this.yearServicio=yearServicio;
    }
    //constructor
    public Empleado(String nombre, float sueldo, int yearServicio){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.yearServicio=yearServicio;
    }


}