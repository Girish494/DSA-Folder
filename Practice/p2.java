package Practice;

public class p2 {
    public static void main(String[] args) {
        int nums[]={3, 4, 4, 7, 8, 10};
        int x=4;
        int a=floor(nums,x,0,nums.length-1,nums.length);
        int b=ceil(nums,x,0,nums.length-1,nums.length);
        // System.out.println(a+" "+b);
        System.out.println(a);

       
    }
    public static int floor(int nums[],int target,int s,int e,int ans){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]>=target){
            int left=floor(nums,target,s,mid-1,ans);
            if(left!=-1){
                return left;
            }
            return mid;
        }else{
            return floor(nums,target,mid+1,e,ans);
        }
    }
    public static int ceil (int nums[],int target,int s,int e,int ans){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]>target){
            ans=mid;
            return ceil(nums,target,s,mid-1,ans);
        }else{
            return ceil(nums,target,mid+1,e,ans);
        }
    }
}