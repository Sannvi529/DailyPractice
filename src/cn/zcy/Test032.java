package cn.zcy;

/**
 * @author 张英琪
 */
public class Test032 {
    //局部最小，相邻不相等
    public static int oneMinIndex(int arr[]){
        if(arr == null || arr.length == 0){
            return -1;
        }
        if(arr.length ==1){
            return 0;
        }
        if(arr[0] < arr[1]){
            return 0;
        }
        int N = arr.length;
        if(arr[N-1]>arr[N-2]){
            return N-2;
        }
        //三个及以上，数组大小
        int L = 0;
        int R = N-1;
        while(L< R-1){
            int mid = (L+R)/2;
            if(arr[mid-1]>arr[mid]&&arr[mid]<arr[mid+1]){
                return mid;
            }
            if(arr[mid]>arr[mid-1]){
                R = mid -1;
            }
            if(arr[mid]>arr[mid+1]){
                L = mid +1;
            }
        }
        return arr[L]>arr[R]?R:L;
    }
    public static int[] randomArray(int maxLen,int maxValue){
        int len = (int)(Math.random());
        int arr[] = new int[len];
        if(len>0){
            arr[0] = (int)(Math.random());
            for(int i = 1;i<len;i++){
                do{
                    arr[i] = (int)(Math.random());
                }while(arr[i]== arr[i-1]);
            }
        }
        return arr;
    }
    public static boolean check(int arr[],int midIndex){
        if(arr.length == 0){
            return midIndex == -1;
        }
        int left = midIndex-1;
        int right = midIndex +1;
        boolean leftBigger =  left>=0?arr[midIndex]<arr[left]:true;
        boolean rightBigger = right<arr.length?arr[midIndex]<arr[right]:true;
        return leftBigger && rightBigger;
    }

    public static void printArray(int arr[]){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int maxLen = 5;
        int maxValue = 20;
        int TestTime = 100000;
        System.out.println("测试开始开始");
        for (int i = 0;i< TestTime;i++){
            int arr[] = randomArray(maxLen,maxValue);
            int midIndex = oneMinIndex(arr);
            if(!check(arr,midIndex)){
                printArray(arr);
                System.out.println(midIndex);
                System.out.println("出错了");
            }
        }
        System.out.println("测试结束");
    }
}
