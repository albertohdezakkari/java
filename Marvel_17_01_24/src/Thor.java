public  class Thor extends SuperHero {
    protected String arma;
    private Thor(String nombreReal, String nombreHeroe, String arma) {
        super(nombreReal, nombreHeroe);
        this.arma = arma;
    }
    private Thor(){
        super();
    }
    /*PATRÓN SINGLETON*/
    private static Thor myInstanceThor = null;
    public static Thor getInstance(){
        if(myInstanceThor==null){
            myInstanceThor = new Thor("a", "b", "c");
        }
        return myInstanceThor; // La única instancia de THOR
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public void luchar() {
        System.out.println("Atributos de SuperHero" + super.nombreHeroe);
        System.out.println("Atributos de SuperHero" + super.nombreReal);
        System.out.println("Atributos de Thor" + this.arma);
    }
    @Override
    public  void  mostrarIdentidad(){}
    public String getArma(){
        return this.arma;
    }

    @Override
    public void setNombreHeroe(String nombreHeroe) {
        super.setNombreHeroe(nombreHeroe);
    }
    public void setNombreReal(String nombreReal) {
        super.setNombreReal(nombreReal);
    }
    @Override
    public String toString() {
        String resp = "";

        resp += "SuperHero{" +
                "nombreReal='" + super.nombreReal + '\'' +
                ", nombreHeroe='" + super.nombreHeroe + '\'' +
                '}';
        resp += "Thor{" +
                " arma=" + this.arma +
                "}";
        return resp;
    }
}
