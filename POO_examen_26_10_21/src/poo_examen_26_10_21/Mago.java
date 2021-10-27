package poo_examen_26_10_21;

/**
 *
 * @author null
 */

public class Mago extends Personaje{
    // Atributos
    protected String poder;

    // Constructor
    public Mago(String nombre, int energia, int energiaQueGasta, String poder) {
        super(nombre, energia, energiaQueGasta);
        this.poder = poder;
        setVida(75);
    }
    
    // Getters y Setter
    public String getPoder() {
        return poder;
    }
    
    public void setPoder(String poder) {
        this.poder = poder;
    }

    // Métodos
    @Override
    public void alimentarse(int energiaNueva){
        super.alimentarse(energiaNueva);
        System.out.println("Mago[ energía anterior " + getEnergiaA() + " energia actual " + getEnergia()+"]");
    }
    
    public void encantar(int energiaQueGasta){
        System.out.println("Combatiendo.");
        setEnergiaQueGasta(energiaQueGasta);
        energia -= this.energiaQueGasta;
        System.out.println("El Mago " + getNombre() + " uso el poder " + getPoder() + " y su nuevo nivel de energía es " + getEnergia());
    }
    
/*
    
    public void atacar(Guerrero g){
        // el 1+ es porque genera un número entre 0-99 (100)
        danio = 1+rand.nextInt(100);
        setDanio(danio);

        // if-elseif para verificar el daño
        if(danio >= 1 && danio <= 49){
            System.out.println("No se lastimo al contrincante");
            System.out.println("Nivel de herida: ninguno | Vida restante: " + g.getVida());
        } else if(danio >= 50 && danio <= 70){
            g.setVida(vida - 10);        
            System.out.println("Se lastimo levemente al contrincante y pierde 10 puntos de vida");
            System.out.println("Nivel de herida: leve | Vida restante: " + g.getVida());
        } else if(danio >= 71 && danio <= 89){
            g.setVida(vida - 20);
            System.out.println("Se lastimo al contrincante y pierde 20 puntos de vida");
            System.out.println("Nivel de herida: normal | Vida restante: " + g.getVida());
        } else if(danio >= 90 && danio <= 100){
            g.setVida(vida - 30);
            System.out.println("Se lastimo fuertemente al contrincante y pierde 30 puntos de vida");
            System.out.println("Nivel de herida: grave | Vida restante: " + g.getVida());
        }
    }
*/

    
    @Override
    public String toString() {
        return "\nMago"
        +"\n" + super.toString()
        +"\nPoder: " + getPoder()
        +"\n++++++++++++++++++++++++++\n";
    } 
}
