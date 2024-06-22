package observer;

import java.sql.Date;

public class LançamentoProdutoEvent {

    private final Date horaDoLançamento;

    public LançamentoProdutoEvent(Date horaDoLançamento) {
        super();
        this.horaDoLançamento = horaDoLançamento;
    }

    public Date getHoraDoLançamento() {
        return horaDoLançamento;
    }

}
