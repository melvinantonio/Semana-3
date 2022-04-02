package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
/*
    1-. Crear la clase Empleado utilizando ENCAPSULAMIENTO con las siguientes características:
    Atributos: (No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario Con Descuento, Bandera de Empleado Activo o
    Inactivo)
    Métodos:
    a) Crear un método para calcular el Salario con Descuento que es Salario Devengado –
    b) Descuento del 10% de Renta
    c) Crear un método para Imprimir el Nombre Completo del Contribuyente
    d) Imprimir Todos los Atributos
    e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
*/
    
    String nit;
    String Apellidos;
    String Nombres;
    String Direccion;
    Double salarioDevengado;
    Double salarioConDescuento;
    int banderaEmpleado;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(Double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public Double getSalarioConDescuento() {
        return salarioConDescuento;
    }

    public void setSalarioConDescuento(Double salarioConDescuento) {
        this.salarioConDescuento = salarioConDescuento;
    }

    public int getBanderaEmpleado() {
        return banderaEmpleado;
    }

    public void setBanderaEmpleado(int banderaEmpleado) {
        this.banderaEmpleado = banderaEmpleado;
    }

    public static void main(String[] args) {
        Ejercicio_4 obj = new Ejercicio_4();
        Scanner leer = new Scanner(System.in);
        
        try {
            //Asigna valores
            System.out.println("Digite numero de carnet: ");
            obj.setNit(leer.nextLine());
            System.out.println("Digite Apellidos: ");
            obj.setApellidos(leer.nextLine());
            System.out.println("Digite Nombre: ");    
            obj.setNombres(leer.nextLine());
            System.out.println("Digite Direccion: ");
            obj.setDireccion(leer.nextLine());
            System.out.println("Digite Salario a desvengar: ");
            obj.setSalarioDevengado(leer.nextDouble());    
            System.out.println("Digite Bandera de Empleado(Activo = 1, Inactivo = 0): ");
            obj.setBanderaEmpleado(leer.nextInt());
            
            
            double salario = obj.calcularSalarioConDescuento(obj.getSalarioDevengado());
            obj.setSalarioConDescuento(salario);

            //Retornar valores
            System.out.println("########################################################################################");
            System.out.println("Nit: " + obj.getNit());
            System.out.println("Apellidos: " + obj.getApellidos());
            System.out.println("Nombres: " + obj.getNombres());
            System.out.println("Direccion: " + obj.getDireccion());
            System.out.println("Salario: " + obj.getSalarioDevengado());
            System.out.println("Bandera Empleado: " + obj.getBanderaEmpleado());
            System.out.println("Salario con descuento del 10% de renta es de: $" + obj.getSalarioConDescuento());
           System.out.println("Nombre contribuyente: " + obj.nombreContribuyente(obj.getNombres(), obj.getApellidos()));
           System.out.println("########################################################################################");
                 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }            
    }
    public double calcularSalarioConDescuento(Double salarioDevengado){
        double salarioDescuento = salarioDevengado * 0.1;  
        double salario = salarioDevengado - salarioDescuento;
        return salario;
    }
    public String nombreContribuyente(String nombres, String apellidos){
        String nombreCompleto = nombres + " " + apellidos;
        return nombreCompleto;
    }
}
