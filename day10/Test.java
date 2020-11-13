import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    List<Name> i = new ArrayList<>();
    public void ristname(){
        i.add(new Name("션", 15, 180));
        i.add(new Name("승", 15, 190));
        i.add(new Name("신", 16, 160));
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.ristname();
        Collections.sort(test.i,new ForTestAge());
        Collections.sort(test.i, (Name o1, Name o2)->{
            return o2.getAge()- o1.getAge(); });
        test.compare();
        for(int n =0 ; n<test.i.size(); n++){
            System.out.print(test.i.get(n).getName());
            System.out.print(test.i.get(n).getAge());
            System.out.print(test.i.get(n).getHeight());
            System.out.println("\n");
        }
    }
    public void compare(){
        Collections.sort(i, new ForTestHeight());
    }
}
