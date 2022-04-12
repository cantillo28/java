import java.util.Scanner;
public class Texto {
    public static void main(String args){
        Scanner meuObj = new Scanner(System.in);
        System.out.println("*******");
        System.out.println("Entre com um texto: ");
        String qntCaracteres = meuObj.nextLine();
        System.out.println("A quantidade de caracteres de \" " + qntCaracteres+ " \" é " + qntCaracteres.length());

        System.out.println("O texto \" " + qntCaracteres + " \" convertido será: " + qntCaracteres.toUpperCase());

        meuObj.close();
    }
}
