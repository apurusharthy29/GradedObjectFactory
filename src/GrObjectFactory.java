public class GrObjectFactory {
    public static void main(String[] args) {
    GrObjectFactory a = new GrObjectFactory();
    }//this is my psvm

    public int randomSize;
    public boolean isOpen = true; //data type is boolean
    public int yearFounded = 1010;//THESE THREE FOR FACTORY MONOPOLY BOX
    public String owner = "Anaya"; //Basic info about factory

    public AnayaSpecialCar Car1;
    public AnayaSpecialCar Car2;
    public AnayaSpecialCar Car3;

public GrObjectFactory() {

    System.out.println("Welcome to Anaya's Car Factory");
    System.out.println("This factory was founded in " + yearFounded);
    System.out.println("It is " + isOpen + " that the factory is now open to customers");

    Car1 = new AnayaSpecialCar(true, 1280, "Anaya 0910");
    Car1.printInfo ();

    randomSize = (int)(Math.random() * 1500);//range 0-1500
    Car2 = new AnayaSpecialCar(true, randomSize, "Anaya 1010");
    Car2.printInfo ();

    Car3 = new AnayaSpecialCar(true, 10, "Anaya 1009");
    Car3.HorsepowerMultiplier(20); //number in parameter * 20
    Car3.makeFast();//opposite of whatever is in parameter
    Car3.printInfo ();
}



}