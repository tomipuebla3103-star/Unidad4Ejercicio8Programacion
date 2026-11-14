public class ImpresoraTinta extends Impresora{
    public ImpresoraTinta(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }

    @Override
    public void imprimirDocumento(String documento) {

        if (nivelTinta >= 15) {

            System.out.println("Impresora de tinta: " + modelo);
            System.out.println("Imprimiendo a color: " + documento);

            nivelTinta = nivelTinta - 15;

        } else {
            System.out.println("No tiene suficiente tinta.");
        }
    }
}
