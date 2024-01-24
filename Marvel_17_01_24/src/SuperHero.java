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
    public SuperHero(){

    }
    // MÉTODOS
    @Override
    public abstract void luchar();
    @Override
    public abstract void mostrarIdentidad();
        // GETTER/SETTER


    public String getNombreReal() {
        return nombreReal;
    }
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
    public String getNombreHeroe() {
        return nombreHeroe;
    }
    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }


}
