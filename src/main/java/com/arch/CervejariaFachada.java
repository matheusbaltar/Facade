package com.arch;

public class CervejariaFachada {

    private final SetorBrassagem brassagem = new SetorBrassagem();
    private final SetorFermentacao fermentacao = new SetorFermentacao();
    private final SetorQualidade qualidade = new SetorQualidade();
    private final SetorEnvase envase = new SetorEnvase();

    public void produzirCerveja(String estilo, int diasFermentacao) {
        brassagem.mosturar(estilo);
        brassagem.ferver();
        fermentacao.fermentar(estilo, diasFermentacao);

        if (qualidade.aprovar(estilo)) {
            envase.envasar(estilo);
            System.out.println("Cerveja " + estilo + " pronta!");
        } else {
            System.out.println("Lote de " + estilo + " reprovado.");
        }
    }
}