package intern.questions;

public class PowerCheck {
    public static void main(String[] args)
    {
        System.out.println(isPower(4, 16) ? 1 : 0);
        System.out.println(isPower(1, 20) ? 1 : 0);
        System.out.println(isPower(2, 128) ? 1 : 0);
        System.out.println(isPower(2, 30) ? 1 : 0);
    }
    public static boolean isPower(int x, int y)
    {
        if (x == 1)
            return (y == 1);
 
        int pow = 1;
        while (pow < y)
            pow = pow * x;
 
        return (pow == y);
    }
}
