import java.util.Scanner;

public class StringPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro positivo no intervalo de 1 a 20
        System.out.print("Digite um número inteiro positivo entre 1 e 20: ");
        int n = scanner.nextInt();

        // Valida o número de entrada
        if (n < 1 || n > 20) {
            System.out.println("Erro: O número deve estar entre 1 e 20.");
            return;
        }

        // Solicita uma cadeia de caracteres de comprimento n
        System.out.print("Digite uma cadeia de caracteres com exatamente " + n + " caracteres: ");
        scanner.nextLine(); // Limpa o buffer do scanner
        String cadeia = scanner.nextLine();

        // Valida o comprimento da cadeia
        if (cadeia.length() != n) {
            System.out.println("Erro: A cadeia deve ter exatamente " + n + " caracteres.");
            return;
        }

        // Loop para permitir várias buscas de caracteres
        while (true) {
            System.out.print("Digite um caractere para buscar (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();

            // Verifica se o usuário quer sair
            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }
            // Valida se a entrada é um único caractere
            if (entrada.length() != 1) {
                System.out.println("Erro: Digite apenas um caractere.");
                continue;
            }
            char caractere = entrada.charAt(0);

            // Busca o caractere na cadeia
            int posicao = cadeia.indexOf(caractere);

            if (posicao != -1) {
                System.out.println("Caractere encontrado na posição: " + (posicao + 1));
            } else {
                System.out.println("Caractere não encontrado na cadeia.");
            }
        }

        scanner.close();
    }
}
