package br.inatel.cdg.PCMania.Cliente;

import br.inatel.cdg.PCMania.PC.Computador.Computador;

public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] compra;

    public float calculaTotalCompra(){
        return 2;
    }
    public Cliente (){
        compra = new Computador[1];
    }
    public void setCompra(Computador[] novaCompra){
        this.compra=novaCompra;
    }
}
