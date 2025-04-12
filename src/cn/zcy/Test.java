package cn.zcy;

/**
 * @author 张英琪
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        int arr[]= {12,12,11,10,456,53,4,5,65};
        t.printArry(arr);
        t.selectSort(arr);
        t.printArry(arr);
    }
    public static void printArry(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
    }
    //为优化的插入排序
    public static void insertSort(int arr[]){
        if(arr ==  null || arr.length < 2){
            return;
        }
        //0-n-1
        //0-0有序
        //0-1有序
        //0-2有序
        //0-n-1
        //01 12 23
        int N = arr.length;
        for(int end = 1;end <N;end++){
            int newNumIndex = end;
            while(newNumIndex-1>=0 && arr[newNumIndex-1]>arr[newNumIndex]){
                swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex--;
            }
        }
    }
    //优化过的插入排序
    public static void insertSortTwo(int arr[]){
        if(arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        //0-n-1
        for(int end = 1;end < N;end++){
            for(int pre = end-1;pre >=0 && arr[pre]>arr[pre+1] ;pre--){
                    swap(arr,pre,pre+1);
            }
        }

    }
    public static void selectSort(int arr[]){
        //0-n-1,找到min，放在开头
        //1-n-1
        if(arr ==  null && arr.length < 2){
            return;
        }
        int N = arr.length;
        for(int i =0;i< N;i++){
            int minindex = i;
            for(int j = i+1;j < N;j++){
                minindex = arr[j]>arr[minindex]?j:minindex;
            }
            swap(arr,i,minindex);
        }
    }
    public static void bubbleSort(int arr[]){
        //01 12 23 34
        //0-n-1
        //0-n-2
        int N = arr.length;
        for(int end = N-1;end >=0;end--){
            if(arr == null && arr.length < 2){
                return;
            }
            //做一件事，先比比较下表上的数字，在交换
            //01
            for(int Second = 1;Second <= end;Second++){
                if(arr[Second-1]>arr[Second]){
                    swap(arr,Second-1,Second);
                }
            }
        }
    }
}
