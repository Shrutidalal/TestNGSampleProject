package TestPckage;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

    public static void main(String[] args){

        /**
         * Interface Function<T,R> type parameters: T - the type of he input to the function,
         * R- the type of the result of the function
         */

        Function<String, Integer> func = x->x.length();
       System.out.println( func.apply("This is test jave lambda"));


    }
}
