import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        var nome = leitor.nextLine();

        double saldo = 1500;

        System.out.println("Qual o valor a ser sacado? ");
        double valorSaque = leitor.nextDouble();


        if (saldo >= valorSaque) {

            if (valorSaque > 10 && valorSaque < 1000 && valorSaque % 10 == 0) {
                saldo = saldo - valorSaque;

                System.out.println("Olá " + nome + " ! O saque de valor " + valorSaque +
                        " foi realizado com sucesso!");

            } else if (valorSaque < 10) {
                System.out.println("Olá " + nome + " ! O saque de valor " + valorSaque +
                        " não foi realizado, porque é inferior a 10 reais");
            } else if (valorSaque % 10 != 0) {
                System.out.println("Olá " + nome + " ! O saque de valor " + valorSaque +
                        " não foi realizado, porque só temos notas de 10, 20, 50 e 100 reais");
            } else if (valorSaque > 1000) {
                System.out.println("Olá " + nome + " ! O saque de valor " + valorSaque +
                        " não foi realizado, porque é superior a 1000 reais");
            }
        } else {
            System.out.println("Olá " + nome + " ! O saque de valor " + valorSaque +
                    " não foi realizado, porque não tem saldo disponível");

        }
        System.out.println("O saldo atual é : " + saldo);
    }
}
