package TestPckage;

public class TestPalindrome {

    public static boolean isPalindrome(int x){
        int r,sum=0,temp;
        int n=x;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome number "); return true;}
        else
        { System.out.println("not palindrome"); return false;}

    }

    public static boolean isStrinPalindrome(String teststr){
        String reversestr = "";
        char[] characters = teststr.toCharArray();
        for(int x=characters.length-1;x>=0;x--){
            reversestr = reversestr + characters[x];
        }
        if(reversestr.equals(teststr)) {System.out.println("String is palindrome "+teststr); return true;}
        else System.out.println("String is not palindrome: "+reversestr); return false;
    }
    public static void main(String[] args){
    boolean result = isPalindrome(-454);
    System.out.println(result);
   boolean strResult = isStrinPalindrome("Apple ");

    }
}
