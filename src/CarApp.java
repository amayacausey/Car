import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("-------Welcome to Application 1-------\n");
        //instance
        Car a = new Car();
        //setters
        a.setMake("Porsche");
        a.setColor("Red");
        a.setMph(50);


        Car b = new Car();
        b.setMake("Jetta");
        b.setColor("Blue");


        //The cars are starting
        System.out.println(a.toString());
        System.out.println(b.toString());
        //The cars are accelerating
        System.out.println(a.toString2());
        System.out.println(a.toString2());
        //check emissions
        System.out.println(b.toString5());

        System.out.println(a.toString3());
        System.out.println(a.toString4());
        //pass
        System.out.println(b.toString6()+a.getColor()+" "+a.getMake());

        System.out.println("\n------- You've finished App1 , Welcome to Application 2-------\n");


        ArrayList<Car> cars = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the make of the 1rst car");
        //String userMake= sc.nextLine();
        Car c = new Car();
        c.setMake(sc.nextLine());
        System.out.println("Please enter the model of the 1rst car");
        c.setModel(sc.nextLine());
        System.out.println("Please enter the color of the 1rst car");
        c.setColor(sc.nextLine());


        cars.add(c);

        Car d = new Car();
        System.out.println("\n-----------Thank you lets now enter car 2 information ----------\n");
        System.out.println("Please enter the make of the 2nd car");
        d.setMake(sc.nextLine());
        System.out.println("Please enter the model of the 2nd car");
        d.setModel(sc.nextLine());
        System.out.println("Please enter the color of the 2nd car");
        d.setColor(sc.nextLine());
        cars.add(d);

        for(Car car: cars){

            System.out.println(car.description());

        }








    }
}
