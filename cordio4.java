import java.util.Scanner

public class SumaMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definimos las dimensiones de la matriz
        System.out.println("Introduce el número de filas:");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas:");
        int columnas = sc.nextInt();

        // Inicializamos las dos matrices
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        // Rellenamos la primera matriz
        System.out.println("Introduce los valores de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        } // Se agregó el cierre del bucle for

        // Rellenamos la segunda matriz
        System.out.println("Introduce los valores de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        // Realizamos la suma de matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j]; // Se agregó el punto y coma
            }
        } // Se agregó el cierre del bucle for

        // Imprimimos la matriz resultante
        System.out.println("La matriz resultante de la suma es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    } // Se agregó el cierre del método main
}


// El codigo solo tenia errores sintacticos, algunos bucles for no se habian cerrado debidamente,
// y en la linea 37 faltaba un ";" al final de la linea
