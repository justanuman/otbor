package task_4;
public class taskFour {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String n = in.nextLine();
        char[] c = n.toCharArray();
        String space= "  ";
        int biggest=0;
        StringBuilder line1= new StringBuilder();
        StringBuilder line2= new StringBuilder();
        StringBuilder line3= new StringBuilder();
        StringBuilder line4= new StringBuilder();
        StringBuilder line5= new StringBuilder();
        for (int i=0;i<c.length;i++)
        {
            if(Character.getNumericValue(c[i])>biggest){
                biggest =Character.getNumericValue(c[i]);
            }
        }
        for(int i=0;i<c.length;i++)
        {
            int h=Character.getNumericValue(c[i]);
            switch(h){
                case(0):
                    if(biggest==0){
                        line1.append("0000000");
                        line2.append("0     0");
                        line3.append("0     0");
                        line4.append("0     0");
                        line5.append("0000000");
                    }else {
                        line1.append("*******");
                        line2.append("*     *");
                        line3.append("*     *");
                        line4.append("*     *");
                        line5.append("*******");
                    }break;
                case (1):
                    if(biggest==1){
                        line1.append("1");
                        line2.append("1");
                        line3.append("1");
                        line4.append("1");
                        line5.append("1");
                    }else {
                        line1.append("*");
                        line2.append("*");
                        line3.append("*");
                        line4.append("*");
                        line5.append("*");
                    }break;
                case (2):
                    if(biggest==2){
                        line1.append("222222");
                        line2.append("     2");
                        line3.append("222222");
                        line4.append("2     ");
                        line5.append("222222");
                    }else {
                        line1.append("******");
                        line2.append("     *");
                        line3.append("******");
                        line4.append("*     ");
                        line5.append("******");
                    }break;
                case (3):
                    if(biggest==3){
                        line1.append("333333");
                        line2.append("     3");
                        line3.append("333333");
                        line4.append("     3");
                        line5.append("333333");
                    }else {
                        line1.append("******");
                        line2.append("     *");
                        line3.append("******");
                        line4.append("     *");
                        line5.append("******");
                    }break;
                case (4):
                    if(biggest==4){
                        line1.append("4    4");
                        line2.append("4    4");
                        line3.append("444444");
                        line4.append("     4");
                        line5.append("     4");
                    }else {
                        line1.append("*    *");
                        line2.append("*    *");
                        line3.append("******");
                        line4.append("     *");
                        line5.append("     *");
                    }break;
                case (5):
                    if(biggest==5){
                        line1.append("555555");
                        line2.append("5     ");
                        line3.append("555555");
                        line4.append("     5");
                        line5.append("555555");
                    }else {
                        line1.append("******");
                        line2.append("*     ");
                        line3.append("******");
                        line4.append("     *");
                        line5.append("******");
                    }break;
                case (6):
                    if(biggest==6){
                        line1.append("666666");
                        line2.append("6     ");
                        line3.append("666666");
                        line4.append("6    6");
                        line5.append("666666");
                    }else {
                        line1.append("******");
                        line2.append("*     ");
                        line3.append("******");
                        line4.append("*    *");
                        line5.append("******");
                    }break;
                case (7):
                    if(biggest==7){
                        line1.append("777777");
                        line2.append("     7");
                        line3.append("     7");
                        line4.append("     7");
                        line5.append("     7");
                    }else {
                        line1.append("******");
                        line2.append("     *");
                        line3.append("     *");
                        line4.append("     *");
                        line5.append("     *");
                    }break;
                case (8):
                    if(biggest==8){
                        line1.append("888888");
                        line2.append("8    8");
                        line3.append("888888");
                        line4.append("8    8");
                        line5.append("888888");
                    }else {
                        line1.append("******");
                        line2.append("*    *");
                        line3.append("******");
                        line4.append("*    *");
                        line5.append("******");
                    }break;
                case (9):
                    if(biggest==9){
                        line1.append("999999");
                        line2.append("9    9");
                        line3.append("999999");
                        line4.append("     9");
                        line5.append("999999");
                    }else {
                        line1.append("******");
                        line2.append("*    *");
                        line3.append("******");
                        line4.append("     *");
                        line5.append("******");
                    }break;
                default:break;
            }
            if(i!=c.length-1){
                line1.append("  ");
                line2.append("  ");
                line3.append("  ");
                line4.append("  ");
                line5.append("  ");
            }
        }
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
