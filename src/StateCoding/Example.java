package StateCoding;

import java.util.ArrayList;
import java.util.List;

public class Example {
}

class CombinationLock
{
    private int [] combination;
    public String status;

    public CombinationLock(int[] combination)
    {
        this.combination = combination;
        status = "LOCKED";
    }

    public void enterDigit(int digit)
    {
        // todo: check digit and update status here
        if(status.equals("LOCKED")){
            status = String.valueOf(digit);
        }else{
            status += String.valueOf(digit);
        }

        if(combination.length==status.length()){
            StringBuilder temp= new StringBuilder();
            for (int character:
                 combination) {
                temp.append(character);
            }
            status = temp.toString().equalsIgnoreCase(status)? "OPEN" : "ERROR";
        }
    }
}