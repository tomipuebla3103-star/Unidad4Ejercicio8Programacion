public class ImpresoraMatricial extends Impresora{
    public ImpresoraMatricial(String modelo, int nivelTinta) {
        super(modelo, nivelTinta);
    }

    @Override
    public void imprimirDocumento(String documento) {

        if (nivelTinta >= 5) {

            System.out.println("Impresora matricial: " + modelo);
            System.out.println("Imprimiendo con cinta: " + documento);

            nivelTinta = nivelTinta - 5;

        } else {
            System.out.println("Necesita cambiar la cinta.");
        }
    }
}
