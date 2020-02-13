public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato("Contrato de Aluguel", "pdf");
        Foto foto = new Foto("Selfie em Roma", "png");
        Documento documento = new Documento("Contrato de Compra-Venda", "docx");

        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();
    }
}
