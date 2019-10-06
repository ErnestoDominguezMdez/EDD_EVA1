package eva1_13_multidimensionales;

public class EVA1_13_MULTIDIMENSIONALES {

    public static void main(String[] args) {

        int matriz[][][][][] = new int[5][3][8][10][11];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    for (int l = 0; l < matriz[i][j][k].length; l++) {
                        for (int m = 0; m < matriz[i][j][k][l].length; m++) {
                            matriz[i][j][k][l][m] = (int) (Math.random() * 100);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    for (int l = 0; l < matriz[i][j][k].length; l++) {
                        for (int m = 0; m < matriz[i][j][k][l].length; m++) {
                            System.out.print("[" + matriz[i][j][k][l][m] + "]");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
