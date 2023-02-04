import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n>0)
        {
            n--;
            String s1=s.next();
            String s2=s.next();
            if(s1.length()==0||s2.length()==0)
            {
                System.out.println("false");
                continue;
            }
            if (s1.length() > s2.length()) {
                System.out.println("false");
                continue;
            }
            int i=0;
            int prev=0;
            int count=0;

            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    prev=i;
                    i++;


                }else if(s1.charAt(prev)==s2.charAt(j)){

                    continue;
                }else{
                    System.out.println("false");
                    count=1;
                    break;
                }

            }

            if(i < s1.length()){
                System.out.println("false");
            }else if (count==0) {
                System.out.println("true");
            }

        }

    }
}
