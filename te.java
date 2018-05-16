import java.*;

public class Prog7
{
    public static void main(String[] args)
    {
        for(int i = 100;i <= 999;++i)
        {
            if(isFlower(i))
                System.out.println(i);
        }
    }
    public static boolean isFlower(int a)
    {
       return pow(a%10 , 3)+pow((a/10)%100 , 3)+pow((a/100)%1000 , 3) == a ? true : false;
    }

}

