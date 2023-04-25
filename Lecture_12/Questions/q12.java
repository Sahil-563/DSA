public class q12 {
    public static void removeDuplicates(StringBuilder newstr,int indx, boolean map[],String orgStr){
        if(indx == orgStr.length()){
            System.out.print(newstr);
            return;
        }
        char currchar = orgStr.charAt(indx);
        if(map[currchar-'a']==true){
            removeDuplicates(newstr, indx+1, map, orgStr);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicates(newstr.append(currchar), indx+1, map, orgStr);
        }

    }
    public static void main(String args[]){
        int indx = 0;
        boolean map[] = new boolean[26];
        String orgStr = "apnaacollege";
        removeDuplicates(new StringBuilder(""), 0, map, orgStr33);

    }
    
}
