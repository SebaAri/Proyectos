package herencia;
public class Perro extends Animal{
    private String raza;

   /* public Perro(String raza, String especie ) {
        this.especie = especie;
        this.raza = raza;
    }
    */

     public String getRaza() {
        return raza;
    }

    public void setRaza(String r) {
        this.raza = r;
    }
    
    @Override
  public void printMensaje(){
        System.out.println("Estoy comiendo carne");
    }
}
