import java.util.Comparator;

public class IdComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount a1, BankAccount a2) {
        return a1.getAccountId().compareTo(a2.getAccountId());
    }
}
