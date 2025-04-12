package cn.zcy;

/**
 * @author 张英琪
 */
public class Test03 {
    public static int oneMinIndex(int arr[]){
        //0个数或者为空
        if(arr == null || arr.length == 0 ){
            return -1;
        }
        //数组中有一个数
        int N = arr.length;
        if(N == 1){
            return 0;
        }
        //arr.length == 2时，数组中有两个数
        if(arr[0]<arr[1]){
            return 0;
        }
        if(arr[N-1]<arr[N-2]){
            return N-1;
        }
        //数组中有多个数,有三个及三个以上的数
        int L = 0;
        int R = N-1;
        while (L < R-1){
            int mid = (L+R)/2;
            //1, 左边 > wo,wo < 右边，中必有一个局部最小
            //2，左边<wo,wo>右边，   砍去右边，只保留左边
            //3， 左边< wo,wo< 右边，砍去左边，只保留右边
            if(arr[mid] < arr[mid-1] && arr[mid] <arr [mid+1]){//先增后减，中间必有局域最小值
                return mid;
            }else{
                if(arr[mid] > arr[mid-1]){//函数中的递增，只保留较小的左边
                    R = mid-1;
                }else{//arr[mid]>arr[mid+1]，函数中的递减，只保留较小的右边
                    L = mid+1;
                }
            }
        }
        return arr[L]< arr[R] ? L : R;
    }
    //生成随机数组，且相邻两数不等
    public static int[] randomArray(int maxLen,int maxValue){
        int len = (int)(Math.random()*maxLen);
        int arr[] = new int[len];
        if(len>0){
            arr[0] = (int)(Math.random()*maxValue);
            for (int i = 1; i < len; i++) {
                do{
                    arr[i] = (int)(Math.random()*maxValue);
                }while(arr[i-1] == arr[i]);
            }
        }
        return arr;
    }
    public static boolean check(int arr[], int midIndex) {
        if(arr.length == 0){
            return midIndex == -1;
        }
        int left = midIndex-1;
        int right = midIndex+1;
        boolean leftBiggerWo = left >= 0 ? arr[left] > arr[midIndex]:true;
        boolean rightBiggerWo = right < arr.length ? arr[right] > arr[midIndex]:true;
        return leftBiggerWo && rightBiggerWo;
    }
    public static void printArray(int arr[]){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //二分法局部最小
        int maxLen = 8;
        int maxValue = 20;
        int testTime = 100000;
        System.out.println("测试开始：");
        for(int i = 0; i < testTime;i ++){
            int arr [] = randomArray(maxLen,maxValue);
            int ans = oneMinIndex(arr);
            if(!check(arr,ans)){
                printArray(arr);
                System.out.println(ans);
                System.out.println("出错了");
                break;
            }
        }
        System.out.println("测试结束");
    }

}
