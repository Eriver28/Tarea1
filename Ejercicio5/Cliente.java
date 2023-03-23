package Ejercicio5;

public class Cliente {
    String idCliente;
    String categoria;
    float monto;

    public Cliente(String idCliente, String categoria,float monto) {
        this.idCliente = idCliente;
        this.categoria = categoria;
        this.monto=monto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void CalcularDescuento(){

        if (getCategoria() == "oro"){
            float montoAsuperarOro = 1000;
            if( getMonto() > montoAsuperarOro){
                float montoDescuentoOro;
                float precioConDescuentoOro;
                montoDescuentoOro = (float) (getMonto() * 0.20);
                precioConDescuentoOro =  getMonto() - montoDescuentoOro;
                System.out.println("El precio total es de "+getMonto()+" cuenta con un descuento de oro  de "+montoDescuentoOro+"\n"+
                        "por lo que  el total a pagar es de "+precioConDescuentoOro);
            }
        }
        if (getCategoria() == "plata") {
            float montoAsuperarPlata = 1200;
            if( getMonto() > montoAsuperarPlata){
                float montoDescuentoPlata;
                float precioConDescuentoPlata;
                montoDescuentoPlata = (float)(getMonto() * 0.10);
                precioConDescuentoPlata =  getMonto() - montoDescuentoPlata;
                System.out.println("El precio total es de "+getMonto()+" cuenta con un descuento de plata de "+montoDescuentoPlata+"\n"+
                        "por lo que  el total a pagar es de "+precioConDescuentoPlata);
            }
        }

        else{
            System.out.println("Total a pagar "+getMonto());
        }
    }
}

