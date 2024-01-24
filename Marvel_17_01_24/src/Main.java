public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*SuperHero s1 = new SuperHero("a", "a");
        s1.luchar();*/
        Thor t1 = Thor.getInstance(); //0x1524FA
        Thor t2 = Thor.getInstance(); //0x1524FA
        //new Thor();
        // Thor t3 = Thor.getInstance(); //0x1524FA
        Thor thor = (Thor)FactoryAvengers.getInstance(FactoryAvengers.THOR);
            thor.setArma("MARTILLO");
            thor.setNombreHeroe("THOR");
            thor.setNombreReal("THORTILLA");
        System.out.println(thor.toString());

        IronMan ironMan = (IronMan)FactoryAvengers.getInstance(FactoryAvengers.IRON_MAN);
        // SEGUIR LOS MISMOS PASOS DE THOR

        // SuperHero s2 = new Thor("a", "a", "fas");
            //Thor s4 = (Thor)s2; // CAST o conversión
            //s4.getArma();
        // s2.getClass()
        //s2.luchar();

    }
}