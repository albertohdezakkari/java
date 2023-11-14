import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        int posLetraP = abecedario.indexOf('p');
        StringBuilder cifrado = new StringBuilder();
        while (letras.hasNextLine()) {
            String cadena = letras.nextLine().toLowerCase();
            int posEncriptada = abecedario.indexOf(cadena.charAt(0));
            int desplazamiento = posEncriptada - posLetraP; // 15 - 16
            for (int i = 1; i < cadena.length(); i++) {
                posEncriptada = abecedario.indexOf(cadena.charAt(i)); //b
                if ((posEncriptada - (desplazamiento * -1)) < 0) {
                    int letra = (26) + (posEncriptada) - (desplazamiento * -1);
                    System.out.println(abecedario.charAt(letra));
                    cifrado.append(abecedario.charAt(letra));
                } else {
                    int nuevaPos = (posEncriptada + desplazamiento) % 26;
                    cifrado.append(abecedario.charAt(nuevaPos));
                }
                System.out.println(cifrado);
            }
            letras.close();
        }
    }
}
