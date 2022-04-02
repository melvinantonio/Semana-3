package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio_2 {
/*
   2-. Modelar una clase CalculoIva para realizar el cálculo del IVA. La clase deberá de tener dos métodos, el primero que
   calcule el IVA al precio de un artículo el cual deberá de recibir como parámetros el precio sin IVA y el porcentaje del IVA
   a aplicar y el segundo que reciba como parámetro el precio del articulo con IVA y el porcentaje del IVA y que devuelva el
   precio del artículo sin IVA.
*/
   static double asñldfj = 0;
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        NumberFormat formato= new DecimalFormat("#,###.##");
        
        System.out.println("Digite el precio sin IVA del articulo: $");
               double precio = leer.nextDouble(); 
                
        System.out.println("Digite el porcentaje del IVA (Ejemplo: 13): ");
                double porcentaje = leer.nextDouble(); 
                
                double precioConIva = conIva(precio, porcentaje);
                double precioSinIva = sinIva(precioConIva, porcentaje);
                
                System.out.println("Precio sin iva digitado: $ "+formato.format(precio));
                System.out.println("Precio con iva calculado: $ "+formato.format(precioConIva));
                System.out.println("Precio sin iva calculado: $ "+formato.format(precioSinIva));
                
    }
    
    public static double conIva(double precioSinIva, double porcentajeIva){
        double iva = (precioSinIva/100)*(porcentajeIva);
        double precioConIva = precioSinIva + iva;
        return precioConIva;
    }
    public static double sinIva(double precioConIva, double porcentajeIva){
          double precioSinIva = precioConIva / ((porcentajeIva/100)+1);
      return precioSinIva;
    }    
}
