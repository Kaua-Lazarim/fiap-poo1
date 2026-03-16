package br.com.fiapride;

import br.com.fiapride.model.Martelo;
import br.com.fiapride.model.MarteloUnha;
import br.com.fiapride.model.MarteloBorracha;
import java.util.ArrayList;
import java.util.List;

public class TestePolimorfismo {
    public static void main(String[] args) {


        List<Martelo> caixaDeFerramentas = new ArrayList<>();


        caixaDeFerramentas.add(new MarteloUnha("Aço Carbono", 0.600));
        caixaDeFerramentas.add(new MarteloBorracha(0.450));
        caixaDeFerramentas.add(new MarteloUnha("Ferro", 0.500));

        System.out.println("--- Testando o Polimorfismo na Caixa de Ferramentas ---");


        for (Martelo m : caixaDeFerramentas) {
            System.out.print("Modelo: " + m.getModelo() + " -> ");
            m.realizarImpacto();
        }
    }
}