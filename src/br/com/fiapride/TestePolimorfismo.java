package br.com.fiapride;

import br.com.fiapride.model.Martelo;
import br.com.fiapride.model.MarteloUnha;
import br.com.fiapride.model.MarteloBorracha;
import java.util.ArrayList;
import java.util.List;

public class TestePolimorfismo {
    public static void main(String[] args) {


        List<Martelo> caixaDeFerramentas = new ArrayList<>();



        System.out.println("--- Testando o Polimorfismo na Caixa de Ferramentas ---");


        for (Martelo m : caixaDeFerramentas) {
            System.out.print("Modelo: " + m.getModelo() + " -> ");
            m.realizarImpacto();
        }
    }
}