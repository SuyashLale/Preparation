package shreya;

public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {

        int needleLength = needle.length();
        int haystackLength = haystack.length();
        for(int i=0; i<(haystackLength - needleLength +1); i++){

            String subString = haystack.substring(i, i+needleLength);
            System.out.println("Substring is "+subString);
            if(subString.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(new NeedleInHaystack().strStr("", ""));
    }
}
