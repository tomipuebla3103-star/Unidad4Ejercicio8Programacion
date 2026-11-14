public class ServidorImpresion {
    private Impresora[] impresoras;

    public ServidorImpresion(Impresora[] impresoras) {
        this.impresoras = impresoras;
    }

    public void enviarTrabajo(String documento) {

        for (Impresora impresora : impresoras) {

            impresora.imprimirDocumento(documento);

            System.out.println("----------------------");
        }
    }
}
