public class PoolPuzzleOne {
    public static void main(String[] args) {
        /*
        given clues,
        x = x - 1;
       *x = x + 1;
       *x = x + 2;
        x = x - 2;
       *x<4
        x>3
       *x>1
        x>0
       *x<1
       *System.out.print("a");
       *System.out.print(" ");
       *System.out.print("oise");
       *System.out.print("noys");
       *System.out.print("n");
       *System.out.print(" oyster");

        desired output:
        a noise
        annoys
        an oyster
         */
        int x = 0;

        while(x<4){ //it goes 0 to 3
            System.out.print("a");
            if(x<1){ //fixed
                System.out.print(" ");
            }
            System.out.print("n");
            if(x>1){
                System.out.print(" oyster");
                x = x + 2;
            }
            if(x == 1){ //fixed
                System.out.print("noys");
            }
            if(x<1){
                System.out.print("oise");
            }
            System.out.println(""); //fixed
            x = x + 1;
        }
    }
}
