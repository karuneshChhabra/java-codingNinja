

class StringToInt{



    // last value get
    public static int convertStringToInt(String input){
        // Write your code here

        if(input.length()==1){
            return input.substring(input.length()-1,input.length()).charAt(0) -'0';
        }
        int ans = convertStringToInt(input.substring(0,input.length()-1));
        char firstValue = input.substring(input.length()-1,input.length()).charAt(0);
        int value2 = firstValue -'0';



        return ans*10+value2;


    }


    //00012345


    public static void main(String[] args) {
        System.out.println(convertStringToInt("00000012345000"));
    }
}