package Demostracion;

public class Estudiante extends Notas{
    int carnet;
    String nombre;
    String apellido;
    int edad;
    
    public Estudiante(){
    }

    public Estudiante(int carnet, String nombre, String apellido, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String info_studiante(){
        String name = "";
        name = this.nombre + " " + this.apellido;
        return name;
    }
  
    public String info_studuante(String a, String b){
        String name = "";
        name = a + " " + b;
        return name;
    }
    
    public String info_studiante(Estudiante objeto){
        String name ="***************\n";
        name += objeto.getNombre() + " " + objeto.getApellido() + "\n";
        name += "*******************\n";
        return name;
    }
    
    public String informacion(){
        String name = "";
        name += "El carnet del estudiante es: " + this.carnet + "\n";
        name += "El nombre del estudiante es: " + this.nombre + "\n";
        name += "El apellido del estudiante es: " + this.apellido + "\n";
        name += "La edad del estudiante es: " + this.edad + "\n";
        return name;
    }
}
