package br.com.fiapride.model;

public class Martelo {

    private String material;
    private double peso;
    private String modelo;


    public Martelo(String material, String modelo, double peso) {
        this.material = material;
        this.modelo = modelo;
        this.setPeso(peso);

        System.out.println("🔨 Novo martelo fabricado: " + this.modelo + " de " + this.material);
    }


    public String getMaterial() { return material; }
    public String getModelo() { return modelo; }
    public double getPeso() { return peso; }


    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("❌ Erro: Peso inválido! Atribuindo peso padrão de 0.5kg.");
            this.peso = 0.5;
        }
    }


    public void testarCapacidadeDeTirarPrego() {

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

    public void realizarImpacto() {
        System.out.println("🔨 O martelo exerce uma força de impacto genérica.");
    }
}