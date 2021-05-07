package TestPckage;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public interface WebPage {

    void  header(String str);

    public static void Test(){
        int[] intialArr = {1,2,2,2,3,4,5};
        Set<Integer> newSet = new HashSet<Integer>();
        for(int x : intialArr){
            newSet.add(x);
        }
        Object[] newARR = newSet.toArray(new Integer[0]);
    }
}
