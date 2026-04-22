package cuadrilátero;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args){
        Cuadrilátero c1;
        float lado1, lado2;
    
    lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1 del cuadrilátero: "));
    lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1 del cuadrilátero: "));
    if (lado1 == lado2){
    c1 = new Cuadrilátero(lado1);
     }
    else {
    c1 = new Cuadrilátero(lado1, lado2);
}
        System.out.println("El perímetro es: "+c1.getPerímetro());
   System.out.println("El area es: "+c1.getArea());
    }
}
// no me funciona