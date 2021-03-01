import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionalJava {

    public static void main(String[] args) {
	    BiFunction<Integer,Integer,Integer> add = mathOperation("add");
        System.out.println(add.apply(2,4));
        BiFunction<Integer,Integer,Integer> subract = mathOperation("subtract");
        System.out.println(subract.apply(2,4));
        BiFunction<Integer,Integer,Integer> power = mathOperation("power");
        System.out.println(power.apply(2,4));


        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();

        // list1.add("Why");
        // list1.add("Who");
        // list1.add("Where");

        // list2.add("Why");
        // list2.add("Who");
        // list2.add("Where");

        // Zip <String> zip = new Zip();
        // System.out.println(zip.apply(list1,list2));
    }

    public static BiFunction<Integer,Integer, Integer> mathOperation (String mathOps){
        switch (mathOps){
            case "add": return (a,b) -> a+b;
            case "subtract": return (a,b) -> a-b;
            case "power": return (a,b) -> (int) Math.pow(a.doubleValue(),b.doubleValue());
            default:
                return (a,b) -> 0;
        }
    }
}

