package Ejercicios;

public class Ejercicio_1 {
/*
    1-. Modelar una clase Casa con los atributos número de casa, numero de pasaje y nombre de la calle. El número de la
    casa debe ser alfanumérico para contemplar las casas que tengan números como “27A”). Cuando la casa se crea se asigna
    tanto el número de la casa, el número de pasaje y la calle. La clase tiene que tener definido un método para imprimir los valores
    asignados.
*/
    
  static String numeroCasa;
  static int numeroPasaje;
  static String nombreCalle;
 
  //constructor
 public Ejercicio_1(){
        numeroCasa = "27A";
        numeroPasaje = 2;
        nombreCalle = "Panamericana";
 }
 
 public static void imprimir(){
        System.out.println("Numero de casa: " + numeroCasa);
        System.out.println("Numero de pasaje: " +  numeroPasaje);
        System.out.println("Nombre de calle: " + nombreCalle);
 }
 
    public static void main(String[] args) {
        Ejercicio_1 casa = new Ejercicio_1();
        imprimir();
    }
}

