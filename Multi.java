import java.lang.*;

class Multi {

    public static void main(String arg[]) {
        int arr[][] = new int[3][2];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 50;
        arr[2][1] = 60;

        System.out.println(arr[0][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println("Length of array:" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
