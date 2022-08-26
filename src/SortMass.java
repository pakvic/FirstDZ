public class SortMass {

    public static void sort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
              if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        for(int i = 0 ; i < arr.length ; i++){
        System.out.println(arr[i]);
        }
}
}
