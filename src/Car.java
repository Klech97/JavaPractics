public class Car extends Transport implements iLights{
    private int passangers;
    private  boolean isOn;
    public Engine engine = new Engine();

    public Car(float speed, boolean work){
        super(speed, work);
    }

    public Car(float speed, boolean work, int passangers){
        super(speed, work);
        this.passangers = passangers; //1
    }

    @Override
    public boolean stopMove() {
        this.speed = 0;
        return true;
    }

    public void moveObject(float speed) {
        System.out.println("Скорость объекта:"+ speed);
    }


    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {

    }
}
