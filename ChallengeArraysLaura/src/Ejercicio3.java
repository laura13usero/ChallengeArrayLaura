import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear un array de 6 números aleatorios
        int[] array = generarArrayAleatorio(6);

        // Mostrar el array generado
        System.out.println("Array generado:");
        imprimirArray(array);

        // Pedir 3 números
        Scanner scanner = new Scanner(System.in);
        int[] numerosUsuario = new int[3];
        System.out.println("Ingresa 3 números:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = scanner.nextInt();
        }

        // Comprobar si los números existen en el array
        for (int i = 0; i < numerosUsuario.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == numerosUsuario[i]) {
                    array[j] = -1;  //-1 = XX
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El número " + numerosUsuario[i] + " es un paquete.");
            }
        }

        // Array con XX
        System.out.println("\nArray actualizado:");
        imprimirArrayConXX(array);
    }

    // Array de números aleatorios
    public static int[] generarArrayAleatorio(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);  // Números entre 0 y 99
        }
        return array;
    }

    // Imprimir el array
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    // Imprimir el array reemplazando con 'XX'
    public static void imprimirArrayConXX(int[] array) {
        for (int num : array) {
            if (num == -1) {
                System.out.print("XX\t");
            } else {
                System.out.print(num + "\t");
            }
        }
        System.out.println();
    }
}