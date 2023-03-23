package Ejercicio1;

import static java.lang.Math.round;
public class Boleta {
    double monto;

    public Boleta(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double calcularIgv(){
        double igv = (getMonto() * 0.18);
        igv = (Math.round(igv * 100) / 100d );
        return igv;
    }
    public double totalApagar(){
        double total = (calcularIgv() + getMonto());
        return  total;
    }
    public void DetalleBoleta(){
        System.out.println("El producto tiene un costo de "+monto+"\n" +
                "IGV :"+calcularIgv()+"\n"+"Total a pagar :"+totalApagar());
    }
}
