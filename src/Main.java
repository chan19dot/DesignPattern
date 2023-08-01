import java.util.concurrent.CompletableFuture;

public class Main {

    public static String example(){
        System.out.println("Inside Example");
        return "Thread";
    }

    public String doSomething(){
//        new Thread(()->{
//            System.out.println(example());
//            System.out.println("inside thread");
//        }).start();
        if(CompletableFuture.runAsync(()->{
            System.out.println(example());
        }).isDone()){
            System.out.println("It is done");
        }
        System.out.println("Outside thread");
        return "done";
    }


    public static void main(String[] args) {
        Main m = new Main();
        String res = m.doSomething();
        System.out.println(res);
        System.out.println("Hello world!");
    }
}