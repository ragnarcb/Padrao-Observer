package observerCorrigido;

public class Namorada implements ChegadaAniversarianteObserver {
	 
    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Pegar o confete...");
        System.out.println("Pegar o Fosforo...");
        System.out.println("Pegar o bolo...");
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer silêncio...");
        System.out.println("Surpresa!!!");
    }
}
