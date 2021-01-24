import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;

public class BuggyCodeTest {
  BuggyCode testerObject;
  @Before
  public void setUp(){
    testerObject = new BuggyCode();
  }

  @Test
  public void sumArrayTest() {
    ArrayList<Double> testArr = new ArrayList<>();
    testArr.add(3.6);
    Assert.assertEquals(3.6, testerObject.sumArray(testArr), 0);
  }

  @Test
  public void getHypotenuseTest(){
    Assert.assertEquals(5, testerObject.getHypotenuse(3, 4), 0);
  }

  @Test
  public void distanceTest(){
    //First pair is pos1 = (0,1)
    //Second is pos2 = (3, 4)
    double x1, x2, y1, y2;
    x1 = 0;
    x2 = 1.0;
    y1 = 3.0;
    y2 = 4.0;
    double expected = 6.0;
    Assert.assertEquals(expected, testerObject.manhattanDistance(x1, x2, y1, y2), 0);
  }

  @Test
  public void stringDifference(){
    String testString1 = "test 1";
    String testString2 = "test 2";
    String testString3 = "testing";
    Assert.assertEquals(0, testerObject.stringDifference(testString1, testString2));
    Assert.assertEquals(1, testerObject.stringDifference(testString1, testString3));
    Assert.assertEquals(-1, testerObject.stringDifference(testString3, testString1));
    Assert.assertEquals(-1, testerObject.stringDifference(testString1, testString1));
  }

  @Test
  public void factorialTest(){
    int input = 6;
    int expected = 720;
    Assert.assertEquals(expected, testerObject.factorial(input));
  }
}
