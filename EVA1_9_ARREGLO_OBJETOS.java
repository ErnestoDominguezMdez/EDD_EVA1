package eva1_9_arreglo_objetos;

public class EVA1_9_ARREGLO_OBJETOS {

    public static void main(String[] args) {
        Prueba[] apArreglo = new Prueba[5]; //Diciendo que se crean arreglos que almacenan objetos de tipo prueba
        Prueba[] apCopia = new Prueba[5];

        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i] = new Prueba();
            apCopia[i] = new Prueba();
            apArreglo[i].x = (int) (Math.random() * 100);
            System.out.println(apArreglo[i]);
        }

        System.out.println("-------------------------");

        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i].x = apArreglo[i].x;
            System.out.println(apCopia[i]);
        }

    }

}

class Prueba {

    int x = 0;
}
