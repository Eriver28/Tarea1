package Ejercicio6;

import static java.lang.Math.*;

public class Triangulo {
    float primerlado;
    float segundolado;
    float tercerlado;

    public Triangulo(float primerlado, float segundolado, float tercerlado) {
        this.primerlado = primerlado;
        this.segundolado = segundolado;
        this.tercerlado = tercerlado;
    }

    public float getPrimerlado() {
        return primerlado;
    }

    public void setPrimerlado(float primerlado) {
        this.primerlado = primerlado;
    }

    public float getSegundolado() {
        return segundolado;
    }

    public void setSegundolado(float segundolado) {
        this.segundolado = segundolado;
    }

    public float getTercerlado() {
        return tercerlado;
    }

    public void setTercerlado(float tercerlado) {
        this.tercerlado = tercerlado;
    }

    public void info(){
        if(getPrimerlado() < getSegundolado()){
            if(getSegundolado() <getTercerlado() ){
                float p = (getPrimerlado()+getSegundolado()+getTercerlado())/2;
                System.out.println("El semiperimetro "+ p );
                float  area  = (float) sqrt(abs(p * ((p - getPrimerlado()) * (p - getSegundolado()) * (p - getTercerlado()))));
                System.out.println("Area Herón :"+ area);
            }
            else{
                System.out.println("El tercer lado ingresado es menor que el segundo");
            }
        }
        else{
            System.out.println("El segundo lado ingresado es menor que el primero");
        }
    }

}
