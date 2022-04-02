package Ejercicios;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Estudiante {
/*
    3-. Modelar una clase Estudiante que nos permita almacenar los datos de 5 estudiantes. Los datos que nos interesan
    son el número de carnet, el nombre y el código de la carrera. Se debe de utilizar la clase HashTable para almacenar los
    datos de los estudiantes. La clase deberá de permitir almacenar los cinco estudiantes y almacenarlos en la clase
    Estudiante por medio de su constructor. Cuando los datos sean almacenados por medio del constructor, la clase deberá de
    tener un método para imprimir los datos de cada uno de los estudiantes.    
*/
    
    //Atributos del modelo #####################################################
    private String noCarnet;
    private String nombre;
    private String codigoCarrera;
    
    //Variable para guardar estudiantes ########################################
    Hashtable <String, Estudiante> estudiantes;
        
    private Estudiante() {}
       
    public Estudiante(int cantidadEstudiantes) {
        
        estudiantes = new Hashtable<String, Estudiante>();
        
        System.out.println("-------------INGRESO DE ESTUDIANTES-------------");
        
        for(int i = 0; i < cantidadEstudiantes ; i++){
                        
            Scanner leer = new Scanner(System.in);
            Estudiante estudiante = new Estudiante();
            
            System.out.print("Digite número de carnet: ");
            estudiante.noCarnet = leer.nextLine();
            System.out.print("Digite nombre de estudiante: ");
            estudiante.nombre = leer.nextLine();
            System.out.print("Digite código de carrera: ");
            estudiante.codigoCarrera = leer.nextLine();
            
            System.out.println("------------------------------------------------");
            
            estudiantes.put(estudiante.noCarnet, estudiante);
            
        }  
    }
    
    public void imprimir(){
        Enumeration<Estudiante> listaEstudiantes = estudiantes.elements();
        System.out.println("-------------LISTADO DE ESTUDIANTES-------------");
        while (listaEstudiantes.hasMoreElements()) {
            Estudiante estudiante = listaEstudiantes.nextElement();
            System.out.println("------------------------------------------------");
            System.out.println("Carnet: "+estudiante.noCarnet);
            System.out.println("Nombre: "+estudiante.nombre);
            System.out.println("Código carrera: "+estudiante.codigoCarrera);
        }
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite la cantidad de estudiantes a registrar: ");
        int cantidad = leer.nextInt();
        Estudiante obj = new Estudiante(cantidad); 
        obj.imprimir();
    }
    
}     
