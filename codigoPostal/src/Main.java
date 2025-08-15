import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Asentamiento[] A = new Asentamiento[2133]; //un arreglo para guardar los datos del archivo csv
        try {
            Scanner S = new Scanner(new File("codigos_postales_hmo.csv")); //esto deja escanear el archivo csv
            int B = 0; //esta variable para cambiar a los componentes del arreglo
            while (S.hasNext()){ //esto cambia a cada salto de linea en el archivo csv
                A[B] = new Asentamiento(S.nextLine()); //saca una linea de texto del archivo csv (metodo de la clase Asentamiento)
                B++;
            }
            System.out.println();
            for (int i = 83000; i <= 83357; i++) { //for para todos los posibles codigos postales
                int C = 0; //contador de cantidad de asentamientos con el mismo codigo postal
                for (int j = 0; j < 2133; j++){ //checa todos los asentamientos para ver si tienen el mismo codigo postal
                    if (A[j].codigoPostal == i) C++;
                }
                if (C > 0) System.out.println("Código Postal: " + i + " - Número de asentamientos: " + C); //imprime la cantidad de asentamientos con el mismo codigo postal
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
