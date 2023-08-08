public class Demo5 {
    public static void main(String[] args) {
        int y = 0;
        while (y++ < 5) {
            int x = 0;
            while (x++ < 5) {
                if (y == 2 && x == 2) {
                    System.out.print("/ ");
                    x++;
                }
                if (y == 2 && x == 4) {
                    System.out.print("\\ ");
                    x++;
                }
                if (y == 4 && x == 2) {
                    System.out.print("\\ ");
                    x++;
                }
                if (y == 4 && x == 4) {
                    System.out.print("/ ");
                    x++;
                }
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
