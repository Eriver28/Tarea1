package Ejercicio3;

public class main {
    /*
Defina la abstracción de una clase Alumno con sus atributos
código, nombre, apellidos, nota de la pc1, nota de la pc2, nota de participación, nota examen final
y tenga el siguiente comportamiento:
-	Presentarse
-	Calcular y mostrar la nota final = pc1*0.2 + pc2*0.25+pa*0.25+ef*0.30
-	Determinar si el alumno está o no aprobado (nota mínima aprobatoria = 13)

Definir la clase en Java
*/
        public static void main(String[] args) {
            Alumno alumno1 = new Alumno("002","Eriver","Martinez",18,18,16,18);
            alumno1.Presentar();
            alumno1.Veredicto();
        }
    }
