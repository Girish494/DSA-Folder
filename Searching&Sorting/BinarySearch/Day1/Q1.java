package Day1;
// https://leetcode.com/problems/binary-search/description/
public class Q1 {
    public static void main(String[] args) {
        int array[]={3,4,5,6,7,8,9,10};
        int start=0;
        int end=array.length-1;
        System.out.println(searchRecursion(array,start,end,11));
       
    }
    public static int search(int array[],int target){
        int start=0;
        int end=array.length-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
        

    }
    public static int searchRecursion(int array[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(array[mid]==target){
            return mid;
        }else if(array[mid]>target){
            return searchRecursion(array,start,mid-1,target);
        }else{
            return searchRecursion(array,mid+1,end,target);
        }

    }
}
