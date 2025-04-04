package br.inatel.cdg;

import java.util.Scanner;

import br.inatel.cdg.PCMania.Cliente.Cliente;
import br.inatel.cdg.PCMania.PC.Computador.Computador;
import br.inatel.cdg.PCMania.PC.MemoriaUSB.MemoriaUSB;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        MemoriaUSB memoria16 = new MemoriaUSB();
        memoria16.nome = "Pen-drive";
        memoria16.capacidade = 16000;

        MemoriaUSB memoria32 = new MemoriaUSB();
        memoria32.nome = "Pen-drive";
        memoria32.capacidade = 32000;

        MemoriaUSB memoria1000 = new MemoriaUSB();
        memoria1000.nome = "HD Externo";
        memoria1000.capacidade = 1000000;

        Computador opcao1 = new Computador();
        opcao1.marca = "Apple";
        opcao1.preco = 364;
        opcao1.hardwareBasicos[0].nome = "Pentium Core i3";
        opcao1.hardwareBasicos[0].capacidade = 2200;
        opcao1.hardwareBasicos[1].nome = "Memoria RAM";
        opcao1.hardwareBasicos[1].capacidade = 8000;
        opcao1.hardwareBasicos[2].nome = "HD";
        opcao1.hardwareBasicos[2].capacidade = 500;
        opcao1.sistemaOperacional.nome = "Linux Ubuntu";
        opcao1.sistemaOperacional.tipo = 32;
        opcao1.addMemoriaUSB(memoria16);
        
        Computador opcao2 = new Computador();
        opcao2.marca = "Samsung";
        opcao2.preco = 1598;
        opcao2.hardwareBasicos[0].nome = "Pentium Core i5";
        opcao2.hardwareBasicos[0].capacidade = 3370;
        opcao2.hardwareBasicos[1].nome = "Memoria RAM";
        opcao2.hardwareBasicos[1].capacidade = 16000;
        opcao2.hardwareBasicos[2].nome = "HD";
        opcao2.hardwareBasicos[2].capacidade = 1000000;  
        opcao2.sistemaOperacional.nome = "Windows 8";
        opcao2.sistemaOperacional.tipo = 64;
        opcao2.addMemoriaUSB(memoria32);

        Computador opcao3 = new Computador();
        opcao3.marca = "Dell";
        opcao3.preco = 6042;
        opcao3.hardwareBasicos[0].nome = "Pentium Core i7";
        opcao3.hardwareBasicos[0].capacidade = 4500;
        opcao3.hardwareBasicos[1].nome = "Memoria RAM";
        opcao3.hardwareBasicos[1].capacidade = 32000;
        opcao3.hardwareBasicos[2].nome = "HD";
        opcao3.hardwareBasicos[2].capacidade = 2000000;
        opcao3.sistemaOperacional.nome = "Windows 10";
        opcao3.sistemaOperacional.tipo = 64;
        opcao3.addMemoriaUSB(memoria1000); 

        
        opcao2.mostraPCConfigs();
        opcao3.mostraPCConfigs();
        int opcao=4;
        Scanner entrada = new Scanner(System.in);
 
        

	    System.out.println("Opa Olá bem vindo a PCMania sou João Victor Godoy da Silva e estou cursando engenharia de softaware... Mas isso não importa né? Bom vejo que está aqui pela incrível promoção da loja estou certo?");
	    System.out.println("Claro que estou! Bom mesmo você sabendo da promoção sou obrigado pela empresa a contar elas então ai vai, treinei o dia todo pra isso");
        System.out.println("A primeira promoção custa " + opcao1.preco + "e você ganha:");
	    opcao1.mostraPCConfigs();
        System.out.println("A primeira promoção custa " + opcao2.preco + "e você ganha:");
	    opcao2.mostraPCConfigs();
        System.out.println("A primeira promoção custa " + opcao3.preco + "e você ganha:");
	    opcao3.mostraPCConfigs();
	    System.out.println("Bom vamos fazer primeiro cadastramos seu cpf e seu nome e depois você me informar as opções de promoção você quer");
        System.out.println("Poderia por favor informar seu nome pra inciarmos o cadastro?");
        cliente.nome = entrada.nextLine();
        System.out.println("Opa "+cliente.nome+" agora vou precisar do seu cfp, só escreve os números extensos por exemplo 12345678901, sim a empresa me forçou a usar isso de exemplo" );
        cliente.cpf = entrada.nextLong();   
        System.out.println("A compra vai funcionar assim:");
        while (opcao!=0) {
            System.out.println("Selecione uma opção sendo \n1-OPÇÃO1 \n2-OPÇÃO2 \n3-OPÇÃO3 \n0-FINALIZAR COMPRA");
            opcao = entrada.nextInt();
            if((opcao<0)||(opcao>3)){
                System.out.println("Opção invalida, favor selecionar um valor entre 0 a 3");
            }
            if(opcao==1){
                Computador[] compra = cliente.compra;
                Computador[] nova_compra = new Computador[compra.length + 1];
                for (int i = 0; i < compra.length; i++) {
                    nova_compra[i] = compra[i];
                }   
                nova_compra[compra.length] = opcao1;
                cliente.setCompra(nova_compra);
            }
            if(opcao==2){
                Computador[] compra = cliente.compra;
                Computador[] nova_compra = new Computador[compra.length + 1];
                for (int i = 0; i < compra.length; i++) {
                    nova_compra[i] = compra[i];
                }   
                nova_compra[compra.length] = opcao2;
                cliente.setCompra(nova_compra);
            }
            if(opcao==3){
                Computador[] compra = cliente.compra;
                Computador[] nova_compra = new Computador[compra.length + 1];
                for (int i = 0; i < compra.length; i++) {
                    nova_compra[i] = compra[i];
                }   
                nova_compra[compra.length] = opcao3;
                cliente.setCompra(nova_compra);
            }
        }
        if(cliente.compra.length!=0){
        System.out.println("Opa "+cliente.nome+" a compra foi finalizada! o que foi comprado foi");
        for(int i=0;i<cliente.compra.length;i++){
            System.out.println("o "+i+1+"º computador comprado é o:");
            cliente.compra[i].mostraPCConfigs();
        }
        System.out.println("O valor total da compra foi:"+cliente.calculaTotalCompra() + " R$");
        System.out.println("Obrigado por comprar conosco, a minha matricula é 364... É to falando demais, mas é tudo burocracia da empresa");
        }else{
            System.out.println("Ah... "+cliente.nome+" Você... Não comprou nada... Valeu por passar eu acho, minha matricula é 364... Tenha um bom dia eu acho");
        }
    }
}