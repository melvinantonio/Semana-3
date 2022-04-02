package Ejercicios;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio_6 {
/*
    3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. 
    La clase deberá de tener definidos dos métodos que
    reciban una fecha sin guiones ni plecas en formato String. Ejemplo 10062012.
    a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
    b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fechaTeclado;
        
        try {
            System.out.println("Ingrese fecha ejemplo: 21061995");
            fechaTeclado = leer.nextLine();
            
            String fechaConGuiones = fecha(fechaTeclado);
            System.out.println("Fecha con guiones: "+fechaConGuiones);
            
            SimpleDateFormat formatoConGuiones = new SimpleDateFormat("dd-MM-yyyy");
            Date fecha = formatoConGuiones.parse(fechaConGuiones);
            String fechaConPlecas = fecha(fecha);
            System.out.println("Fecha con plecas: "+fechaConPlecas);
            
        } catch (ParseException ex) {
            System.out.println("El metodo main dio error");
        }
        
    }
    public static String fecha(String fechaRecibida){
        String fechaConvertida="";
        try {
            SimpleDateFormat formatoSinGuiones = new SimpleDateFormat("ddMMyyyy");
            Date fecha = formatoSinGuiones.parse(fechaRecibida);
            SimpleDateFormat formatoConGuiones = new SimpleDateFormat("dd-MM-yyyy");
            fechaConvertida=formatoConGuiones.format(fecha);
            return fechaConvertida;
        } catch (Exception e) {
            return fechaConvertida; 
        }
    }
    
    public static String fecha(Date fecha){
        String fechaConvertida="";
        try {
            SimpleDateFormat formatoConGuiones = new SimpleDateFormat("dd/MM/yyyy");
            fechaConvertida=formatoConGuiones.format(fecha);
            return fechaConvertida;
        } catch (Exception e) {
            return fechaConvertida;
        }
    }
}
