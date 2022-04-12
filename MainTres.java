import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
int valorA = Integer.parseInt(JOptionPane.showInputDialog("Valor a:"));
int valorB = Integer.parseInt(JOptionPane.showInputDialog("Valor b:"));
int resultado = valorA + valorB;
JOptionPane.showMessageDialog(null, "Resultado final: "+resultado,
"Resultado", JOptionPane.INFORMATION_MESSAGE);
    }      
}