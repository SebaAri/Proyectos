
package ejercicio;
import javax.swing.*;
public class Ejercicio {
   int número1;
   int número2;
   int suma;
   int resta;
   int multiplicación;
   int división;
   public void LeerNúmeros(){
     número1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
     número2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); 
         
   }
public void sumar(){
    suma = número1 + número2;
}
public void restar(){
    resta = número1 - número2;
}
  public void multiplicar(){
    multiplicación = número1 * número2;
} 
  public void dividir(){
    división = número1 / número2;
}
  public void MostrarResultados(){
      System.out.println("La suma es: "+ suma);
      System.out.println("La resta es: "+ resta);
      System.out.println("La multiplicación es: "+ multiplicación);
      System.out.println("La división es: "+ división);
  }
    }