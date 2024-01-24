public class FactoryAvengers {
    public static final String THOR = "THOR";
    public static final String IRON_MAN = "IRON_MAN";
    public static final String HULK = "HULK";
    public static Avenger getInstance(String superhero){
        Avenger avenger = null;
        switch (superhero){
            case THOR:
                avenger = (Thor)Thor.getInstance();
                break;
            case IRON_MAN:
                avenger = IronMan.getInstance();
                break;
            case HULK:
                break;
        }
        // Centralizar las instancias de todos mis superheroes
        // Si devuelvo un Thor
        return avenger;
    }
}
