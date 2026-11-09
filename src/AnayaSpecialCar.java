public class AnayaSpecialCar {

    public boolean isFast;
    public int horsepower;
    public String carModel;

    public AnayaSpecialCar(boolean pIsFast, int pHorsepower, String pCarModel) {
    isFast = pIsFast;
    horsepower = pHorsepower;
    carModel = pCarModel;

    }

    public void printInfo(){
        System.out.println("The Anaya Special car's model is: " + carModel);
        System.out.println("The Anaya Special car's horsepower is: " + horsepower);
        System.out.println("It is " + isFast + " that Anaya Special Car is fast");
    }

    public void HorsepowerMultiplier(int pMultiplyBy){
        horsepower = horsepower * pMultiplyBy;
    } //Multiplies whatever is assignedin parameter
    public void makeFast(){
        isFast = !isFast;
    }//Does opposite of whatever I assign it

}
