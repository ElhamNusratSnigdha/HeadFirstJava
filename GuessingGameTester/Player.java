package GuessingGameTester;

public class Player {
    int number = 0; //here the guess goes

    void guess(){
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing "+number);
    }
}
