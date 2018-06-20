package example2;
//ConcreteState
public class Run implements SportsChargings {
    private int count=1;
    @Override
    public void doSomething(Human context) {
        while (count<4){
            System.out.println("Челоек пробежал "+ count+" км");
            count++;
        }
        context.setState(new Jump());
        context.doSomething();
    }
}
