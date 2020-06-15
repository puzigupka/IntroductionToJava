import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass Main = new MainClass();
    @Test
    public void myFirstTest()
    {
        int a = Main.getLocalNumber(14);
        Assert.assertTrue("the method does not return a number",a == 14);
    }

//    @Test
//    public void testGetClassNumber()
//    {
//        int a = Main.getClassNumber();
//        int b = 45;
//
//        Assert.assertTrue("20 * 3 <= 45",a > b);
//        if (a > 45){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//       }


}
