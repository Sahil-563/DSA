public class substring{
    public static void return_substring(String name){
        for(int i=0;i<name.length();i++){
            int start =i;
            for(int j=0;j<name.length();j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(name.charAt(k));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        String name ="Sahil";
        return_substring(name);
    }
}