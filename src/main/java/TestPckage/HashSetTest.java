package TestPckage;

import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {

        String[] testArray = {"Apple", "Apple", "Cat", "Dog", "Banana", "Orange"};



        List<String> testList = Arrays.asList(testArray);

System.out.println(".............Printing ArrayList items...........");

for(String str : testList){System.out.println(str);};
        System.out.println(testList);

        Set<String> testSet = new HashSet<String>(testList);

        testSet.add("Dog");
        testSet.add("Mango");
        System.out.println("..............Printing HashSet......");
        System.out.println(testSet);

        testSet.forEach(System.out :: println);
        System.out.println("Testing set isEmpty: "+testSet.isEmpty());
        Iterator it = testSet.iterator();
        while (it.hasNext()){
            System.out.println("Using iterator to traverse set: "+it.next());
        }
 boolean bool = testSet.containsAll(testList);
        System.out.println("Compariosn of list and set elements: "+bool);


      testSet.toArray(testArray);

        System.out.println("..............Printing New Array......");
        for(String str : testArray){System.out.println(str);}

        Set<String> testTreeset = new TreeSet<String>(testSet);
        testTreeset.add("Shruti");
        testTreeset.add("Dalal");

        if(testTreeset.size() != testSet.size()){
            System.out.println("My treeSet is bigger in size: "+testTreeset.size());
            System.out.println("My Hashset is  size: "+testSet.size());
            System.out.println("hashcode value : "+testTreeset.hashCode());
        }
        else System.out.println("My Hashset is bigger in size: "+testSet.size());
    }

}
