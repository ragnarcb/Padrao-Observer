package observerCorrigido;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    
    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    public void monitorar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 1 para notificar a namorada da chegada do aniversariante, qualquer outro número para se manterem apostos:");
            int valor = scanner.nextInt();

            if (valor == 1) {
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date(System.currentTimeMillis()));

                for (ChegadaAniversarianteObserver observer : this.observers) {
                    observer.chegou(event);
                }
            } else {
                System.out.println("Manter silêncio para a surpresa!");
            }
        }
    }

}