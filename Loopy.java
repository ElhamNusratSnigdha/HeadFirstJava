public class Loopy {
    //example of while loop
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");
        while(x<4){
            System.out.println("In the loop");
            System.out.println("value of x is: "+x);
            x = x + 1;
        }
        System.out.println("This is after the loop");

        //more examples
        int y = 4; //assign 4 to y
        while (y>3){
            //loop will run because, x is greater than 3
            y = y-1;
        }
        int z = 27;
        while(z==17){
            //loop will never run because, z is not equal to 17
        }
    }
}
