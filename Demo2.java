public class Demo2 {
    public static void main(String[] args) {
        int y = 0;
        while (y++ < 4) {
            int x = 0;
            while(x++ < 7) {
                if (y == 2 && x == 4) {
                    int z = 0;
                    while (z++ < 1) {
                        System.out.print("  ");
                    }
                    x += 1;
                }

                if (y == 3 && x == 3) {
                    int z = 0;
                    while (z++ < 3) {
                        System.out.print("  ");
                    }
                    x += 3;
                }

                if (y == 4 && x == 2) {
                    int z = 0;
                    while (z++ < 5) {
                        System.out.print("  ");
                    }
                    x += 5;
                }
                
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
