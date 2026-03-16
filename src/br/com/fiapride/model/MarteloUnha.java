package br.com.fiapride.model;

public class MarteloUnha extends Martelo {

    public MarteloUnha(String material, double peso) {
        super(material, "Unha", peso);
    }


    @Override
    public void realizarImpacto() {
        System.out.println("✅ Martelo de Unha: Pregando prego de aço e usando a fenda para extração.");
    }
}