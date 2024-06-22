package observer;

public class Gerente implements LançamentoProdutoObserver {
    
    @Override
    public void lançado(LançamentoProdutoEvent event) {
        System.out.println("Notificando equipe de vendas...");
        System.out.println("Produto lançado com sucesso! Hora de promover!");
    }

}