public class Demo6 {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 5) {
            int y = 0;
            while (y++ < 5) {
                if (x == 1 && y == 1) {
                    int z = 0;
                    while (z++ < 2) {
                        System.out.print("  ");
                    }
                    y += 2;
                }
                if (x == 1 && y == 4) {
                    int z = 0;
                    while (z++ < 2) {
                        System.out.print("  ");
                    }
                    y += 2;
                    break;
                }

                if (x == 2 && y == 1) {
                    System.out.print("  ");
                    y++;
                }

                if (x == 2 && y == 5) {
                    System.out.print("  ");
                    y++;
                    break;
                }

                if (x == 4 && y == 1) {
                    System.out.print("  ");
                    y++;
                }

                if (x == 4 && y == 5) {
                    System.out.print("  ");
                    y++;
                    break;
                }

                if (x == 5 && y == 1) {
                    int z = 0;
                    while (z++ < 2) {
                        System.out.print("  ");
                    }
                    y += 2;
                }
                if (x == 5 && y == 4) {
                    int z = 0;
                    while (z++ < 2) {
                        System.out.print("  ");
                    }
                    y += 2;
                    break;
                }
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
