import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println ("Programa lados de um retângulo.");
        System.out.println ("Insira a base: \n");
        Double base = myObj.nextDouble();
        System.out.println ("Insira a altura: \n");
        Double alt = myObj.nextDouble();

        System.out.println ("Área do retângulo: " + base* alt);

        myObj.close();

        
        
    }
}