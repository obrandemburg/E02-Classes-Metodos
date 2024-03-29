public class Conta {

    Cliente informacoes_Cliente = new Cliente();

    double saldo;

    double limite;

    int numero;

    String agencia;

     void imprimir(){
        /*
        Nome do dono da conta
        Número da conta
        Saldo atual
        Limite
        */

        System.out.println("Nome do dono: " + informacoes_Cliente.Nome);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("Limite: " + limite);
    }

}
