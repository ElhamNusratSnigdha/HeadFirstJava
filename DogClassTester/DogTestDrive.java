package DogClassTester;

public class DogTestDrive {
    public static void main(String[] args) {

        String Scientific_Name = "Canis lupus familiaris";

        Dog d1 = new Dog();
        d1.breed = "German Shepherd";
        d1.origin = "Germany";
        d1.LifeExpectancy = "9 – 13 years";
        d1.weight = "Male: 30–40 kg, Female: 22–32 kg";
        d1.height = "Male: 60–65 cm, Female: 55–60 cm";
        d1.availableColors = "Black, Black & Tan, Sable, Red & Black, Grey, Black & Silver";
        d1.Temperament = "Obedient, Intelligent, Curious, Alert, Loyal, Confident, Watchful, Courageous";
        d1.bark();

        //Object type of Array
        Dog[] pets = new Dog[7];

        //putting dog objects to each index variables
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();

        pets[0].origin = "Canada";
        System.out.print("Dog0 - ovigin: "+pets[0].origin+ " ");
        pets[0].bark();
    }
}
