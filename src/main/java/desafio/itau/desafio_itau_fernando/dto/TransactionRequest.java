package desafio.itau.desafio_itau_fernando.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class TransactionRequest {

    @NotNull
    private double valor;
    @NotNull
    private OffsetDateTime dateTime;

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }
}
