public class main {
    public static void main(String [] args) {
        System.out.println("Hello");
        for(int z=1; z<=10; z++) {
            int x = z%2;
            if (x<1) {
                System.out.println("z=" + z);
            }
        }
    }
}