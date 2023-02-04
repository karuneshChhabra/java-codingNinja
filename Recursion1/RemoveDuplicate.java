

class RemoveDuplicate{


    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length()==1){
            return s;

        }

        String result= removeConsecutiveDuplicates(s.substring(1));

        if(result.charAt(0) == s.charAt(0)){
            return result;
        }else {
           return s.charAt(0) + result;
        }



    }
    public static void main(String[] args) {
        String str = "xaxbxxxxxxbbbbbba";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}