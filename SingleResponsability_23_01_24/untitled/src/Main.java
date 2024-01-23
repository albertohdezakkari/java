public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Reporte rTexto = new ReporteText();
        rTexto.generar("Hola desde aquí!!!");
        rTexto.imprimir();

        Reporte rHTML = new ReportHTML();
        rHTML.generar("Hola desde aquí!!!");
        rHTML.imprimir();

        Reporte lstReportes[] = new Reporte[2];
        lstReportes[0] = rTexto;
        lstReportes[1] = rHTML;
        for ( Reporte miReporte: lstReportes
             ) {
            miReporte.imprimir();
            miReporte.serializar();
        }

    }
}