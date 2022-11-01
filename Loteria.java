import java.util.ArrayList;
import java.util.List;

public class Loteria {

    public static void main(String[] args) {
        clearScreen clear = new clearScreen();
        clear.clear();

        List<Integer> acertado = ConfirmarJugada(JugadaSuperKino());
        switch (acertado.size()) {
            case 0:
                System.out.println("Has Ganado RD$80 Pesos\nFelicitaciones al ganador!...");
                break;
            case 5:
                System.out.println("Has Ganado RD$60 Pesos\nFelicitaciones al ganador!...");
                break;
            case 6:
                System.out.println("Has Ganado RD$300 Pesos\nFelicitaciones al ganador!...");
                break;
            case 7:
                System.out.println("Has Ganado RD$1000 Pesos\nFelicitaciones al ganador!...");
                break;
            case 8:
                System.out.println("Has Ganado RD$10,000 Pesos\nFelicitaciones al ganador!...");
                break;
            case 9:
                System.out.println("Has Ganado RD$150,000 Pesos\nFelicitaciones al ganador!...");
            case 10:
                System.out.println("Has Ganado RD$25,000,000 Pesos\nFelicitaciones al ganador!...");
                break;
            default:
                System.out.println("Buena suerte en tu proxima jugada!...");
        }
    }

    // Metodo que genera 10 numeros al azar desde 1 al 80
    public static List<Integer> JugadaSuperKino() {
        List<Integer> numerosJugadaSuperKino = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double num = Math.random() * 80 + 1;
            int newNumero = (int) num;
            numerosJugadaSuperKino.add(newNumero);
        }
        return numerosJugadaSuperKino;

    }

    // Metodo que genera 20 numeros al azar desde 1 al 80
    public static List<Integer> SorteoSuperKino() {
        List<Integer> numerosSorteoSuperKino = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            double num = Math.random() * 80 + 1;
            int newNumero = (int) num;
            numerosSorteoSuperKino.add(newNumero);
        }
        return numerosSorteoSuperKino;
    }

    // Metodo que compara lista de numeros
    public static List<Integer> ConfirmarJugada(List<Integer> list) {
        // Accesing to list
        List<Integer> listC = list;
        // Arreglo de 20 elementos
        List<Integer> dataToCompare = SorteoSuperKino();
        // Arreglo que buscara coincidencias
        List<Integer> newData = new ArrayList<>();
        for (int i = 0; i < dataToCompare.size(); i++) {
            int n = dataToCompare.get(i);
            if (listC.contains(n)) {
                newData.add(n);
            }
        }
        return newData;

    }

}
