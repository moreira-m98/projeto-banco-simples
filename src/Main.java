import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        dados iniciais
        System.out.print("Escreva seu nome: ");
        String nomeCliente = input.nextLine();
        String tipoConta = "Conta Corrente";
        System.out.printf("%s, qual seu limite inicial? ", nomeCliente);
        double saldoInicial = input.nextDouble();
        int escolha = 0;
        double saldoAtualizado = saldoInicial;

//        interface inicial
        System.out.printf("""
                ---- ----
                Seus dados
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                ---- ----
                """, nomeCliente, tipoConta, saldoInicial);

//        menu inicial
        while (escolha !=4) {
            System.out.printf("""
                \nSeja bem vindo ao nosso banco %s, em que podemos lhe ajudar?
                1. Consultar saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                """, nomeCliente);

            System.out.println("Escolha: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1: //consultar seu saldo
                    System.out.printf("\n%s, seu saldo é de %.2f", nomeCliente, saldoAtualizado);
                    break;
                case 2: //receber valor
                    System.out.println("Digite o valor a ser recebido: ");
                    double valorRecebido = input.nextDouble();
                    saldoAtualizado += valorRecebido;
                    System.out.printf("Seu saldo agora é de: %.2f\n", saldoAtualizado);
                    break;
                case 3: //transferir valor
                    System.out.println("Digite o valor a ser transferido: ");
                    double valorTransferido = input.nextDouble();
                    if (valorTransferido > saldoAtualizado) {
                        System.out.println("Não é possivel, você não possui esse saldo");
                    } else {
                        saldoAtualizado -= valorTransferido;
                        System.out.printf("Seu saldo atual é de: %.2f\n", saldoAtualizado);
                    }
                    break;
                case 4: //sair do menu
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção invalida.");
            }

        }
    }
}