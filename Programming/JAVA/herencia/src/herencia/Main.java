package herencia;
public abstract class Main {

    public static void main(String[] args) {
     
    Perro perro1 = new Perro();
    perro1.setEspecie("Perro");
    System.out.println("Soy un animal de la especie: "+perro1.getEspecie());
    perro1.setRaza("Boxer");
    System.out.println("Soy perro de la raza: "+perro1.getRaza());
    perro1.printMensaje();
    System.out.println("\n");
    Pez pez1 = new Pez();
    pez1.setEspecie("Pez");
    System.out.println("Soy un animal de la especie: "+pez1.getEspecie());
    pez1.printMensaje();
    System.out.println("\n");
    Serpiente serpiente1 = new Serpiente();
    serpiente1.setEspecie("Serpiente");
    System.out.println("Soy un animal de la especie: "+serpiente1.getEspecie());
    serpiente1.setVenenosa(true);
    System.out.println("Soy una Cobra venenosa = "+serpiente1.isVenenosa());
    serpiente1.printMensaje();
    System.out.println("\n");
    
    /*
    Animal perro = new Perro();
    perro.printMensaje();
    Animal pez = new Pez();
    pez.printMensaje();
    Animal serpiente = new Serpiente();
    serpiente.printMensaje();
*/
 }
} 