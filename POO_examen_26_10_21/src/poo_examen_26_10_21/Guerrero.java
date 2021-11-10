package poo_examen_26_10_21;

/**
 *
 * @author null
 */

public class Guerrero extends Personaje{
    // Atributos
    protected String arma;
    
    // Constructor
    public Guerrero(String nombre, int energia, int energiaQueGasta,String arma) {
        super(nombre, energia, energiaQueGasta);
        this.arma = arma;
        setVida(100);
    }
    
    // Getters y Setter
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    
    // Métodos
    @Override
    public void alimentarse(int energiaNueva){
        super.alimentarse(energiaNueva);
        System.out.println("Guerrero[ energía anterior " + getEnergiaA() + " energia actual " + getEnergia()+"]");
    }
    
    public void combatir(int energiaQueGasta){
        System.out.println("Combatiendo.");
        setEnergiaQueGasta(energiaQueGasta);
        energia -= this.energiaQueGasta;
        System.out.println("El Guerrero " + getNombre() + " uso el arma " + getArma() + " y su nuevo nivel de energía es " + getEnergia());
    }
    
/*
    
    public void atacar(Mago m){
        // el 1+ es porque genera un número entre 0-99 (100)
        danio = 1+rand.nextInt(100);
        setDanio(danio);

        // if-elseif para verificar el daño
        if(danio >= 1 && danio <= 49){
            System.out.println("No se lastimo al contrincante");
            System.out.println("Nivel de herida: ninguno | Vida restante: " + m.getVida());
        } else if(danio >= 50 && danio <= 70){
            m.setVida(vida - 10);
            System.out.println("Se lastimo levemente al contrincante y pierde 10 puntos de vida");
            System.out.println("Nivel de herida: leve | Vida restante: " + m.getVida());
        } else if(danio >= 71 && danio <= 89){
            m.setVida(vida - 20);
            System.out.println("Se lastimo al contrincante y pierde 20 puntos de vida");
            System.out.println("Nivel de herida: normal | Vida restante: " + m.getVida());
        } else if(danio >= 90 && danio <= 100){
            m.setVida(vida-30);
            System.out.println("Se lastimo fuertemente al contrincante y pierde 30 puntos de vida");
            System.out.println("Nivel de herida: grave | Vida restante: " + m.getVida());
        }
    }
*/
    
    @Override
    public String toString() {
        return "\nGuerrero"
                +"\n"+super.toString()
                +"\nArma: " + getArma()
                +"\n++++++++++++++++++++++++++\n";
    }    
}
