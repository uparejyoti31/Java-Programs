import java.util.*;

class Input {
    public static float Addition(float iNo1, float iNo2) {
        float iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public static void main(String arg[]) {
        float iValue1 = 0, iValue2 = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        iValue1 = sobj.nextFloat();
        System.out.println("Enter first number");
        iValue2 = sobj.nextFloat();

        iRet = Addition(iValue1, iValue2);
        System.out.println("Addition is:" + iRet);

    }
}
