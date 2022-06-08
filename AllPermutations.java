import java.util.Scanner;

public class AllPermutations {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        printall(str,"");
    }
    static void printall(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            String leftpart=str.substring(0,i);
            String rightpart=str.substring(i+1);
            String rest=leftpart+rightpart;
            printall(rest,ans+c);
        }
    }
}
