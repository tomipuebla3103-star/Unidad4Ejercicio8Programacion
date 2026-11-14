public abstract class Impresora {
    protected String modelo;
    protected int nivelTinta;

    public Impresora(String modelo, int nivelTinta) {
        this.modelo = modelo;
        this.nivelTinta = nivelTinta;
    }

    public abstract void imprimirDocumento(String documento);

}
