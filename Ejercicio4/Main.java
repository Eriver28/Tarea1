package Ejercicio4;

/*
Se requiere una aplicación que permita crear un alumno de un instituto de inglés y permita determinar si es que ha pasado
el nivel o no. Los alumnos tienen, además de su código y nombre, dos valores que son las pruebas llamadas T1 y T2. En caso
tengan más de 85 puntos en ambas pruebas el alumno está en aprobado. En caso solamente tenga una de las dos pruebas más
de 85 entonces está como observado. Si es que ninguna de las dos tiene más de 85 puntos entonces está reprobado.
Definir la clase en Java que solucione el problema planteado
*/

public class Main {
    public static  void main(String[] args) {
        Alumno objalum = new Alumno("015","Ricardo Alcantara Lamonja",89,79);
        objalum.validar();

    }

}
