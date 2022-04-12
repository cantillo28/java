import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    float nota1, nota2, media;
    nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
    nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
    media = (nota1 + nota2) / 2;
    JOptionPane.showMessageDiaLog(null, "Média Final: " + media, "Média", JOptionPane._MESSAGE);

  }
}