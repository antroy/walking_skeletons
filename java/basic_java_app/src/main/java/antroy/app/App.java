package antroy.app;

/**
 * Created by ant on 26/03/16.
 */
public class App {
    public static void main(String ... args){
        App app = new App();
        System.out.println(app.hello());
    }

    public String hello(){
        return "Hi";
    }
}
