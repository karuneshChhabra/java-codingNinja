import java.lang.String;

class RemoveCharacter{


    public static String removeX(String input, char c, int index){
        // Write your code here
      if(index==input.length()){
          return "";
      }
      String resultStr =    removeX(input,c,index+1);

      if(input.charAt(index)==c){
          return ""+resultStr;
      }else {
          return  input.charAt(index)+ resultStr;
      }

    }

    public static  String removeX(String input){
        // Write your code here

        return removeX(input,'x',0);


    }

    public static  String removeX2(String input){

        if(input.length()==0){
            return "";
        }
        if(input.charAt(0)=='x'){
            return removeX2(input.substring(1));
        }
        return   input.charAt(0)+ removeX(input.substring(1));
    }

    public static void main(String[] args) {
        String str = "xaxbxxxxxxbbbbbba";
        System.out.println(removeX2(str));
    }
}