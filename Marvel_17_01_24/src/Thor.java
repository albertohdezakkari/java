public  class Thor extends SuperHero {
    protected String arma;
    public Thor(String nombreReal, String nombreHeroe, String arma) {
        super(nombreReal, nombreHeroe);
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
}
