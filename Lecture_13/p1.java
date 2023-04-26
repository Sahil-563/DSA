public class p1 {
    public static String [] mergeSort(String [] arr,int lo,int hi){
        if(lo == hi){
            String [] a = {arr[lo]};
            return a;
        }
        int mid = (lo+hi)/2;
        String[] arr_1 = mergeSort(arr, lo, mid);
        String[] arr_2 = mergeSort(arr, mid+1, hi);
        String[] arr_3 = merge(arr_1,arr_2);
        return arr_3;

    }
    public static String[] merge(String [] arr_1,String [] arr_2){
        int n = arr_1.length;
        int m = arr_2.length;
        String [] arr_3 = new String[n+m];
        int indx = 0;
        int i = 0;
        int j = 0;
        while(i<n&&j<m){
            if(isalphabaticallysmaller(arr_1[i],arr_2[j])){
                arr_3[indx]=arr_1[i];
                i++;
                indx++;
            }
            else{
                arr_3[indx]= arr_2[j];
                j++;
                indx++;
            }
        }
        while(i<n){
            arr_3[indx++]=arr_1[i++];
        }
        while(j<m){
            arr_3[indx++]=arr_2[j++];
        }
        return arr_3;
    }
    public static boolean isalphabaticallysmaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        String arr[]={"sahil","vishal","ishan"};
        int lo = 0;
        int hi = arr.length-1;
        String[] a = mergeSort(arr, lo, hi);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ay");
        }

    }
    
}
