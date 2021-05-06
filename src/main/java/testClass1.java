import TestPckage.WebPage;

public class testClass1 {

    public static void TestMethod(){
        System.out.println("Sample method1");
    }

    public static void main(String[] args){

        WebPage w1 =new WebPage() {
            @Override
            public void header(String str) {

            }
        } ;
    }
}

