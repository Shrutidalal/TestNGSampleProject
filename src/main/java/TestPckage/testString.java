package TestPckage;

import java.util.HashMap;
import java.util.Map;

public class testString {

    public static String testUrl = "https://www.google.com/search?q=c%23+dictionary+import&oq=&aqs=chrome.1.69i59i450l8.162356100j0j15&sourceid=chrome&ie=UTF-8";

    public static String mainurl(){
        String mainUrlString = "";
        int strIndex = testUrl.indexOf("?");
        int endIndex = testUrl.indexOf("/");
       // String testLink = testUrl.substring(strIndex,endIndex);
        //System.out.println(testLink);
        String delim = "[/?=&]+";
        String[] testStr = testUrl.split(delim);
        System.out.println(testStr.length);
       for(String str : testStr) {
           if(str.contains("www")){
               mainUrlString = str;
           }

       }
       Map<String,String> testMap = new HashMap<String,String>();
       String newUrl = testUrl.substring(strIndex);
       String[] quesryPram = newUrl.split(delim);
       for(int x = 1;x<quesryPram.length;x++){
           testMap.put(quesryPram[x-1],quesryPram[x]);
       }
       for(Map.Entry entry : testMap.entrySet()){
           System.out.println("Keys: "+entry.getKey()+ "   value: "+ entry.getValue());
       }
        return mainUrlString;
    }

    public static void main(String[] args){

        String TestUrl = mainurl();
        System.out.println(TestUrl);
    }
}
