package herencia;
public class Pez extends Animal{
    private String alimentación;

  /*  public Pez(String alimentación, String especie) {
        this.alimentación = alimentación;
        this.especie = especie;
    }
*/
      
    public String getAlimentación() {
        return alimentación;
    }

    public void setAlimentación(String a) {
        this.alimentación = a;
    }

    @Override
  public void printMensaje(){
      System.out.println("Estoy comiendo mojarritas");
    }
}
