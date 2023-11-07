import java.util.Random;
import java.util.Scanner;

public class Main {
    // ATRIBUTOS "GLOBALES"
    // CONSTANTE
        static final char HOMER = 'H';
        static final char BART = 'B';
        static final char MURO = 'M';
        static final char POCIMA = 'P';
        static final char LIBRE = 'L';
        static final char FINAL = 'F';
    // FIN
        static char tablero[][] = new char[10][10];
        static Random aleatorio = new Random();
        static Scanner leer = new Scanner(System.in);

        static int filaB;
        static int columnaB;
    // PROCEDIMIENTOS/FUNCIONES
    public static void main(String[] args) {
        tablero[9][9] = FINAL;
        rellenarMatrizL(LIBRE);
        rellenarMatrizB(BART);
        rellenarMatrizH(HOMER);
        rellenarMatrizM(MURO);
        imprimirTablero();
        // PLAY
        do{
                String movimiento = leer.next();
                switch (movimiento){
                    case "w","W":
                        break;
                    case "a","A":
                        break;
                    case "s","S":
                        break;
                    case "d","D":
                        break;
                }

        }while();
    }

    private static void rellenarMatrizM(char muro) {
        int fila;
        int columna;
        for (int i = 0; i < 10 ; i++) {
            do {
                fila = aleatorio.nextInt(10);
                columna = aleatorio.nextInt(10);
            } while (tablero[fila][columna] != LIBRE);
            tablero[fila][columna] = MURO;
        }
    }

    private static void rellenarMatrizB(char bart) {
        // CANDIDATO
        int fila;
        int columna;
        do{
            fila = aleatorio.nextInt(10);
            columna = aleatorio.nextInt(10);
        }while(fila==9 && columna==9);
        filaB = fila;
        columnaB = columna;
        tablero[fila][columna] = BART;
    }

    private static void rellenarMatrizH(char homer) {
        int fila;
        int columna;
        for (int i = 0; i < 10 ; i++) {
            do{
                fila = aleatorio.nextInt(10);
                columna = aleatorio.nextInt(10);
            }while(tablero[fila][columna]!=LIBRE);
            tablero[fila][columna] = HOMER;
        }
    }

    private static void rellenarMatrizL(char libre) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = LIBRE;
            }
        }
    }
}