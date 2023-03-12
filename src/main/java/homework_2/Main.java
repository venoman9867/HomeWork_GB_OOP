package homework_2;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles=new Obstacle[]{new Wall(1.7f),new Wall(2.3f),new Treadmill(2900),new Treadmill(10000)};
        AbstractClass[] entities=new AbstractClass[]{new Human(),new Cat(),new Robot()};
        for (Obstacle obstacle:obstacles){
            if(obstacle.getClass()==Treadmill.class){
               for(int i=0;i<entities.length;i++){
                   if(entities[i].isFlag()==true){
                       entities[i].run(((Treadmill) obstacle).getValue());
                   }
               }

            }
            if(obstacle.getClass()==Wall.class){
                for(int i=0;i<entities.length;i++){
                    if(entities[i].isFlag()==true){
                        entities[i].jump(((Wall) obstacle).getValue());
                    }
                }
            }
        }
    }
}
