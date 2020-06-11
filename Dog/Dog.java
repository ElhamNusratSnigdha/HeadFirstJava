package Dog;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog(); //Dog Object
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3]; //Dog Array
        //putting Dog objects into each index variables
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //now access the Dogs using the array or references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //find-out last dog's name
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        //now loop through the array and tell all dogs to bark
        int x=0;
        while(x<myDogs.length){
            myDogs[x].bark();
            x = x+1;
        }
    }
    public void bark(){
        System.out.println(name+" says Ruff!");
    }
    public void eat(){}
    public void chaseCat(){}
}
