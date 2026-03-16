package br.com.fiapride.model;

public class Martelo {
    // 1. Atributos Privados (Encapsulamento)
    private String material;
    private double peso;
    private String modelo;

    // 2. Construtor Customizado (A Regra de Nascimento)
    // O Martelo PRECISA de material, modelo e peso para existir.
    public Martelo(String material, String modelo, double peso) {
        this.material = material;
        this.modelo = modelo;
        this.setPeso(peso); // Usamos o setter privado para validar o peso no nascimento

        System.out.println("🔨 Novo martelo fabricado: " + this.modelo + " de " + this.material);
    }

    // 3. Getters (Leitura pública)
    public String getMaterial() { return material; }
    public String getModelo() { return modelo; }
    public double getPeso() { return peso; }

    // 4. Setters Privados (Validação Interna)
    // O peso não pode ser negativo ou zero.
    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("❌ Erro: Peso inválido! Atribuindo peso padrão de 0.5kg.");
            this.peso = 0.5;
        }
    }

    // 5. Comportamentos (Regras de Negócio)
    public void testarCapacidadeDeTirarPrego() {
        // Agora usamos o atributo da própria instância (this.modelo)
        if (this.modelo.equalsIgnoreCase("Unha")) {
            System.out.println("✅ Este martelo modelo " + this.modelo + " retira pregos com facilidade.");
        } else {
            System.out.println("⚠️ O modelo " + this.modelo + " não possui fenda para retirar pregos.");
        }
    }

    public void testarUsoEmVidro() {
        if (this.material.equalsIgnoreCase("Borracha")) {
            System.out.println("🛡️ Seguro: O material de " + this.material + " amortece o impacto no vidro.");
        } else {
            System.out.println("💥 Perigo: O martelo de " + this.material + " destruirá o vidro!");
        }
    }
}