package observer;

public class LançamentoProduto {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        EquipeMarketing equipeMarketing = new EquipeMarketing();

        equipeMarketing.addLançamentoProdutoObserver(gerente);

        equipeMarketing.start();
    }

}
