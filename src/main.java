public class main {
    static int j = 0;
    public static void main (String[] args){

        System.out.println("hello");
        boolean flag=true;
       // int j = 0;
        System.out.println("j="+j);

        System.out.println("j="+(j++));
        System.out.println("j="+(++j));

        System.out.println("j="+j);
        j+=2;
        System.out.println("j="+j);


       /* for (int i=1; i<=10; i++){
            System.out.println("i="+i);
            System.out.println("j="+j);
        }*/
        int i=1;
        while (i<=10){
            System.out.println("i="+i);
            i++;

        }

    }

}
