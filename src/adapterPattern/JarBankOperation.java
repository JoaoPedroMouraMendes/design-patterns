package adapterPattern;

import java.math.BigDecimal;

public class JarBankOperation {
    public void deposit(BigDecimal value) {
        System.out.println("Depositando...");
    }

    public void withdraw(BigDecimal value) {
        System.out.println("Sacando...");
    }

    public boolean validateBalance(BigDecimal value) {
        return true;
    }
}
