public class main {
    public static void main(String [] args) {
        System.out.println("Hello");
        for(int z=1; z<=10; z++) {
            int x = z%2;
            if (x<1) {
                System.out.println("z=" + z);
            }
        }
        System.out.println("Hello");
        int c=1;
        while(c<=10) {
            int x=c%2;
            if (x<1) {
            }
            else {
                System.out.println("c=" + c);
            }
                c++;
            }

        }
    }
