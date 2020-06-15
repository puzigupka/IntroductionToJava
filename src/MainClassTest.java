import org.junit.Test;

public class MainClassTest
{
    MainClass Main = new MainClass();
    /*@Test
    public void myFirstTest()
    {
        int a = Main.getLocalNumber(14);
    }*/

    @Test
    public void testGetClassNumber()
    {
        int a = Main.getClassNumber();
        if (a > 45){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

}
