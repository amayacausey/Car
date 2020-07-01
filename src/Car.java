public class Car extends Vehicle {
    private String make;
    private String model;
    private int mph;


    public Car() {

    }

    public Car(String make, String model,int mph) {
        this.make = make;
        this.model = model;
        this.mph=mph;

    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
    public void setMph(int mph) {
        this.mph = mph;
    }

    public int getMph() {
        return this.mph;
    }


    public String toString(){
        String msg = super.toString();
        return msg = "The "+msg + " " + make +" is starting";
    }
    public String toString2(){
        String msg2=super.toString();
        return msg2="The "+ msg2+" "+make+" is accelerating";
    }
    public String toString3(){
        String msg3=super.toString();
        return msg3=msg3+" "+ make+" is going " +mph+ " mph";
    }
    public String toString4(){
        String msg4=super.toString();
        return msg4=msg4+" "+make+" is stopped";
    }
    public String toString5(){
        String msg5=super.toString();
        return msg5=msg5+" "+make+" has stopped to have its emissions checked";
    }
    public String toString6(){
        String msg6=super.toString();
        return msg6=msg6+" "+make+" has just passed the ";
    }
}

