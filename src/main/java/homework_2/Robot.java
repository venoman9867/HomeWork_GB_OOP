package homework_2;

public class Robot extends AbstractClass{
    private final float maxHeight=5.0f;//метры
    private final int maxDistance=100000;//метры
    private boolean flag=true;

    @Override
    public void run(int treadmill) {
        if(maxDistance>=treadmill) {
            System.out.println(getClass().getName() + " пробежал!");
        }else{
            flag=false;
            System.out.println(getClass().getName()+" не смог пробежать");
        }
    }

    @Override
    public void jump(float wall) {
        if(maxHeight>=wall) {
            System.out.println(getClass().getName() + " прыгнул!");
        }else{
            flag=false;
            System.out.println(getClass().getName()+" не смог перепрыгнуть");
        }
    }
    @Override
    public boolean isFlag() {
        return flag;
    }
}
