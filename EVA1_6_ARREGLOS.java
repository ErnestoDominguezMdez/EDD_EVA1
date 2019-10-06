package eva1_6_arreglos;

public class EVA1_6_ARREGLOS {

    public static void main(String[] args) {

        int aiDatos[], a, b;
        int[] aiDatos2, x, y;

        aiDatos = new int[100000000];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) ((Math.random() * 100) + 1);
        }

        aiDatos[4] = 5000;
        aiDatos[69] = 500;
    }

}

//Son objetos
//La memoria es consecutiva
//Son de acceso aleatorio
//Son muy rápidos
//Son inmutables
