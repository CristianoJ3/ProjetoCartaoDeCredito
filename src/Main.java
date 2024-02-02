import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        float limiteCartao = 3000.00F;

        ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

        while (limiteCartao >= 0 ){

            System.out.println("O limite do cartão é de: " + limiteCartao + "\n");

            System.out.println("Informe o produto que deseja comprar: ");
            Scanner produtoDesejado = new Scanner(System.in);
            String nomeProduto = produtoDesejado.nextLine();

            System.out.println("\nInforme o valor do referido produto: ");
            Scanner valorProduto = new Scanner(System.in);
            float valorDoProduto = valorProduto.nextFloat();

            if(limiteCartao < valorDoProduto){
                System.out.println("\nSaldo insuficiente!\n");
                System.out.println("\n***********************\n");
                System.out.println("COMPRAS REALIZADAS: \n");
                Collections.sort(listaDeProdutos);
                System.out.println(listaDeProdutos);
                System.out.println("\n***********************\n");
                break;
            }else{
                limiteCartao -= valorDoProduto;
                System.out.println("\nCOMPRA REALIZADA! Seu saldo do cartão é: R$ " + limiteCartao);
                listaDeProdutos.add(new Produtos(nomeProduto,valorDoProduto));
            }

            /// Trecho de código para controlar a continuidade ou saída do programa
            System.out.println("\nProsseguir? (S/N) ");
            Scanner valorInOut = new Scanner(System.in);
            String valor = valorInOut.nextLine();

            if (valor.equals("N") || valor.equals("n")){
                System.out.println("Encerrando sua compra! Obrigado, volte sempre!\n");
                System.out.println("\n***********************\n");
                System.out.println("COMPRAS REALIZADAS: \n");
                Collections.sort(listaDeProdutos);
                System.out.println(listaDeProdutos);
                System.out.println("\n***********************\n");
                break;
            }
            else if (valor.equals("S") || valor.equals("s")){
                System.out.println("Você optou por continuar a compra!\n");
            }
            else{
                System.out.println("Valor inválido! A aplicação será encerrada!\n");
                break;
            }
        }
    }
}