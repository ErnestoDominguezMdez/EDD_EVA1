package eva1_12_matrices;

public class EVA1_12_MATRICES {

    public static void main(String[] args) {
        int aMatriz[][] = new int[3][5];

        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                aMatriz[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("[" + aMatriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}

/* Se necesita un for anidado por cada dimensión de la matriz
   para imprimir todos los valores 
*/
