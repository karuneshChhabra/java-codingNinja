

class StringPalindrome{


    public static boolean isStringPalindrome(String input,int si,int ei) {

        // Write your code here

        if(si>=ei){
            return true;
        }

        if(input.charAt(si)==input.charAt(ei)){
            return isStringPalindrome(input,si+1,ei-1);
        }else {
            return false;
        }



    }

    public static boolean isStringPalindrome(String input) {
        // Write your code here
       return isStringPalindrome(input,0,input.length()-1);
    }




    public static void main(String[] args) {


       boolean value = isStringPalindrome("racecar");
       System.out.println(value);

    }
}