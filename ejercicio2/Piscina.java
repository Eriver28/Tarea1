package ejercicio2;

public class Piscina {

        float ancho;
        float largo;
        float profundidad;

        public Piscina(float ancho, float largo, float profundidad) {
            this.ancho = ancho;
            this.largo = largo;
            this.profundidad = profundidad;
        }

        public float getAncho() {
            return ancho;
        }

        public void setAncho(float ancho) {
            this.ancho = ancho;
        }

        public float getLargo() {
            return largo;
        }

        public void setLargo(float largo) {
            this.largo = largo;
        }

        public float getProfundidad() {
            return profundidad;
        }

        public void setProfundidad(float profundidad) {
            this.profundidad = profundidad;
        }

        public float calcularVolumen(){
            float resultado;
            resultado = getLargo() * getAncho() * getProfundidad();
            return resultado;
        }
        public float cantidadDeAgua(){
            //1 m³ equivale a 1.000 litros,
            float totallenar = (float) (calcularVolumen() * 0.75);
            float totalAgua = totallenar * 1000;
            return totalAgua;
        }
        public float cantidadDeCloro(){
            float gramosCloro = (float) 0.015;
            float medida = (float) 1.5;
            float cantidad = cantidadDeAgua()/medida;
            float totalCloro =cantidad * gramosCloro;
            return  totalCloro;
        }

        public void info(){
            System.out.println("El volumen de la Piscina es "+calcularVolumen()+" metros cubicos\n" +
                    "Son necesarios "+cantidadDeAgua()+ " litros de agua\n"+
                    "Son necesarios "+cantidadDeCloro()+" gramos de cloro");
        }
    }

