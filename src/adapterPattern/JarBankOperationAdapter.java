package adapterPattern;

import java.math.BigDecimal;

public class JarBankOperationAdapter {

    private JarBankOperation jarBankOperation;

    public JarBankOperationAdapter(JarBankOperation jarBankOperation) {
        this.jarBankOperation = jarBankOperation;
    }

    public void withdraw(BigDecimal value) {
        if (jarBankOperation.validateBalance(value)) {
            jarBankOperation.withdraw(value);
        } else {
            throw new IllegalArgumentException("Valor para saque não permitido");
        }
    }
}
