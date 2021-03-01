import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Zip <T> implements BiFunction <List<T>,List<T>, List<List<T>>> {
    public List<List<T>> apply(List<T> list1, List<T> list2){
        List<List<T>> list3 = new ArrayList<List<T>>();
        for (int i=0; i < list1.size(); i++) {
            List<T> innerlist = new ArrayList<T>();
            innerlist.add(list1.get(i));
            innerlist.add(list2.get(i));
            list3.add(innerlist);
        }
        return list3;
    }
}