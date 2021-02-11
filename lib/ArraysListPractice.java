import java.util.*;

public class ArraysListPractice {
    public ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
    public Set<Integer> integerSet = new HashSet<Integer>(); 

    public void usingArrayLists() {
        Random random = new Random();

        while (integerArrayList.size() != 6){
            int randInt = random.nextInt(49 - 0) + 0;
            if (!integerArrayList.contains(randInt)) {
                integerArrayList.add(randInt);
            }
        }
        Collections.sort(integerArrayList);
    }

    public void usingSets() {
        Random random = new Random();

        while (integerSet.size() != 6) {
            integerSet.add( random.nextInt(49 - 0) + 0);            
        }
        Collections.sort(integerSet);
    }
}
