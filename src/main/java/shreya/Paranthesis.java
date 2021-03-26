package shreya;

public class Paranthesis {

    static boolean validateParanthesis(String s){
        StackAsLinkedList<Character> stackAsLinkedList = new StackAsLinkedList();

       for(int i = 0; i<s.length(); i++){
           if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(' )
           {
               stackAsLinkedList.push(s.charAt(i));
           }else {
               char poppedEl = stackAsLinkedList.pop();
               switch (poppedEl){
                   case '(':
                       if(')'!=s.charAt(i)){
                           return false;
                       }
                       break;

                   case '{':
                       if('}'!=s.charAt(i)){
                           return false;
                       }
                       break;

                   case '[':
                       if(']'!=s.charAt(i)){
                           return false;
                       }
                       break;


               }


           }
        }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(validateParanthesis("[()]{}{[()()]()}"));

    }
}
