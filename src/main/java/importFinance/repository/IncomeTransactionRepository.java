package importFinance.repository;

import importFinance.model.IncomeTransaction;
import org.springframework.data.repository.CrudRepository;

interface IncomeTransactionRepository extends CrudRepository<IncomeTransaction, Long> {
}
