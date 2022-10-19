import java.util.Scanner;

public class Questao5{
    public static void main(String[] args){
        Scanner lerValores = new Scanner(System.in);

        System.out.print("Insira um número entre 1 e 7: ");
        int valor = lerValores.nextInt();

        switch(valor){
            case 1: System.out.println("O primeiro dia da semana é a Segunda.");
                    break;
            case 2: System.out.println("O segundo dia da semana é a Terça.");
                    break;
            case 3: System.out.println("O terceiro dia da semana é a Quarta.");
                    break;
            case 4: System.out.println("O quarto dia da semana é a Quinta.");
                    break;
            case 5: System.out.println("O quinto dia da semana é a Sexta.");
                    break;
            case 6: System.out.println("O sexto dia da semana é o Sábado.");
                    break;
            case 7: System.out.println("O sétimo dia da semana é o Domingo.");
                    break;
            default: System.out.println("Insira um número!");
        }
    }
}