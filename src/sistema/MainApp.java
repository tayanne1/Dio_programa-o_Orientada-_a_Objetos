package sistema;

import java.util.Scanner;

import sistema.dispositivo.iPhone;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        iPhone meuIPhone = new iPhone();
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Reproduzir Música");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegar na Internet");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n-- Reproduzir Música --");
                    System.out.println("1. Tocar");
                    System.out.println("2. Pausar");
                    System.out.println("3. Selecionar Música");
                    System.out.print("Escolha uma opção: ");
                    int escolhaReproduzir = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    switch (escolhaReproduzir) {
                        case 1:
                            meuIPhone.tocar();
                            break;
                        case 2:
                            meuIPhone.pausar();
                            break;
                        case 3:
                            System.out.print("Digite o nome da música: ");
                            String musica = scanner.nextLine();
                            meuIPhone.selecionarMusica(musica);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    System.out.println("\n-- Aparelho Telefônico --");
                    System.out.println("1. Ligando para");
                    System.out.println("2. Atendendo chamada");
                    System.out.println("3. Iniciando correio de voz");
                    System.out.print("Escolha uma opção: ");
                    int escolhaTelefone = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    switch (escolhaTelefone) {
                        case 1:
                            System.out.print("Digite o número para ligar: ");
                            String numero = scanner.nextLine();
                            meuIPhone.ligar(numero);
                            break;
                        case 2:
                            meuIPhone.atender();
                            break;
                        case 3:
                            meuIPhone.iniciarCorreioVoz();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.println("\n-- Navegar na Internet --");
                    System.out.println("1. Exibindo página");
                    System.out.println("2. Adicionando nova aba");
                    System.out.println("3. Atualizando página");
                    System.out.print("Escolha uma opção: ");
                    int escolhaNavegador = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    switch (escolhaNavegador) {
                        case 1:
                            System.out.print("Digite a URL: ");
                            String url = scanner.nextLine();
                            meuIPhone.exibirPagina(url);
                            break;
                        case 2:
                            meuIPhone.adicionarNovaAba();
                            break;
                        case 3:
                            meuIPhone.atualizarPagina();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
