public class Car extends Transport {
    private int passangers;

    public Car(float speed, boolean work){
        super(speed, work);
    }

    public Car(float speed, boolean work, int passangers){
        super(speed, work);
        this.passangers = passangers; //1
    }
}
