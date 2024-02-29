package randoop.generation.test;

import org.junit.Assert;
import org.junit.Test;

public class UniversityGradingSystemTest {

    @Test
    public void test0() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(0, true);
        Assert.assertEquals("C", res);
    }

    @Test
    public void test1() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(0, false);
        Assert.assertEquals("C", res);
    }

    @Test
    public void test2() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(75, true);
        Assert.assertEquals("A", res);
    }

    @Test
    public void test3() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(75, false);
        Assert.assertEquals("A", res);
    }

    @Test
    public void test4() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(100, true);
        Assert.assertEquals("A++", res);
    }

    @Test
    public void test5() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(100, false);
        Assert.assertEquals("A", res);
    }

    @Test
    public void test8() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(100, true);
        Assert.assertEquals("A++", res);
    }

    @Test
    public void test9() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(100, false);
        Assert.assertEquals("A", res);
    }

    @Test
    public void test10() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(70, true);
        Assert.assertEquals("B", res);
    }

    @Test
    public void test11() throws Throwable {
        String res = UniversityGradingSystem.determineGrade(70, false);
        Assert.assertEquals("B", res);
    }
}
