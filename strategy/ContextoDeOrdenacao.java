import java.util.List;
public class ContextoDeOrdenacao {
    EstrategiaOrdenacao estrategia;
    public void setEstrategia(EstrategiaOrdenacao estrategia){

        this.estrategia = estrategia;
        
    }


    public void executarOrdenacao(List<Integer> numeros){
        estrategia.ordenar(numeros);
    }
}
