package desafio.itau.desafio_itau_fernando.controller;

import desafio.itau.desafio_itau_fernando.dto.TransactionRequest;
import desafio.itau.desafio_itau_fernando.model.Transaction;
import desafio.itau.desafio_itau_fernando.services.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionRequest request) {
        if (request.getDateTime().isAfter(OffsetDateTime.now()) || request.getValor() <= 0){
            return ResponseEntity.unprocessableEntity().build();
        }

        transactionService.addTransaction(new Transaction(request.getValor(),request.getDateTime()));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
