package DrumKitTester;

public class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.snare = false;
        d.playsnare();
        d.playTopHat();

        if(d.snare==true){
            d.playsnare();
        }
    }
}