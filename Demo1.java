public class Demo1 {
    public static void main(String[] args) {
        int x = 0;
        int z = 5;
        while (x++ < 5) {
            int y = 0;
            while (y++ < z) {
                System.out.print("+ ");
            }
            z--;
            System.out.println();
        }
        while (x++ < 10){
            int y = 0;
            while (y++ < x - 5) {
                    System.out.print("+ ");
            }
            System.out.println();
        }
    }
}