import java.util.*;

class CheckAb{

    public static boolean checkAB2(String input){

        if(input.length()==0){
            return true;
        }

        if(input.charAt(0) =='a'){
            if(input.length()>2 && input.substring(1,3).equals("bb")){
                return checkAB2(input.substring(3));
            }else{
                return   checkAB2(input.substring(1));
            }

        }

        return false;
    }


    public static boolean checkAB(String input) {
        // Write your code here


        if(input.length()==1){
            return true;
        }

        String firstValue = input.substring(0,1);
        System.out.println("firstValue:"+firstValue);
        if(firstValue.charAt(0)=='a'){
            if(input.length()>=3){
                String secondStr = input.substring(1,2);
                if(secondStr.equals("a")){
                    return checkAB(input.substring(1,input.length()));
                }else {
                    secondStr = input.substring(1,3);
                    System.out.println("secondStr:" + secondStr);
                    if (secondStr.equals("bb")) {
                        if (input.length() > 3) {
                            return checkAB(input.substring(3, input.length()));
                        } else {
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            }else{
                String secondStr = input.substring(1,2);
                System.out.println("firstValue:"+firstValue);
                if(secondStr.equals("a")){
                    return true;
                }else{
                    return false;
                }

            }
        }




return false;

    }



    public static int maximumProfit(int budget[]) {

        Arrays.sort(budget);
        int ans=Integer.MIN_VALUE;
        int n=budget.length;

        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,budget[i]*(n-i));
        }
        return ans;

    }

    public static void main(String[] args) {

        int[] input= {30, 20, 53, 14};
//        System.out.println(checkAB2("abbaa"));  //true
//        System.out.println(checkAB2("abbaab"));//false
//        System.out.println(checkAB2("abbaabb")); // true
//        System.out.println(checkAB2("abbabb")); //true
//        System.out.println(checkAB2("abbaaaaaaaa")); //true
//        System.out.println(checkAB2("abbaabbbb"));//false
//        System.out.println(checkAB2("abbaabbbbb"));//false
        System.out.println(maximumProfit(input));

    }
}