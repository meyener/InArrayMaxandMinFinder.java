import java.util.Arrays;

public class InArrayMinMax {
    public static void main(String[] args) {
        int[] list={1,2,10,4,5,6,7,100,200};
        
        System.out.println(Arrays.toString(finder(list)));
    }

    static int[] finder(int[] arr){
        int max=0,min=0;
        
        for (int i = 0; i < arr.length; i++) {
            max=arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(max<arr[j]){
                    max=arr[j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            min=arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(min>arr[j]){
                    min=arr[j];
                }
                
            }
        }
        int[] b={min,max};
        return  b;
    }
      

}





