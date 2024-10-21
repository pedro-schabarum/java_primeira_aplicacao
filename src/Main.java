//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcaoMenu = 0;

        while (opcaoMenu !=4){
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opção desejada:
                    """);
            opcaoMenu = leitura.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Insira o valor a ser depositado: ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Valor inserido com sucesso!");
                    break;
                case 3:
                    System.out.println("Insira o valor a ser transferido: ");
                    double valorEnviado = leitura.nextDouble();
                    if(valorEnviado > saldo){
                        System.out.println("Saldo insuficiente. Operação cancelada!\n");
                    }else{
                        saldo -= valorEnviado;
                    }
                    break;
            }
        }
    }
}