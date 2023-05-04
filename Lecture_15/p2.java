public class p2 {
    static String map(int d){
        if(d==2){
            return "abc";
        }
        if(d==3){
            return "def";
        }
        if(d==4){
            return "ghi";
        }
        if(d==5){
            return "jkl";
        }
        if(d==6){
            return "mno";
        }
        if(d==7){
            return "pqrs";
        }
        if(d==8){
            return "tuv";
        }
        if(d==9){
            return "wxyz";
        }
        return "";


    }
    public static void solvekeypad(int n,String solSoFar){
        if(n==0){
            System.out.println(solSoFar);
            return;
        }
        int lastdigit = n%10;
        int smallnumber = n/10;
        String options = map[lastdigit];
        for(int i=0;i<options.length();i++){
            solvekeypad(smallnumber, options.charAt(i)+solSoFar);
        }

    }
    public static void main(String args[]){
        solvekeypad(23, "");

    }
    
}
