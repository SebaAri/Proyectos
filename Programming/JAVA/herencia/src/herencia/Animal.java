package herencia;
public abstract class Animal {
   private String especie;

    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
     
    }
    public abstract void printMensaje();
         
    
 }