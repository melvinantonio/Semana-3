package clases.y.objetos;

public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiantes(){
        System.out.println("Metodo para registro de estudiante: ");
    }
    public void ConsultarEstudiante(){
        System.out.println("Metodo para consultar de estudiante: ");
    }
    public void eliminarEstudiante(){
        System.out.println("Metodo para eliminar de estudiantes: ");
    }
    public static void main(String[] args) {
        Estudiante est = new Estudiante();//El objeto est es la instancia de la clase Estudiante
        est.carnet = 1234; //Asignar el valor a cada uno de los atributos est.carnet objeto mas atributo
        est.nombre = "Melvin";
        est.apellido = "López";
        
        est.registroEstudiantes();
        est.ConsultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet   : " + est.carnet);// El objeto y el atributo est.carnet
        System.out.println("Nombre   : " + est.nombre);
        System.out.println("Apellodo : " + est.apellido);
    }
}
