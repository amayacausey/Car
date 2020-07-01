public class Vehicle {
    private String color ;

    public Vehicle(){

    }
    public Vehicle(String color){
        this.color=color;
    }
    public void setColor(String color){this.color=color;}
    public String getColor (){
        return this.color;
    }
    public String toString() {
        return "The " +color;
    }
    public boolean equals(String color){
       // if (this.color.equalsIgnoreCase(color))
        if (color.equalsIgnoreCase(this.color))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
