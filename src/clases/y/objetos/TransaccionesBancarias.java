package clases.y.objetos;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();//Crear instancia(objeto) de la calse CuentaBancaria
        Scanner leer = new Scanner(System.in);//Objeto leer de la clase Scanner para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        System.out.println("Ingresar los datos que se solicitan a continuación:");
        System.out.println("Nombre del propietario:");
        nombreCliente = leer.nextLine();//Asignar valores a los atributos de la clase
        
        System.out.println("Número de dui:");
        duiCliente = leer.nextLine();
        
        System.out.println("Telefono:");
        telefonoCliente = leer.nextLong();
        
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente);
        cuenta.propietarioCuenta = propietario;
        System.out.println("Ingresa la cantidad a abonar: ");
        cuenta.abonar(abono=leer.nextDouble());//Envio de parametro al metodo abonar de la clase CuentaBancaria
        
        System.out.println("Ingresar cantidad a retirar: ");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("----------------------------");
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);//Obtiene saldo de cuenta
        // Obtener informacion del propietario
        System.out.println("Datos del propietario   :\n" + cuenta.datosPropietarioCuenta());
        
    }
}
