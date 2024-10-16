import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un array de 10 elementos
        int[] numeros = new int[10];

        // Crear un objeto Random
        Random random = new Random();

        // Llenar el array con números aleatorios entre 0 y 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);  // Números entre 0 y 99
        }

        // Imprimir los números del array
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}