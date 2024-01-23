public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*SuperHero s1 = new SuperHero("a", "a");
        s1.luchar();*/
        Thor s3 = new Thor("a", "a", "fas");
        SuperHero s2 = new Thor("a", "a", "fas");
            Thor s4 = (Thor)s2; // CAST o conversión
            s4.getArma();
        // s2.getClass()
        s2.luchar();

    }
}