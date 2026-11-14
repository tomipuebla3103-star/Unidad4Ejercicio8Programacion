public class ImpresoraLaser extends Impresora{
    public ImpresoraLaser(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }

    @Override
    public void imprimirDocumento(String documento) {

        if (nivelTinta >= 10) {

            System.out.println("Impresora laser: " + modelo);
            System.out.println("Imprimiendo en blanco y negro: " + documento);

            nivelTinta = nivelTinta - 10;

        } else {
            System.out.println("No tiene suficiente toner.");
        }
    }
}
