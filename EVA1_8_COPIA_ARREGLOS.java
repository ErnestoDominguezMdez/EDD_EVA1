package eva1_8_copia_arreglos;

public class EVA1_8_COPIA_ARREGLOS {

    public static void main(String[] args) {

        int arregloOriginal[] = new int[10];
        int arregloCopia[] = new int[10];

        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }

        printArray(arregloOriginal);
        printArray(arregloCopia);
        System.out.println("");
        
        arregloCopia[2] = 100;
        
        printArray(arregloOriginal);
        printArray(arregloCopia);

    }

    public static void printArray(int[] array) {
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

}
