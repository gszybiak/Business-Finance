package importFinance.repository;

import importFinance.model.ExpenseTransaction;
import org.springframework.data.repository.CrudRepository;

interface ExpenseTransactionRepository extends CrudRepository<ExpenseTransaction, Long> {
}
