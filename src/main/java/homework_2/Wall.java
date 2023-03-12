package homework_2;

public class Wall extends Obstacle{
    private float value;
    public Wall(float value){
        this.value=value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
