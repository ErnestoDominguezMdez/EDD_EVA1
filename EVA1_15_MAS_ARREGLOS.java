package eva1_15_mas_arreglos;

public class EVA1_15_MAS_ARREGLOS {

    public static void main(String[] args) {
        int iNume = 10;
        System.out.println("Valor = " + iNume);
        incrementa(iNume);
        System.out.println("Valor = " + iNume);

        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Valor = " + obj.iVal);
        incrementaObj(obj);
        System.out.println("Valor = " + obj.iVal);

    }

    public static void incrementa(int iVal) {
        iVal++;
    }

    public static void incrementaObj(Prueba obj) {
        obj.iVal++;
    }

}

class Prueba {

    int iVal;
}
