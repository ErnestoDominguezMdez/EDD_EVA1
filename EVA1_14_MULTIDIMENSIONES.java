package eva1_14_multidimensiones;

public class EVA1_14_MULTIDIMENSIONES {

    public static void main(String[] args) {

        int matrizA[][] = new int[2][3];
        int matrizB[][];

        matrizB = new int[3][];
        matrizB[0] = new int[10];
        matrizB[1] = new int[100];
        matrizB[2] = new int[24];

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = (int) (Math.random() * 100);
            }
        }
        
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
