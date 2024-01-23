public class ReportHTML extends Reporte{
    private String textAlternativo;
    @Override
    public void generar(String info) {
        String cad = "<h1>" + info + "</h1>";
        super.contenido = cad;
    }

    @Override
    public void imprimir() {
        System.out.println(super.contenido);
    }
    @Override
    public void serializar(){
        this.textAlternativo = "ffdafd";
        System.out.println("Guardar en disco");
    }
}
