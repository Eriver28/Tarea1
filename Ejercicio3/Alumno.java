package Ejercicio3;

public class Alumno {
    String codigo;
    String nombre;
    String apellido;
    float notapc1;
    float notapc2;
    float notaparticipacion;
    float notafinal;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getNotapc1() {
        return notapc1;
    }

    public void setNotapc1(float notapc1) {
        this.notapc1 = notapc1;
    }

    public float getNotapc2() {
        return notapc2;
    }

    public void setNotapc2(float notapc2) {
        this.notapc2 = notapc2;
    }

    public float getNotaparticipacion() {
        return notaparticipacion;
    }

    public void setNotaparticipacion(float notaparticipacion) {
        this.notaparticipacion = notaparticipacion;
    }

    public float getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(float notafinal) {
        this.notafinal = notafinal;
    }

    public Alumno(String codigo, String nombre, String apellido, float notapc1, float notapc2, float notaparticipacion, float notafinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notapc1 = notapc1;
        this.notapc2 = notapc2;
        this.notaparticipacion = notaparticipacion;
        this.notafinal = notafinal;
    }

    public void Presentar(){
        System.out.println("Alumno "+getCodigo()+" "+getNombre()+" "+getApellido());
    }
    public float NotaFinal(){
        float promedio = (float) ((getNotapc1()*0.2)+ (getNotapc2()*0.25) + (getNotaparticipacion()*0.25) + (getNotafinal() *0.30));
        return promedio;
    }
    public void Veredicto(){
        if (NotaFinal() <13) {
            System.out.println("El Alumno desaprobo con "+NotaFinal());
        }else{
            System.out.println("El Alumno aprobo con "+NotaFinal());
        }
    }
}