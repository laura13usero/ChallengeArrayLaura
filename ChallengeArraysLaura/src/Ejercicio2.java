import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear una matriz de 10x10
        int[][] matriz = generarMatrizAleatoria(10, 10);

        // Imprimir la matriz
        imprimirMatriz(matriz);
    }

    // Función para generar una matriz aleatoria
    public static int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);  // Números entre 0 y 99
            }
        }

        return matriz;
    }

    // Función para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}