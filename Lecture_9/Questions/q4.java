public class q4{
    public static String to_uppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str ="hello my name is sahil";
        System.out.print(to_uppercase(str));
    }
}