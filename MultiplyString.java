/**
 * Created by nikeshjoshi on 4/5/17.
 */
public class MultiplyString {
    public static void main(String args[]){
        System.out.println(add("9","129"));
        System.out.println(multiply("199","199"));
    }
    private static String multiply(String first,String second){
        String output =  "0";
        int count = 0 ;
        for(int i=first.length()-1;i>=0;i--){
            int a = first.charAt(i)- 48;
            String temp =  "";
            int carry = 0 ;
            for(int j=second.length()-1;j>=0;j--){
                int b = second.charAt(j)-48;
                int c = a*b;
                c += carry;
                int digit = -1;
                if(c>9){
                    carry = c/10;
                }
                else{
                    carry = 0 ;
                }
                digit = c%10;

                temp = digit+temp;
               // System.out.println(a+ " " +b +" "   + temp + " " + carry );
            }
            if(carry!=0){

                temp = carry + temp;
            }
            String tempStr = "";
            for(int ii=0;ii<count;ii++){
                tempStr += "0";
            }
           // System.out.println(temp+tempStr);
            output = add(temp+tempStr,output);
            count++;
        }
        return output;
    }
    private static String add(String first,String second){
        String answer = "";
        if(first.length()>second.length()){
            int diff = first.length()-second.length();
            String temp = "";
            for(int i=0;i<diff;i++){
                temp+= "0";
            }
            second = temp+second;
        }
        else if(first.length()<second.length()){
            int diff = second.length()-first.length();
            String temp = "";
            for(int i=0;i<diff;i++){
                temp+= "0";
            }
            first = temp+first;
        }

        int carry = 0 ;
        String output =  "";
        for(int i=first.length()-1;i>=0;i--){
            int a = first.charAt(i) - 48;
            int b= second.charAt(i) - 48;
            int c = a+b+carry;
            int digit = -1;
            if(c > 9 ){
                carry = c/10;

            }
            else{
                carry = 0 ;
            }
            digit = c%10;
            output += digit;

        }
        if(carry!=0){
            output += carry;
        }
        output = new StringBuffer(output).reverse().toString();
        return output;
    }
}
