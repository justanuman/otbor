package task_2;

public class TaskTwo {
    public boolean check(double x) {
        if(Math.floor(x) == x)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        TaskTwo task_two= new TaskTwo();
        java.util.Scanner in = new java.util.Scanner(System.in);
        Double x = in.nextDouble();
        if(task_two.check(x)){
            int chk= (int) Math.sqrt(x);
        for (int i=2; i<= chk;i++)
        {
            while (x%i==0){
                System.out.println(i);
                x=x/i;
            }
        }
        if(x!=0){ System.out.println(x.intValue());}
        }else{
            System.out.println("Число не является целым");
        }
    }
}
