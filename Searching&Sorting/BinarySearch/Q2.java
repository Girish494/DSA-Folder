public class Q2 {
    public static void main(String[] args) {
        int array[]={1,2,3};
        int s=0;
        int e=array.length-1;
        int ans=-1;
        System.out.println(firstOccurance(array,s,e,1,ans));
        // System.out.println(lastOccurance(array,s,e,4,ans));


    }
    public static int lowerbond(int array[],int s,int e,int target,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]>=target){
            ans=mid;
            return lowerbond(array,s,mid-1,target,ans);
        }
        else{
            return lowerbond(array,mid+1,e,target,ans);
        }
    }
    public static int upperbond(int array[],int s,int e,int target,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]>target){
            ans=mid;
            return upperbond(array,s,mid-1,target,ans);
        }else{
            return upperbond(array,mid+1,e,target,ans);

        }
    }
    public static int serachInsert(int array[],int s,int e,int target,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]>=target){
            ans= mid;
            return serachInsert(array,s,mid-1,target,ans);
        }else{
            return serachInsert(array,mid+1,e,target,ans);
            
        }
        
    }
    public static int ceiling(int array[],int s,int e,int target,int ans){
        if(array[array.length-1]<target){
            return -1;
        }
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if (array[mid]>=target) {
            ans=array[mid];
            return ceiling(array,s,mid-1,target,ans);
        }else{
            return ceiling(array,mid+1,e,target,ans);
        }
    }
    public static int floor(int array[],int s,int e,int target,int ans){
       if(array[0]>target){
        return -1;
       }
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]<=target){
            ans=array[mid];
            return floor(array,mid+1,e,target,ans);
        }
        else{
            return floor(array,s,mid-1,target,ans);
        }
    }
    public static int firstOccurance(int array[],int s,int e,int target,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]==target){
            ans=mid;
            return firstOccurance(array,s,mid-1,target,ans);
        }else if(array[mid]>target){
            return firstOccurance(array,s,mid-1,target,ans);
        }else{
            return firstOccurance(array,mid+1,e,target,ans);
        }

    }
    public static int lastOccurance(int array[],int s,int e,int target,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]==target){
            ans=mid;
            return lastOccurance(array,mid+1,e,target,ans);
        }else if(array[mid]<target){
            return lastOccurance(array,mid+1,e,target,ans);
        }else{
            return lastOccurance(array,s,mid-1,target,ans);
        }
       
        
    }
}
