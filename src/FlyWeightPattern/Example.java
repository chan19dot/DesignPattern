package FlyWeightPattern;
import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("Bonjour Tout le monde");
        sentence.getWord(1).capitalize=true;
        System.out.println(sentence);
    }
}


class Sentence
{
    public String text;
    private List<WordToken> brokenText;
    public Sentence(String plainText)
    {
        this.text = plainText;
        brokenText = Arrays.stream(plainText.split(" ")).map(WordToken::new).collect(Collectors.toList());
    }

    public WordToken getWord(int index)
    {
        return brokenText.get(index);
    }

    @Override
    public String toString()
    {
        return brokenText.stream().map(WordToken::toString).collect(Collectors.joining(" "));
    }

    static class WordToken
    {
        private final String token;
        public boolean capitalize;
        public WordToken(String token){
            this.token = token;
        }

        @Override
        public String toString(){
            if(capitalize){

                return token.toUpperCase();
            }
            return token;
        }
    }
}