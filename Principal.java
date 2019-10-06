
public class Principal {

    public static void main(String[] args) {

        int aiDatos[] = new int[10]; //Los arreglos en Java son objetos
        System.out.println(aiDatos);

        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) ((Math.random() * 100) + 1);
        }

        System.out.println("FOR");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }

        System.out.println("FOR EACH");
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }

    }

}
