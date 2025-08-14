package Practice;

class p1 {
    public static void main(String[] args) {
         int arr[]={3, 4, 4, 7, 8, 10};
         int ans=arr.length;
         System.out.println(lowerBond(arr,-1,0,arr.length-1,ans));
        //  System.out.println(upperBond(arr,2,0,arr.length-1,ans));
         
    }
    public static int lowerBond(int arr[],int target,int s,int e,int ans){
          if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]>=target){
            ans=mid;
            return lowerBond(arr,target,s,mid-1,ans);
        }else{
            return lowerBond(arr,target,mid+1,e,ans);
        }
    }
    public static int upperBond(int arr[],int target,int s,int e,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]>target){
            ans=mid;
            return upperBond(arr,target,s,mid-1,ans);
        }else{
            return upperBond(arr,target,mid+1,e,ans);
        }
    }
}