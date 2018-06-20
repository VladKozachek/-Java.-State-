package example2;
//ConcreteState
public class Jump implements SportsChargings {
    private int count=1;
    @Override
    public void doSomething(Human context) {
        while (count<11){
            System.out.println("Челоек прыгнул "+ count+" раз");
            count++;
        }
        context.setState(new SitDown());
        context.doSomething();

    }
}
