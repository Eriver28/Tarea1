package Ejercicio5;

/*
Una empresa de dulces desea determinar el descuento a aplicar en una venta según el tipo de cliente.
Para ello tiene tres tipos de clientes: cliente oro, plata y normal.
En el caso del cliente tipo oro el descuento es del 20% por pedidos de más de 1000 soles,
en otro caso no hay descuento.
En el caso de los clientes plata el descuento es de 10% por pedidos de más de 1200 soles,
en otros casos no hay descuento. En el caso de los clientes normales no hay descuento en ningún caso.
Se pide crear el programa Java que permita calcular el descuento según el tipo de cliente.
*
*/

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("01","oro",1500);
        cliente1.CalcularDescuento();
    }
}