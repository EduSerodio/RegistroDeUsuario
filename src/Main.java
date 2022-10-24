import java.util.Scanner;

public class Main {

    /*Faça um programa que solicite do usuário seu nome e sobrenome separadamente, e a sua data de nascimento.
    Para a data solicite que o usuário digite 3 valores que representam o dia, mês e ano. Além disso, a partir das
    variáveis do nome e sobrenome obtenha em uma terceira com as iniciais do usuário.
    Em seguida, exiba uma mensagem, com seu nome, as iniciais do seu nome e sobrenome e sua data de nascimento no
    formato "dd / mm / aaaa". */

    public static void main(String[] args) {

        //criação de variáveis para capturar dados do usuário.
        String nome;
        String sobrenome;
        Integer dia;
        Integer mes;
        Integer ano;

        //criar um scanner para recuperar os dados digitados pelo usuario.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu primeiro nome ?");
        nome = scanner.next();

        System.out.println("Qual é o seu sobrenome ?");
        sobrenome = scanner.next();

        System.out.println(" Qual o dia em que nasceu ? ");
        dia = scanner.nextInt();

        System.out.println("Qual o mês em que nasceu ?");
        mes = scanner.nextInt();

        System.out.println("Em qual ano você nasceu ?");
        ano = scanner.nextInt();

        //Capturando as iniciais de nome e sobrenome
        String inicialNome = Character.toString(nome.charAt(0));
        String inicalSobrenome = Character.toString(sobrenome.charAt(0));

        System.out.println("O usuário " + nome + " " + sobrenome + " " + inicialNome.toUpperCase() + inicalSobrenome.toUpperCase() +  " nasceu " + dia + "/" + mes + "/" + ano );

    }
}