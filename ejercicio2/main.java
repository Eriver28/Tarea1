package ejercicio2;

public class main {
    /*
Desarrollar un programa OO para determinar la cantidad de cloro que se debe utilizar en una piscina de dimensiones
“largo”, “ancho” y “profundidad” (expresados en mts). Tener en cuenta que la piscina solo se llena de agua en
las ¾ partes de su capacidad total. Se sabe que la cantidad de cloro necesaria es de 0.015 gramos por cada 1.5 litros
de agua. Codificar la clase que permita realizar lo solicitado. Defina los siguientes comportamientos

-	Calcular el volumen
-	Calcular cantidad de agua
-	Calcular cantidad de cloro

*/

        public static void main(String[] args) {
            Piscina rectangular = new Piscina(5,3,2);
            rectangular.info();

        }
    }

