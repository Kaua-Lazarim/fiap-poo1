package br.com.fiapride.model;

public class MarteloBorracha extends Martelo {

    public MarteloBorracha(double peso) {
        super("Borracha", "Mazo", peso);
    }


    @Override
    public void realizarImpacto() {
        System.out.println("🛡️ Martelo de Borracha: Impacto suave. Ideal para assentar pisos sem quebrar.");
    }
}