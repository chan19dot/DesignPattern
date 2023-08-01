import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streams {

    public static void main(String[] args) {
        Example ex = ()->{
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<10;i++){
                res.add(20+(int) Math.round(Math.random())*i);
            }
            return res;
        };
        List<Integer> numbers = ex.generateNumbers();
        System.out.println(numbers);
        List<Integer>nummies =numbers.stream().filter(num->{
            System.out.println("number:"+num);
            return num%2==0;
        }).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(nummies);
        streams s = new streams();
        System.out.println(s.doSomething.apply(12));
    }

    Function<Integer,String> doSomething = (num)-> "test";
}
