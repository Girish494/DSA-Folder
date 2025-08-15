public class Q2 {
    public static void main(String[] args) {
        int array[]={4,5,6,7,0,1,2};
        int s=0;
        int e=array.length-1;
        int ans=-1;
    //   int a=firstOccurance(array,s,e,2,ans);
    //   int b=lastOccurance(array,s,e,2,ans);
    //   System.out.println(totalOccurance(a,b));
        // System.out.println(lastOccurance(array,s,e,4,ans));
        System.out.println(sortedArray(array,s,e,3,ans));



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
    public static int totalOccurance(int a,int b){
        return (b-a)+1;
    } 
    public static int sortedArray(int array[],int s,int e,int target,int ans){
        if(s>e){
            return ans;
        }
        int mid=s+(e-s)/2;
        if(array[mid]==target){
            return mid;
        }
        else if(array[s]<=array[mid]){
            if(array[s]<=target&&target<array[mid]){
                e=mid-1;
                return sortedArray(array,s,e,target,ans);
            }else{
                s=mid+1;
                return sortedArray(array,s,e,target,ans);
            }
        }
        else{
            if(array[mid]<target&&target<=array[e]){
                s=mid+1;
                return sortedArray(array,s,e,target,ans);
            }else{
                e=mid-1;
                return sortedArray(array,s,e,target,ans);
            }
        }
    }
}
  