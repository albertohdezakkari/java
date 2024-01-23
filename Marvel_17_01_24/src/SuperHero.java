import java.sql.SQLOutput;

public abstract class SuperHero implements Avenger{
    // CLASE NORMAL
    // TENGO ATRIBUTOS + FUNCIONALIDAD
    protected String nombreReal;
    protected String nombreHeroe;
    // ATRIBUTOS
    // CONSTRUCTORES
    public SuperHero(String nombreReal, String nombreHeroe) {
        this.nombreReal = nombreReal;
        this.nombreHeroe = nombreHeroe;
    }
    // MÉTODOS
    @Override
    public abstract void luchar();
    @Override
    public abstract void mostrarIdentidad();
        // GETTER/SETTER
}
