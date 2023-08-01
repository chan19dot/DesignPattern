import java.util.ArrayList;
import java.util.List;

public class DesignPatterns {

    public static void main(String[] args) {
        Journal j = new Journal();
        j.addEntries("abcd");
        j.addEntries("2: askjhdia");
        System.out.println(j.getEntries());
    }

}

class Journal{
    private List<String> entries = new ArrayList<>();

    public void addEntries(String entry){
        entries.add(entry);
    }

    public String getEntries(){
        return String.join(System.lineSeparator(),entries);
    }
}
