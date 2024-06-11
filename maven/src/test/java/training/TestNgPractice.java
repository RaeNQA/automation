package training;

import org.testng.annotations.Test;

public class TestNgPractice {
    @Test(priority=2)
     void printes() {
        System.out.println("Test for testNG");
    }
    @Test()
    void login() {
        System.out.println("Test login");
    }

    @Test(enabled = false)
    void data() {
        System.out.println("Test browser");}
}
