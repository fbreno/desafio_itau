package desafio.itau.desafio_itau_fernando.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transaction {

    private double valor;
    private OffsetDateTime dateTime;


    public Transaction(double valor, OffsetDateTime dateTime) {
        this.valor = valor;
        this.dateTime = dateTime;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public OffsetDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
