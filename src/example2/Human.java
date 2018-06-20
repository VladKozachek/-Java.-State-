package example2;

//Context
public class Human {
    private SportsChargings state;

    public void setState(SportsChargings state) {
        this.state = state;
    }
    public void doSomething(){
        state.doSomething(this ); //передаем ссылку на Human
    }
}
