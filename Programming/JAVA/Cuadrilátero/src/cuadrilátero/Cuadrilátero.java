package cuadrilátero;
public class Cuadrilátero {
private float lado1;
private float lado2;
    public Cuadrilátero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilátero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
   public float getPerímetro(){
       float perímetro = 2* (lado1 + lado2);
       return perímetro;
 }
   public float getArea(){
       float area = (lado1 * lado2);
               return area;
   }
        }

