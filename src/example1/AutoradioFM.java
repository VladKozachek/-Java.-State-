package example1;

//ConcreteState
public class AutoradioFM implements IRadioStation {
    @Override
    public void play() {
        System.out.println("Играет Авторадио");
    }
}
