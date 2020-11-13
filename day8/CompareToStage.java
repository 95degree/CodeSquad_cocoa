import java.util.Comparator;

public class CompareToStage implements Comparator<Id> {

    @Override
    public int compare(Id o1, Id o2) {
        return o2.getStage()-o1.getStage();
    }
}
