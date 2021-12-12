import javax.swing.JOptionPane;

public class Dialogs {

    public static void main(String[] args) {
        // TODO code application logic here

        String rad;

        float radius,area,circum;
        
        rad = JOptionPane.showInputDialog("Enter the Radius of circle:");

        radius = Integer.parseInt(rad);
        area = (float) (Math.PI*radius*radius);
        circum = (float) (2*Math.PI*radius);

        JOptionPane.showMessageDialog(null, "Area: " + area + "\ncircumference: " + circum,"AREA",JOptionPane.PLAIN_MESSAGE);
        
    }

}