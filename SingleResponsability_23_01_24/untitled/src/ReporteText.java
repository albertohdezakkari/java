public class ReporteText extends Reporte {
    @Override
    public void generar(String info) {
        String cad = "Inicio TP" + info + "FIN TP";
        super.contenido = cad;
    }

    @Override
    public void imprimir() {
        System.out.println(super.contenido);
    }

    public void serializar(){
        System.out.println("Guardar en disco");
    }
}
