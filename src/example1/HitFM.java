package example1;

//ConcreteState
public class HitFM implements IRadioStation {
    @Override
    public void play() {
        System.out.println("Играет Хит ФМ");
    }
}
