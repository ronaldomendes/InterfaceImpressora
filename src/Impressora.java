import java.util.ArrayList;
import java.util.List;

public class Impressora {
    List<Imprimivel> listaImpressao = new ArrayList<>();

    public void imprimirTudo() {
        for (int i = 0; i < listaImpressao.size(); i++) {
            listaImpressao.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel imprimivel) {
        listaImpressao.add(imprimivel);
    }
}
