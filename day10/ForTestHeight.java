import java.util.Comparator;

public class ForTestHeight implements Comparator<Name> {
    @Override
    public int compare(Name o1, Name o2){
        return o2.getHeight()- o1.getHeight();
    }

}
