import java.util.List;
public class OrdenacaoSelectionSort implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Integer> numeros){
       
        for (int i = 0; i < numeros.size() ; i++){

            int menor = i;

            for(int j = i + 1; j < numeros.size(); j++) {

                if (numeros.get(j) < numeros.get(menor)) {
                menor = j;
                }

            }

            int temp = numeros.get(i);
            numeros.set(i, numeros.get(menor));
            numeros.set(menor, temp);
            System.out.println(numeros);
        }
    
                
    }
           
}
    


