import java.util.Scanner;
public class Maintres{
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println ("Insira a temperatura em graus celcius: \n");
        Double temp = myObj.nextDouble();

        
        Double f = temp * 1.8 + 32;
        

        System.out.println ("Fahrenheit: " + f);

        myObj.close();

        
        
    }
}
