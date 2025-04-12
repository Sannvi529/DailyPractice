/**
 * @author 张英琪
 */
public class Simulator {
    public void playSound(Animal animal){
        animal.cry();
        System.out.println("小动物的名字是"+animal.getAnimalName());
    }
}
