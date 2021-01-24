import java.util.ArrayList;

public class BuggyCodeTester {

    public static void main(String[] args) {
        BuggyCode testerObject = new BuggyCode();

        ArrayList<Double> testArr = new ArrayList<>();
        testArr.add(3.6);
        //testArt == 9.9
        double testArrSize = testerObject.sumArray(testArr);
        System.out.println("testArr size = " + testArrSize);
    }

}
