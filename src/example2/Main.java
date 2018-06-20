package example2;

public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        human.setState(new Run());
        human.doSomething();

    }
}
