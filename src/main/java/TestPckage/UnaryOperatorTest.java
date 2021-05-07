package TestPckage;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

    public static void main(String[] args){

        List<String> lanList = new ArrayList<String>();

        lanList.add("Java");
        lanList.add("Ruby");
        lanList.add("Python");

       // UnaryOperator<ArrayList> func = str ->str.toUpperCase();
        lanList.replaceAll(ele -> ele.toUpperCase() +" Shruti".toUpperCase());
        System.out.println(lanList);

    }
}
