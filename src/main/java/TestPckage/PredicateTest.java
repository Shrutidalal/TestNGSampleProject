package TestPckage;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args){

        Predicate<Integer> removedupes = x ->x>5;

        List<Integer> testList = Arrays.asList(23,24,25,1,2,3,5,7,8,9,9,10);

        List<Integer> newList1 = testList.stream().filter(x->!testList.contains(x)).collect(Collectors.toList());
        System.out.println("NewList without dupes is : " +newList1);

        List<Integer> newList = testList.stream().filter(removedupes).distinct().collect(Collectors.toList());

        System.out.println(newList);
    }
}
