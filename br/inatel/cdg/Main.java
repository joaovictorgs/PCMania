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
        opcao1.sistemaOperacional.tipo = 32000;
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
        opcao2.sistemaOperacional.tipo = 64000;
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
        opcao3.sistemaOperacional.tipo = 64000;
        opcao3.addMemoriaUSB(memoria1000); 

        opcao1.mostraPCConfigs();
        opcao2.mostraPCConfigs();
        opcao3.mostraPCConfigs();
        int opcao=4;
        Scanner entrada = new Scanner(System.in);
        while (opcao!=0) {
            opcao = entrada.nextInt();
            if((opcao<0)||(opcao>3)){
                System.out.println("opção invalida, favor selecionar um valor entre 0 a 3");
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
    }
}
