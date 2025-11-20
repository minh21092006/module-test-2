import java.util.Comparator;
import java.text.Collator;
import java.util.Locale;
public class NameComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount a1, BankAccount a2) {
        Collator viCollator = Collator.getInstance(Locale.forLanguageTag("vi-VN"));
        viCollator.setStrength(Collator.PRIMARY);
        String lastName1=a1.getName().substring(a1.getName().lastIndexOf(" ")+1);
        String lastName2=a2.getName().substring(a2.getName().lastIndexOf(" ")+1);
        return viCollator.compare(lastName1, lastName2);
    }
}
