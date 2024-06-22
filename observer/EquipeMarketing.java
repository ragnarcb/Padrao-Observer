package observer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipeMarketing extends Thread {
    
    private List<LançamentoProdutoObserver> observers = new ArrayList<LançamentoProdutoObserver>();

    public void addLançamentoProdutoObserver(LançamentoProdutoObserver observer)  {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 1 para lançar um produto: ");

        while (true) {
            int valor = scanner.nextInt();

            if (valor == 1) {
                LançamentoProdutoEvent event = new LançamentoProdutoEvent(new Date(valor));

                for (LançamentoProdutoObserver observer : this.observers) {
                    observer.lançado(event);
                }
            } else {
                System.out.println("Opção inválida. Digite 1 para lançar um produto.");
            }
        }
    }

}
