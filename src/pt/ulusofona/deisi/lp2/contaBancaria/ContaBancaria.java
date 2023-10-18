package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {
    int saldoInicial;

    public ContaBancaria(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    void deposita(int valor){
        saldoInicial +=valor;
    }

    boolean levanta(int valor){
        if(saldoInicial>=valor){
            saldoInicial -= valor;
            return true;
        }else {
            return false;
        }
    }

    String getSaldoComoString(){
        return Integer.toString(saldoInicial);
    }

}
