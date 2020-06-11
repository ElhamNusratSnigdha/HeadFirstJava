public class Dog {
    //This is a 'Dog' class
    //you need to put this class file to 'source file' or 'main class'
    String name ;
    int size;
    public Dog(String s, int x){
        name = s;
        size = x;
    }

    //putting methods in this class
    void bark(int x){
        if(x>0){
            --x;
            System.out.println("Dog is barking");
        }
    }
    public void play(){

    }
}
