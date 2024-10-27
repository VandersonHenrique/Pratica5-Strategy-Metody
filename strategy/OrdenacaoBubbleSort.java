import java.util.List;

public class OrdenacaoBubbleSort implements  EstrategiaOrdenacao {
    
    @Override
    public void ordenar(List<Integer> numeros){
        int n = numeros.size();
        boolean mudou;
        for (int i = 0; i < n - 1; i++){
            mudou = false;

            for (int j = 0; j < n - 1; j++) {
                if (numeros.get(j) >  numeros.get(j + 1)){
                    int temp = numeros.get(j);
                    numeros.set(j, numeros.get(j+1));
                    numeros.set(j + 1, temp);
                    System.out.println(numeros);
                    mudou = true;
                    

                    
                }
            }
        if(!mudou) break;
        }

        
    }

}
