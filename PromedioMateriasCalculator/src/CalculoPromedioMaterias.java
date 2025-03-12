
import java.util.Scanner;

public class CalculoPromedioMaterias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0;
        double promedio = 0;

        // Solicitar materia al usuario
        System.out.print("Seleccione la materia (1: Matemáticas, 2: Español, 3: Inglés): ");
        int materia = scanner.nextInt();

        // Validar materia seleccionada y realizar cálculos según el caso
        switch (materia) {
            case 1:
                // Calcular promedio de Matemáticas usando ciclo for
                for (int contador = 1; contador <= 5; contador++) {
                    System.out.print("Ingrese la nota del estudiante " + contador + " para Matemáticas: ");
                    double nota = scanner.nextDouble();
                    totalNotas += nota;
                }
                promedio = totalNotas / 5;
                break;

            case 2:
                // Calcular promedio de Español usando ciclo while
                int contador = 1;
                while (contador <= 5) {
                    System.out.print("Ingrese la nota del estudiante " + contador + " para Español: ");
                    double nota = scanner.nextDouble();
                    totalNotas += nota;
                    contador++;
                }
                promedio = totalNotas / 5;
                break;

            case 3:
                // Calcular promedio de Inglés usando ciclo do-while
                contador = 1;
                do {
                    System.out.print("Ingrese la nota del estudiante " + contador + " para Inglés: ");
                    double nota = scanner.nextDouble();
                    totalNotas += nota;
                    contador++;
                } while (contador <= 5);
                promedio = totalNotas / 5;
                break;

            default:
                System.out.println("Materia no válida");
                return;
        }

        // Mostrar resultado
        System.out.println("El promedio del grupo en la materia seleccionada es: " + promedio);

        scanner.close();
    }
}

