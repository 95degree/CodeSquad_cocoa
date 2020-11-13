import java.util.Comparator;

public class ForTestAge implements Comparator<Name> {

    @Override
    public int compare(Name o1, Name o2) {
        return o2.getAge()- o1.getAge();
    }
}
