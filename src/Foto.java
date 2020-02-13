public class Foto implements Imprimivel{
    private String nome;
    private String tipo;

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.print("Sou uma selfie. ");
        System.out.println(String.format("%s.%s", getNome(), getTipo()));
    }
}
