package TestPckage;

import java.util.*;

public class ArrayListIteration {




    public static void main(String[] args) {
        List<String> TestList = new ArrayList<String>();
        TestList.add("testStr1");
        TestList.add("Shruti");
        TestList.add("GOT");
        TestList.add("Apple");
        TestList.add("Banana");

        //1.using java8 foreach loop and lambda exp

        TestList.stream().forEach(str ->System.out.println(str));


        //2.Using Iterator
Iterator<String> it =TestList.iterator();
while(it.hasNext()) System.out.println(it.next());


        //3. Using ListIterator

        System.out.println("..............Print using list Iterator...................");
        ListIterator<String> listIteratorTest =  TestList.listIterator(TestList.size());

        while (listIteratorTest.hasPrevious()) System.out.println(listIteratorTest.previous());
        HashMap<Integer,String> setMap = new HashMap<Integer,String>();

        setMap.put(1,"Apple");


    }
}
