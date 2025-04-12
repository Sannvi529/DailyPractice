package cn.zcy;

/**
 * @author 张英琪
 */
public class TestDay2 {
    public static void main(String[] args) {
        int arr[] = {11,105,67,7,5,4,2};
        printArry(arr);
        selectSort(arr);
        printArry(arr);

    }
    public static void printArry(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
        int temp =  arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    //选择排序
    public static void selectSort(int  arr[]){
        //0-n-1
        //1-n-2
        int N = arr.length;
        for(int i= 0;i<N;i++){
            int minNumIndex = i;
            for(int j = minNumIndex;j< N;j++){
                minNumIndex =  arr[j]< arr[minNumIndex]?j:minNumIndex;
            }
            swap(arr,i,minNumIndex);
        }
    }
    //优化插入排序
    public static void insertSortTwo(int arr[]){
        if(arr == null && arr.length < 2){
            return;
        }
        int N =arr.length;
        for(int endIndex = 1;endIndex < N;endIndex++){
            for(int pre = endIndex-1;pre >= 0 && arr[pre]>arr[pre+1];pre--){
                swap(arr,pre,pre+1);
            }
        }
    }
    //插入排序
    public static void insertSort(int arr[]){
        if(arr == null|| arr.length <2){
            return;
        }
        //0123 4
        //0 1 2  3  n-1 n
        int N  = arr.length;
        for(int endIndex = 1; endIndex < N;endIndex++){
            //0123 4
            while(endIndex-1>=0 && arr[endIndex-1]>arr[endIndex]){
                swap(arr,endIndex-1,endIndex);
                endIndex--;
            }
        }
    }
    //冒泡排序
    public  static void bubbleSort(int arr[]){
        if(arr == null || arr.length < 2){
            return;
        }
        //01 12 23 34 n-1 n
        //0-n-1 0-n-2
        int  N = arr.length;
        for(int end =  N-1;end >= 0; end--){
            //01 12 23
            for(int second = 1; second <= end;second ++ ){
                if(arr[second-1]> arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }
    }
}
