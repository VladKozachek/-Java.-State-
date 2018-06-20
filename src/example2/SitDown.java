package example2;
//ConcreteState
public class SitDown implements SportsChargings {
    int count=1;
    @Override
    public void doSomething(Human context) {
        while (count<11){
            System.out.println("Челоек присел "+ count+" раз");
            count++;
        }
        System.out.println("Зарядка законченна");
    }
}
