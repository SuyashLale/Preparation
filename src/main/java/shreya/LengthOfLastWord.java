package shreya;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.trim().length();

        for(int i = length-1; i>=0; i--){
            if(s.charAt(i)==' '){
                int size = length - i-1;
                System.out.println("Size is "+size);
                return size;
            }

        }
        return length;

    }


    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" a"));
    }
}
