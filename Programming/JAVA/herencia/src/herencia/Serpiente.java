package herencia;
public class Serpiente extends Animal{
    private boolean venenosa;

  /*  public Serpiente(boolean venenosa, String especie) {
        this.venenosa = venenosa;
        this.especie = especie;
    }
*/
    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean v) {
        this.venenosa = v;
        }
    @Override
  public void printMensaje(){
        System.out.println("Estoy comiendo ciervos" );
    }
}