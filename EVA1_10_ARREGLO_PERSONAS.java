package eva1_10_arreglo_personas;

import java.util.Scanner;

public class EVA1_10_ARREGLO_PERSONAS {

    public static void main(String[] args) {

        Persona[] array = new Persona[10];
        Persona[] arrayCopia = new Persona[array.length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = new Persona();
            System.out.println("Introduzca su nombre");
            array[i].nombre = scanner.nextLine();
        }

        imprimeArreglo(array);

        //Copia del arreglo
        for (int i = 0; i < array.length; i++) {
            arrayCopia[i].nombre = array[i].nombre;
        }

    }

    public static void imprimeArreglo(Persona[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Nombre: " + args[i].nombre);
        }
    }

}

class Persona {

    String nombre, apellido;
}
