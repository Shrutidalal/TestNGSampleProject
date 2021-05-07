package TestPckage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

    public static HashMap<String,String> testtitleCategory(String[] titleArray,String[] categoriesArray){
        HashMap<String,String> testset = new HashMap<>();

        if(titleArray.length != categoriesArray.length ) {
            System.out.println("Intial arryas are not of same length");
            return null;
        }

        for(int i =0;i<titleArray.length;i++){

                testset.put(titleArray[i], categoriesArray[i]);

        }
        return testset;
    }

    public static void main(String[] args){
        String[] titleArray = {"Pluto TV Kids","Pluto TV Sports","Fear Factor"};
        String[] categoriesArray ={"5cca","4cba","2ecd"};
        HashMap<String,String> newSet = new HashMap<>(testtitleCategory(titleArray,categoriesArray));
        Iterator it = newSet.entrySet().iterator();
for(Map.Entry mapEntry : newSet.entrySet()){
    System.out.println("Key: "+mapEntry.getKey() + "  and Value: "+mapEntry.getValue());
}


        }
    }



