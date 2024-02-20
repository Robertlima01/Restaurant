import java.util.Scanner;

public class Restaurant {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, suco = 1, refri = 2, sanduiche = 3, torta = 4, total = 0;
        char valor;

        System.out.println("Restaurant Bolados");
        System.out.println("Cardápio");
        System.out.println("1-suco R$ 2,00");
        System.out.println("2-refri R$ 5,00");
        System.out.println("3-sanduiche R$ 8,00");
        System.out.println("4-torta R$ 11,00");

        do {
            System.out.println("digite o numero do seu pedido");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("voce escolheu suco");
                    suco = suco + 1;
                    break;
                case 2:
                    System.out.println("voce escolheu refri");
                    refri = refri + 1;
                    break;
                case 3:
                    System.out.println("voce escolheu sanduiche ");
                    sanduiche = sanduiche + 1;
                    break;
                case 4:
                    System.out.println("voce escolheu torta ");
                    torta = torta + 1;
                    break;
                default:
                    System.out.println("voce escolheu uma opcao invalida!, digite novamente");
            }

            System.out.println("deseja incluir outro item? (s ou n)");
            valor = entrada.next().charAt(0);
        } while (valor != 'n');

        if (suco > 1) {
            System.out.println("qtd de sucos " + suco);
        }
        if (refri > 2) {
            System.out.println("qtd de refris " + refri);
        }
        if (sanduiche > 3) {
            System.out.println("qtd de sanduiches " + sanduiche);
        }
        if (torta > 4) {
            System.out.println("qtd de tortas " + torta);
        }

        total = suco * 2 + refri * 5 + sanduiche * 8 + torta * 11;
        System.out.println("o total do pedido sera: R$ " + total);

        entrada.close();

    }

}

