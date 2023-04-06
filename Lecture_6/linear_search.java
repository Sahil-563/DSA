public class liear_search{
    public static int linearSearch(int values[],int key){
        for(int i=0;i<values.length;i++){
            if(values[i]==key){
                return i;
            }
        }
        return -1;
    } 
    public static int linearSearch(String values[],String key){
        for(int i=0;i<values.length;i++){
            if(values[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String fruits[]={"Cherry","Mango","Apple"};
        String desired = "Apple";
        int index1 =linearSearch(fruits, desired);
        if(index1 == -1){
            System.out.print("Index not found");
        }
        else{
            System.out.println("Your key is: "+index1);
        }
        int values[]={1,2,3,4,5,6,7,8,9};
        int key = 8;
        int index =linearSearch(values, key);
        if(index == -1){
            System.out.print("Index not found");
        }
        else{
            System.out.print("Your key is: "+index);
        }

    }
}