package cn.zcy;

/**
 * @author 张英琪
 */
public class bitOperation {
    public static void main(String[] args) {
        bitOperation oper = new bitOperation();
        int num = 12;
        oper.printl(num);
        oper.facOfNum(2);

        System.out.println("=================");
        int []arr =  {12,13,23,43,12,22,13};
        printArry(arr);
        bobbleSort(arr);
        printArry(arr);
    }
    //插入排序：
    public static void insertSort(int arr[]){
        if(arr == null ||arr.length <2){
            return;
        }
        //0 ~ 0  有序
        //0 - 1 有序
        //0-2 有序
        int N =arr.length;
        for(int end = 1;end < N;end++){            int newNumIndex = end;
            //12   3
            //123  4
            //1234 5
            //使其有序
            while(newNumIndex-1  >= 0 && arr[newNumIndex-1]>arr[newNumIndex] ){
                swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex--;
            }
        }
    }

    //冒泡排序
    public static void bobbleSort(int []arr){
        if(arr == null || arr.length  < 2){
            return;
        }
        //0-n-1
        //0-n-2
        int N = arr.length;
        for(int end = N-1; end >=0;end--){
            //干一件事
            // 比较+swap
            //范围：0-end
            //下标：01 12 23 34 45
            for(int second = 1; second <=  end ;second++){
                if(arr[second-1] > arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }

    }

    //选择排序
    public static void selectSort(int arr[]){
        if(arr == null || arr.length<2){
            return;
        }
        //0-n-1
        //1-n-1
        int N = arr.length;
        for(int i = 0;i < N;i++){
            //此时默认找到的arr[i]就是最小值，此时需要找i小标之后的min
            int minArryIndex = i;
            for(int j= i+1;j < N;j++){
                minArryIndex = arr[j] < arr[minArryIndex]?j:minArryIndex;
            }//找到最小值的位置了
            swap(arr,i,minArryIndex);
        }
    }
    public static  void swap(int arr[],int i,int j){
        int temp =  arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void printArry(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }





    //实现一个功能：打印一个整形的32位
    public void printl(int  num){
        for(int i = 31;i >= 0;i--){
            System.out.print((num & (1<<i))==0?"0":"1");
        }
        System.out.println();
    }

    //打印阶乘：1-n
    public void facOfNum(int n){
        long num = 1;
        long ans = 0;
        for(int i =1;i<= n;i++){
            num  *=  i;
            ans += num;
        }
        System.out.println(ans);
    }
}
