import java.util.*;
public class ARMstrongRECURSION
{
    static int c=0;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int y=in.nextInt();
        c=count(y);
        if(y==ARMstrong(y))
        System.out.println("ARMSTRONG NUMBER");
        else
        System.out.println("NOT ARMSTRONG NUMBER");
    }
    public static int count(int y)
    {
        if(y==0)
        return 0;
        return 1+count(y/10);
    }
    public static int ARMstrong(int y)
    {
        if(y==0)
        return 0;
        return (int)Math.pow(y%10,c) + ARMstrong(y/10);
    }
}
