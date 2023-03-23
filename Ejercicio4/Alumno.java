package Ejercicio4;

public class Alumno {
    String codigo;
    String nombre;
    float t1;
    float t2;

    public Alumno(String codigo, String nombre, float t1, float t2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.t1 = t1;
        this.t2 = t2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getT1() {
        return t1;
    }

    public void setT1(float t1) {
        this.t1 = t1;
    }

    public float getT2() {
        return t2;
    }

    public void setT2(float t2) {
        this.t2 = t2;
    }

    public void validar(){
        float minimo = 85;
        if(getT1() < minimo && getT2() <minimo){
            System.out.println("Reprobado");
        } else if (getT1()  < minimo || getT2() < minimo) {
            System.out.println("Observado");
        } else if(getT1() > minimo || getT2() > minimo){
            System.out.println("Aprobado");
        }
    }
}