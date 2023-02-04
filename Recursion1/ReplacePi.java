

class ReplacePi{

    public static String replacePi(String str){

        if(str.length()==0){
            return "";
        }

        if(str.charAt(0)=='p' && str.charAt(1)=='i'){

            return "3.14"+ replacePi(str.substring(2));
        }


       return str.charAt(0) +  replacePi(str.substring(1));



    }

    public static void main(String[] args) {
        String str = "ppppiaaaaapi";
        System.out.println(replacePi(str));
    }
}