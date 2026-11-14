//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ImpresoraLaser laser = new ImpresoraLaser("HP LaserJet", 50);

    ImpresoraTinta tinta = new ImpresoraTinta("Epson EcoTank", 40);

    ImpresoraMatricial matricial = new ImpresoraMatricial("Epson LX-300", 30);

    Impresora[] impresoras = {
            laser,
            tinta,
            matricial
    };

    ServidorImpresion servidor = new ServidorImpresion(impresoras);

    servidor.enviarTrabajo("Reporte de ventas");
}
