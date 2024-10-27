import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        int [] NumerosArray = {7, 6, 3, 2, 4, 5, 9, 1, 8, 10};

        for(int n: NumerosArray){

            numeros.add(n);
        }

        System.out.println("Escolha a forma que deseja ordenar a lista:");
        System.out.println("(1)BubbleSort (2)SelectionSort (3)InsertionSort");
        int escolha = teclado.nextInt();
        System.out.println("Lista original: " + numeros);

        if(escolha == 1){
            contexto.setEstrategia( new OrdenacaoBubbleSort());
            contexto.executarOrdenacao(numeros);
            System.out.println("Nova lista: " + numeros);
        }
        else if(escolha == 2){
            contexto.setEstrategia( new OrdenacaoSelectionSort());
            contexto.executarOrdenacao(numeros);
            System.out.println("Nova lista: " + numeros);
        }
        else if(escolha == 3){
            contexto.setEstrategia( new OrdenacaoInsertionSort());
            contexto.executarOrdenacao(numeros);
            System.out.println("Nova lista: " + numeros);
        }
        else{
            System.out.println("Opção inexistente");
            
        }
        

        

    }
}
