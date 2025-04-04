package br.inatel.cdg.PCMania.PC.Computador;

import br.inatel.cdg.PCMania.PC.HardwareBasico.HardwareBasico;
import br.inatel.cdg.PCMania.PC.MemoriaUSB.MemoriaUSB;
import br.inatel.cdg.PCMania.PC.SistemaOperacional.SistemaOperacional;

public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public HardwareBasico[] hardwareBasicos;
    public MemoriaUSB memoriaUSB;
    
    public Computador(){
        sistemaOperacional = new SistemaOperacional();
        HardwareBasico hardwarePrimeiraPeca = new HardwareBasico();
        HardwareBasico hardwareSegundaPeca = new HardwareBasico();
        HardwareBasico hardwareTerceiraPeca = new HardwareBasico();
        hardwareBasicos = new HardwareBasico[3];
        hardwareBasicos[0] = hardwarePrimeiraPeca;
        hardwareBasicos[1] = hardwareSegundaPeca;
        hardwareBasicos[2] = hardwareTerceiraPeca;
    }

    public String converteMegaPraGigaOuTera(float valor){
        int valor_resposta;
        if(valor>=1000000){
            valor_resposta=((int)valor)/1000000;
            return valor_resposta+"T";
        }
        valor_resposta=((int)valor)/1000;
        return valor_resposta + "G";
    }

    public void mostraPCConfigs(){
        System.out.println("As configurações do computador são:\nMarca: "+marca+"\nSistema Operacional: "+sistemaOperacional.nome +" " +converteMegaPraGigaOuTera(sistemaOperacional.tipo ) +"b");
        System.out.println("Processador: "+hardwareBasicos[0].nome +" "+ (int)hardwareBasicos[0].capacidade + "MhZ");
        System.out.println("Memória RAM: "+hardwareBasicos[1].nome +" "+ converteMegaPraGigaOuTera(hardwareBasicos[1].capacidade)  + "b");
        System.out.println("Memória: "+hardwareBasicos[2].nome +" "+ converteMegaPraGigaOuTera(hardwareBasicos[2].capacidade) + "b");
        if(memoriaUSB!=null){
        System.out.println("Memória USB: "+ memoriaUSB.nome +" "+ converteMegaPraGigaOuTera(memoriaUSB.capacidade) + "b");
        }else{
            System.out.println("Esse pc não possui Memória USB");
        }
    }
    public void addMemoriaUSB(MemoriaUSB memoriaUSB){
        if(this.memoriaUSB!=null){
            System.out.println("esse pc já possui memória USB");
        }else{
            this.memoriaUSB = memoriaUSB;
            
        }
    }
    
    

}
