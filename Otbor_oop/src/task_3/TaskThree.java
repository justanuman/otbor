package task_3;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.lang.Character;
public class TaskThree {

    public static void main(String[] args)
    {
        PriorityQueue<Support_for_word> pq = new
                PriorityQueue<Support_for_word>(5, new vowelComparator());
        java.util.Scanner in = new java.util.Scanner(System.in);
        String n = in.nextLine();
        String[] words = n.split(" ");
        for(int i=0;i<words.length;i++){
           Support_for_word newWord = new Support_for_word(words[i]);
           pq.add(newWord);
           newWord=null;
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll().getName());
        }

}}
    class vowelComparator implements Comparator<Support_for_word>
    {
        @Override
        public int compare(Support_for_word t1, Support_for_word t2) {
            if(t1.vowel<t2.vowel){
                return 1;}
            else if(t1.vowel>t2.vowel){
                return -1;}
           return 0;}
    }
class Support_for_word{
    public String word;
    public int vowel;
    public static boolean isVowel(char c) {
        return "уеыаоэяиёюУЕЫАОЭЯИЁЮ".indexOf(c) != -1;
    }
    public Support_for_word(String word)
    {
        this.word=word;
        String pattern = "(?i)[уеыаоэяиёю]";
        this.vowel= word.length()-word.replaceAll(pattern, "").length();
    }
    public String getName() {

        char[] c = word.toCharArray();
        for(int i=0; i<c.length;i++)
        {
            if(isVowel(c[i])){
                c[i]=Character.toUpperCase(c[i]);
                break;
            }
        }
        String out = String.valueOf(c);
        return out +" "+Integer.toString(vowel);
    }
}
