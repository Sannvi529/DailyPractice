package cn.zcy;

/**
 * @author 张英琪
 */
public class SumArray {
    public static void main(String[] args) {
        int arr[] ={0,1,2,3,4,5,6};
        RangeSum sum = new RangeSum(arr);
        int sum1 = sum.rangeSum(0,1);
        System.out.println(sum1);
    }
}
class RangeSum{
    private int [] preSum;
    public RangeSum(int arr[]){
        int  N  = arr.length;
        preSum  = new  int[N];
        preSum[0] = arr[0];
        for(int i = 1;i < N;i++){
            preSum[i] = preSum[i-1]+arr[i];
        }
    }
    public int rangeSum(int L,int R){
        return L ==0?preSum[R]:preSum[R]-preSum[R]-preSum[L-1];
    }
}