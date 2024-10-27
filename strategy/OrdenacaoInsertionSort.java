import java.util.List;
public class OrdenacaoInsertionSort implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Integer> numeros){

        for( int i = 1; i < numeros.size(); i++){

            int j = i;

            while( j > 0 && numeros.get(j) < numeros.get(j-1) ){
                int temp = numeros.get(j);
                numeros.set(j, numeros.get(j - 1));
                numeros.set(j-1, temp );
                j-= 1;
                System.out.println(numeros);

            }


        }











    }
    
}
