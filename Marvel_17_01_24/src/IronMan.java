public class IronMan extends SuperHero {
    protected String armadura;
    private IronMan(String nombreReal, String nombreHeroe, String armadura) {
        super(nombreReal, nombreHeroe);
        this.armadura = armadura;
    }
    /*PATRÓN SINGLETON*/
    private static IronMan myInstanceIronMan = null;
    public static IronMan getInstance(){
        if(myInstanceIronMan==null){
            myInstanceIronMan = new IronMan("a", "b", "c");
        }
        return myInstanceIronMan; // La única instancia de THOR
    }

    @Override
    public void luchar() {
        System.out.println("Atributos de SuperHero" + super.nombreHeroe);
        System.out.println("Atributos de SuperHero" + super.nombreReal);
        System.out.println("Atributos de IronMan" + this.armadura);
    }
    @Override
    public  void  mostrarIdentidad(){}

    public String getArmadura(){
        return this.armadura;
    }
}
