import java.util.Scanner;
public class Ativ03 {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        double nota01, nota02, nota03, media;
        System.out.println("Escreva suas três notas e descubra se foi aprovado, reprovado, ou está de recuperação (Notas de 0 à 100).");
        
        do {
            System.out.print("Escreva a primeira nota: ");
            nota01 = scanner.nextDouble();
            if (nota01 < 0 || nota01 > 100) {
                System.out.println("Erro: Nota inválida!!");
            }
            }while (nota01 < 0 || nota01 > 100);
    
        do{
            System.out.print("Escreva a segunda nota: ");
            nota02 = scanner.nextDouble();
            if (nota02 < 0 || nota02 > 100) {
                System.out.println("Erro: Nota inválida!!");
            }
            }while (nota02 < 0 || nota02 > 100);
        
            do {
            System.out.print("Escreva a terceira nota: ");
            nota03 = scanner.nextDouble();
            if (nota03 < 0 || nota03 > 100) {
                System.out.println("Erro: Nota inválida!!");
            } 
            }while (nota03 < 0 || nota03 > 100);

            media = (nota01 + nota02 + nota03) / 3;
            System.out.print("\nA média das notas é: " + media);

            if (media >= 70) {
                System.out.println("\nALUNO APROVADO!");
            } else if (media >= 40 ) {
                System.out.println("\nALUNO EM RECUPERAÇÃO!");
            } else {
                System.out.println("\nALUNO REPROVADO!");
            }
        }
    }

