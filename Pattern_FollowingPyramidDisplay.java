/*
123454321
1234321
12321
121
1

*/

public class Pattern_FollowingPyramidDisplay {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            for (int k = i - 1; k >= 1; k--)
                System.out.print(k);

            System.out.println();
        }
    }
}
