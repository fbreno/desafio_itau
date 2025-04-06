package desafio.itau.desafio_itau_fernando.services;

import desafio.itau.desafio_itau_fernando.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class TransactionService {

    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransactions() {
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                .filter(transaction -> transaction.getDateTime().isAfter(now.minusSeconds(60)))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }
}
