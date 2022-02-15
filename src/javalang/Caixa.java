package javalang;

import encapsulamento.Conta;

public class Caixa {

    private  Conta[] contas;
    private int posicaoLivre;

    public Caixa(){
        contas = new Conta[100];
        posicaoLivre = 0;
    }

    public void adicionar(Conta nova){
        this.contas[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }

    public Conta pegar(int posicao){
        return this.contas[posicao];
    }

    
}
