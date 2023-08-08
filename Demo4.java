public class Demo4 {
    public static void main(String[] args) {
        int y = 0;
        while (y++ < 6) {
            int x = 0;
            while (x++ < 6) {
                if (y == 2 && x == 3) {
                    System.out.print("/ \\ ");
                    x += 2;
                }

                if (y == 3 && x == 2) {
                    int a = 0;
                    while (a++ < 2){
                        System.out.print("/ ");
                    }
                    int b = 0;
                    while (b++ < 2){
                        System.out.print("\\ ");
                    }
                    x += 4;
                }

                if (y == 4 && x == 2) {
                    int a = 0;
                    while (a++ < 2){
                        System.out.print("\\ ");
                    }
                    int b = 0;
                    while (b++ < 2){
                        System.out.print("/ ");
                    }
                    x += 4;
                }
                if (y == 5 && x == 3) {
                    System.out.print("\\ / ");
                    x += 2;
                }
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
