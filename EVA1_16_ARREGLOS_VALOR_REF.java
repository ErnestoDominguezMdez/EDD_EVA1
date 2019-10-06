package eva1_16_arreglos_valor_ref;

public class EVA1_16_ARREGLOS_VALOR_REF {

    public static void main(String[] args) {
        int array[] = new int[10];
        System.out.println(array);
        llenarArray(array);
        imprimirArray(array);
    }

    public static void llenarArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }
    
    public static void imprimirArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }

}
