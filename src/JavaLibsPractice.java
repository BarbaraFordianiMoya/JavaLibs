import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Coloque um nome:");
        String animal = JOptionPane.showInputDialog(null,"Um animal de estimação:");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma idade para o " + name));
        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um numero inteiro: "));
        double numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um numero decimal: "));
        
        String story;
        story = "Existia uma pessoa chamada " + name;
        story += name + " tinha " + age + " anos.";
        story += name + " tinha um " + animal + " de estimação.";
        story += "Um dia " + name + " encontrou " + numeroInteiro + " laranja(s) na rua.";
        story += "E " + name + " descobriu que cada laranja custava: $" + numeroDecimal;
        
        System.out.println(story);
    }   
}