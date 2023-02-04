

class PairStar{


//    aa
//    a a
    public static String addStars(String s) {
        // Write your code here
        String newStr;
        if(s.length()==1){
            return s;
        }
        String value1 = addStars(s.substring(1,s.length()));
        String firstValue = s.substring(0,1);

        if(value1.charAt(0) == firstValue.charAt(0)){
            newStr = firstValue+"*"+ value1;
        }else{
            newStr = firstValue+ value1;
        }

        return newStr;

    }


    public static void main(String[] args) {

        String str= "helloo";
        System.out.println(addStars(str));
    }
}