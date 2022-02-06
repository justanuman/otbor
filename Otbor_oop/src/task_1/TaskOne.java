package task_1;
import static java.lang.Character.getNumericValue;
import static java.lang.Character.isDigit;
public class TaskOne {
    public int Clean(String n)
    {
        int res=0;
        for(int i=0; i<n.length();i++)
        {
            if((isDigit(n.charAt(i)))){
                res+=getNumericValue(n.charAt(i));
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String n = in.nextLine();
        TaskOne Task1 = new TaskOne();
        System.out.println(Task1.Clean(n));
    }
}
