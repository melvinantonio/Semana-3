package Demostracion;

public class Notas {
    
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    
    public Notas(){
    }

    public Notas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public double promedio(){
        double pm = 0.0;
        pm = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
        return pm;
    }
    public String observacion(Notas dato){
        double notaFinal = 0.0;
        String observacion = "";
        notaFinal = dato.promedio();
        if(notaFinal > 0 && notaFinal <=3){
            observacion = "Necesita Mejorar";
        }else if(notaFinal > 3 && notaFinal <=6){
            observacion = "Bueno";
        }else if(notaFinal >6 && notaFinal <=9){
            observacion = "Muy bueno";
        }else if(notaFinal == 10){
            observacion = "Exelente";
        }
        return observacion;
    }
}
