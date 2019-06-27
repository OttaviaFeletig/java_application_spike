public class JavaApplication {

    public static void main(String[] args){

        Car myCar = new Car("Fiat", "600", 5, "red");
        Car mySecondCar = new Car("BMW", "Mini Cooper", 3, "green");
        System.out.println(myCar);

        System.out.println(myCar.getBrand());
        System.out.println(myCar.getDoors());
        System.out.println(mySecondCar.getModel());

        myCar.setColor("blue");
        System.out.println("Otta's car new color is " + myCar.getColor());

        Person ottavia = new Person("Ottavia", true);
        System.out.println(ottavia.getGlasses());

    }
}
