import java.lang.*;

class Arithematic {
    // charcteristics
    public int no1;
    public int no2;

    public Arithematic() // Default constructor
    {
        this.no1 = 0;
        this.no2 = 0;
    }

    public Arithematic(int x, int y) // parameterised constructor
    {
        this.no1 = x;
        this.no2 = y;
    }

    public int Addition() {
        int ans = 0;
        ans = this.no1 + this.no2;
        return ans;
    }

    public int Substraction() {
        int ans = 0;
        ans = this.no1 - this.no2;
        return ans;
    }
}

class Marvellous {
    public static void main(String Arg[]) {
        System.out.println("Inside main");
        Arithematic obj1; // reference
        obj1 = new Arithematic(); // Dynamic
        Arithematic obj2 = new Arithematic(21, 11);
        int ret = 0;
        ret = obj2.Addition();
        System.out.println("Addition is:" + ret);

        ret = obj2.Substraction();
        System.out.println("Substraction is:" + ret);

    }

}
