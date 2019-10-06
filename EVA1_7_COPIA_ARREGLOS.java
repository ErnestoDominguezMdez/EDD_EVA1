package eva1_7_copia_arreglos;

public class EVA1_7_COPIA_ARREGLOS {

    public static void main(String[] args) {

        int aiDatos[] = new int[10];
        int aiCopia[] = new int[10];

        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) ((Math.random() * 100) + 1);
        }

        System.out.println("DATOS ORIGINALES:");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }

        aiCopia = aiDatos;
        System.out.println("DATOS COPIADOS");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiDatos[i]);
        }
    }

}
