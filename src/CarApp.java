public class CarApp {
    public static void main(String[] args) {

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

    }
}
