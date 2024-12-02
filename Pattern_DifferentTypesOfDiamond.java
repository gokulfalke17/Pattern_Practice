public class Pattern_DifferentTypesOfDiamond {

    public static void main(String[] args) {
        int n = 4;
        int num = 7;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
