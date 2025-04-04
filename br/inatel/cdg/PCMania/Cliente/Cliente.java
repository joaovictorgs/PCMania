package br.inatel.cdg.PCMania.Cliente;

import br.inatel.cdg.PCMania.PC.Computador.Computador;

public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] compra;

    public float calculaTotalCompra(){
        float total=0;
        for(int i=0;i<compra.length;i++){
            total+=compra[i].preco;
        }
        return total;
    }
    public Cliente (){
        compra = new Computador[0];
    }
    public void setCompra(Computador[] novaCompra){
        this.compra=novaCompra;
    }
}
