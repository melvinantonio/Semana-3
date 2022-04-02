package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    
/*
    2-. Crear la clase Factura Eléctrica utilizando ENCAPSULAMIENTO con las siguientes características:
    Atributos: (No Cuenta, Lectura actual del medidor, Lectura anterior del medidor, Multiplicador, Consumo Mensual, Consumo
    Diario, Valor Factura)
    Métodos:
    a) Crear un método para calcular el Consumo en el mes
    b) Crear un método para calcular el Consumo Diario
    c) Crear un método para calcular el Valor Factura
    d) Imprimir Todos los Atributos
    Ejemplo del cálculo:
    Lectura Anterior: 2010 Lectura Actual: 3025
    Multiplicador: 10 Días de facturación: 30
    Consumo: (lectura actual - lectura anterior) x el multiplicador
    Consumo = (3025kWh 2010kWh) * 10 = 10150kWh
    Valor factura = Consumo * 0.20
    e) Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
*/    
    int noCuenta;
    int lecturaActualDelMedidor;
    int lecturaAnteriorDelMedidor;
    int multiplicador;
    double consumoMensual;
    double consumoDiario;
    double valorFactura;

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public int getLecturaActualDelMedidor() {
        return lecturaActualDelMedidor;
    }

    public void setLecturaActualDelMedidor(int lecturaActualDelMedidor) {
        this.lecturaActualDelMedidor = lecturaActualDelMedidor;
    }

    public int getLecturaAnteriorDelMedidor() {
        return lecturaAnteriorDelMedidor;
    }

    public void setLecturaAnteriorDelMedidor(int lecturaAnteriorDelMedidor) {
        this.lecturaAnteriorDelMedidor = lecturaAnteriorDelMedidor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public static void main(String[] args) {
        Ejercicio_5 obj = new Ejercicio_5();
        Scanner leer = new Scanner(System.in);
        
        try {
            //Asignando valores
            System.out.println("Ingrese numero de cuenta: ");
            obj.setNoCuenta(leer.nextInt());
            System.out.println("Digite lectura actual del medidior: ");
            obj.setLecturaActualDelMedidor(leer.nextInt());
            System.out.println("Digite lectura anterior del medidior: ");          
            obj.setLecturaAnteriorDelMedidor(leer.nextInt());
            System.out.println("Digite multiplicador: ");      
            obj.setMultiplicador(leer.nextInt());
 
            
            double consumoMensual = Ejercicio_5.consumo_Mes(obj.getLecturaActualDelMedidor(), 
            obj.getLecturaAnteriorDelMedidor(), obj.getMultiplicador());
            obj.setConsumoMensual(consumoMensual);
            
            double consumoDiario = Ejercicio_5.consumo_Diario(obj.getLecturaActualDelMedidor(), 30);
            obj.setConsumoDiario(consumoDiario);
            
            double factura = Ejercicio_5.valor_Factura(obj.getConsumoMensual());
            obj.setValorFactura(factura);
         
            //Retorna valores
            //d) Imprimiendo Todos los Atributos
            System.out.println("########################################################################################");
            System.out.println("Numero de cuenta: " + obj.getNoCuenta()); 
            System.out.println("Lectura actual del medidior: " + obj.getLecturaActualDelMedidor() + " kWh");
            System.out.println("Lectura anterior del medidor: " + obj.getLecturaAnteriorDelMedidor() + " kWh");
            System.out.println("Multiplicador: " + obj.getMultiplicador());     
            System.out.println("consumo mensual: " + obj.getConsumoMensual() + " kWh");
            System.out.println("consumo diario: " + obj.getConsumoDiario() + " kWh");
            System.out.println("Factura: $" + obj.getValorFactura());
            System.out.println("########################################################################################");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }   
    }
    //a) Método para calcular el Consumo en el mes    
    public static double consumo_Mes(int LecturaActualDelMedidor, int lecturaAnteriorDelMedidor, int Multiplicador){
    double consumoMes = (LecturaActualDelMedidor - lecturaAnteriorDelMedidor) * Multiplicador;
    return consumoMes;
    }
    //b) Método para calcular el Consumo Diario    
    public static double consumo_Diario(int LecturaActualDelMedidor, int diasFacturacion){
    double consumoDiario = LecturaActualDelMedidor / diasFacturacion;
    return consumoDiario;         
    }
    //c) Método para calcular el Valor Factura
    public static double valor_Factura(double consumoMes){
    double fact = consumoMes * 0.20;
    return fact;
    }  
}
