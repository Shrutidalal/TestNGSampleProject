import org.testng.annotations.*;

public class TestngTestClass {


    @Test
    public void testMethod(){
        System.out.println("This is test method.");


    }

    @BeforeSuite
    public void testBefore(){
System.out.println("This is test before suite,Set up chrome system properties");
    }

    @BeforeTest
    public void TestBeforeTest(){
        System.out.println("This is test beforeTest,Open Application");
    }

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("This is test BeforeClass,Open Chrome");

    }

    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("This is before testMethod test,Test login");
    }

    @AfterSuite
    public void testAfterSuite(){System.out.println("test aftersuite, clean chrome session cookies.");}

    @AfterTest
    public void testAfterTest(){
        System.out.println("This is test After Test");
    }

    @AfterClass
    public void testAfterClass(){
        System.out.println("Test after class, close chrome");
    }

    @AfterMethod
    public  void testAfterclassMethod(){
        System.out.println("Test after method, sign out");
    }

}
