package shreya;

public class NumberPalindrome {
    public static boolean isPalindrome(int x) {
        System.out.println("x = " + x);
        if(x < 0 || (x % 10 == 0)) {
            System.out.println("x = " + x);
            return false;
        }
        int num = x;

        int partReverse = 0;

        while(num>partReverse){

            partReverse = partReverse*10 +(num%10);
            num = num/10;

        }

        System.out.println("NUM = " + num);
        System.out.println("ReverseNum = " + partReverse);

        return num == partReverse || ( num == partReverse/10);

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }
}

