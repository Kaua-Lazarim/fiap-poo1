package br.com.fiapride;

import br.com.fiapride.model.Martelo;

public class TesteMeuObjeto {
    public static void main(String[] args) {

        // Criando um martelo de carpinteiro válido
        Martelo marteloComum = new Martelo("Aço", "Unha", 0.600);
        marteloComum.testarCapacidadeDeTirarPrego();
        marteloComum.testarUsoEmVidro();

        System.out.println("--------------------");

        // Criando um martelo de borracha (para assentamento de piso)
        Martelo marteloBorracha = new Martelo("Borracha", "Mazo", 0.450);
        marteloBorracha.testarCapacidadeDeTirarPrego();
        marteloBorracha.testarUsoEmVidro();
    }
}