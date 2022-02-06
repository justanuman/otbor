package task_5;

public class TaskFive {
    private static int Safe(int Space, int n, int[] price, int[] volume)
    {
        int Internals[] = new int[Space+ 1];
        for(int i = 0; i <= Space; i++){
            for(int j = 0; j < n; j++){
                if(volume[j] <= i){
                    Internals[i] = Math.max(Internals[i], Internals[i - volume[j]] + price[j]);
                }
            }
        }
        return Internals[Space];
    }
    public static void main(String[] args)
    {
        int Space = 100;
        int price[] = {10, 30, 20};
        int volume[] = {5, 10, 15};
        int n =3;
        System.out.println(Safe(Space, n, price, volume));
    }
}