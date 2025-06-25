import java.util.Scanner;

public class ecercicio1{
    
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.println("Informe a primeira NotaA: ");
        double notaA = notas.nextDouble();

        System.out.println("Informe a segunda NotaB: ");
        double notaB = notas.nextDouble();

        double mediaAprovacao = 7;

        double mediaNotas = notaA + notaB;

        if (mediaNotas >= mediaAprovacao) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    }
