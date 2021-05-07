package TestPckage;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class checkAnagrams {

    public static boolean isAnagram(String a, String b){
        char[] a_charArray = a.replace(" ","").toLowerCase().toCharArray();
        char[] b_charArray = b.replace(" ","").toLowerCase().toCharArray();
        String newSTR = a.replaceAll("\\s","").toLowerCase();
        System.out.println("Test replace ALL String method:"+newSTR);
        System.out.println(a_charArray);
        System.out.println(b_charArray);
         if(a_charArray.length != b_charArray.length){
             System.out.println("Input strings are not anagrams ");
             return false;
         }
        Arrays.sort(a_charArray);
         Arrays.sort(b_charArray);
        System.out.println(a_charArray);
        System.out.println(b_charArray);

         return (Arrays.equals(a_charArray,b_charArray));
    }

    public static boolean isAnagramStringMethod(String a, String b){
        a = a.replaceAll("\\s","").toLowerCase();
        b = b.replaceAll("\\s","").toLowerCase();
        if(a.length() != b.length()) {
            System.out.println("String are not Anagrams");
            return false;
        }

        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i) == b.charAt(j)){
                    System.out.println("Character testing for First string is: "+a.charAt(i));
                    System.out.println("Character testing for second string is: "+b.charAt(j));
                    b=b.substring(0,j)+b.substring(j+1);
                    //System.out.println(b.substring(0,j));
                    //System.out.println(b.substring(j+1));
                    System.out.println(b);
                    break;
                }
            }
        }
        if(b.length()==0) return true;
        else return false;
    }

    public static void main(String[] args){
       boolean result= isAnagram("Lis ten","Sil  ent");
       //System.out.println(result);
       boolean result1 = isAnagramStringMethod("anagramm","marganaa");
              System.out.println(result1);
              // String longestStringResult = findLongestSubString("aabbbbccccdddddaaaeefgh");
              // System.out.println(longestStringResult);
    }

    public static String findLongestSubString(String input){

        char[] inputArray = input.toLowerCase().toCharArray();
        String longestSubString = "";
        int longestSubStringLength = 0;
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character,Integer>();
        for(int x = 0;x<inputArray.length;x++){
            if(!charPosMap.containsKey(inputArray[x])){
                charPosMap.put(inputArray[x],x);
            }
            else{
                x=charPosMap.get(inputArray[x]);
                charPosMap.clear();
            }
        }
        if(charPosMap.size()>longestSubStringLength){
            longestSubStringLength = charPosMap.size();
            longestSubString = charPosMap.keySet().toString();
        }
        System.out.println("Length of longest substring is: "+longestSubStringLength);
        return longestSubString;
    }
}
