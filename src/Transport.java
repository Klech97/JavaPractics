public abstract class Transport {

    protected float speed;
    private boolean work;


    public Transport(float speed, boolean work) {
        System.out.println("Object created");
        setValue(speed, work);
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopMove();

    protected void setValue(float speed, boolean work){
        this.speed = speed;
        this.work = work;
    }

    class Engine{

        private boolean isReady;
        private int km;

        public void serValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;

        }

        public void info() {
            if(isReady)
                System.out.println("Work");
            else
                System.out.println("Not work");
        }
    }

}
