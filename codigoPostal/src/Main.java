import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Asentamiento[] A = new Asentamiento[2133];
        try {
            Scanner S = new Scanner(new File("codigos_postales_hmo.csv")); //esto deja escanear el archivo csv
            int B = 0;
            while (S.hasNext()){
                A[B] = new Asentamiento(S.nextLine());
                B++;
            }
            System.out.println();
            for (int i = 83000; i <= 83357; i++) {
                int C = 0;
                for (int j = 0; j < 2133; j++){
                    if (A[j].codigoPostal == i) C++;
                }
                if (C > 0) System.out.println("Código Postal: " + i + " - Número de asentamientos: " + C);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}