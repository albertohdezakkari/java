public abstract class Reporte
        implements ActionsReport{
        // implements ActionsReport, ActionsAWS{

    protected String contenido;

    @Override
    public abstract void generar(String info);

    @Override
    public abstract void imprimir();

    @Override
    public abstract void serializar();

    /*protected abstract void generar(String info);
    protected abstract void imprimir();*/
}
