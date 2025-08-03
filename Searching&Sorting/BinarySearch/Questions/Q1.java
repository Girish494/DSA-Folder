package Questions;
// Ceiling problem
public class Q1 {
    public static void main(String[] args) {
        int array[]={1,1,2,2,2,2,4,5};
        System.out.println(totalOcc(array,9,0,array.length-1));

    }
    
// Ceiling problem
    public static int ceilingProblem(int array[],int target,int start,int end){
             if(target>array[array.length-1]){
            return -1;
         }
        if(start>end){
            return array[start];
        }
       
        int mid=start+(end-start)/2;
        if(target==array[mid]){
            return array[mid];
        }else if(target<array[mid]){
            end=mid-1;
            return ceilingProblem(array,target,start,end);
        }else{
            start=mid+1;
            return ceilingProblem(array,target,start,end);
        }

    }
    // floor problem
    public static int floorProblem(int array[],int target,int start,int end){
        if(target<=0){
            return -1;
        }
        if(start>end){
            return array[end];
        }
        int mid=start+(end-start)/2;
        if(array[mid]==target){
            return array[mid];
        }else if(array[mid]>target){
            return floorProblem(array,target,start,mid-1);
        }else{
            return floorProblem(array,target,mid+1,end);
        }
    }
     public static int firstOcc(int array[],int target,int s,int e){
        
        // base condition
        if(s>e){
            return -1;
        }
       int ans=-1;
        int mid=s+(e-s)/2;
        if(target==array[mid]){
           int left=firstOcc(array,target,s,mid-1);
           if(left!=-1){
            return left;
           }
           return mid;
            
        }else if(target<array[mid]){
            return firstOcc(array,target,s,mid-1);
        }else{
            return firstOcc(array,target,mid+1,e);
        }
        
    }   
    public static int lastOcc(int array[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int ans=-1;
        int mid=s+(e-s)/2;
        if(target==array[mid]){
            int right=lastOcc(array,target,mid+1,e);
           if(right!=-1){
            return right;
           }
           return mid;
           
        }else if(target<array[mid]){
            return lastOcc(array,target,s,mid-1);
        }else{
            return lastOcc(array,target,mid+1,e);
        }
    }
    public static int totalOcc(int array[],int target,int s,int e){
        int first=firstOcc(array,target,0,array.length-1);
        int last=lastOcc(array,target,0,array.length-1);
        if(first==-1&&last==-1){
        System.out.println("total Occurance is : ");
            return 0;
        }
        int ans=(last-first)+1;
        System.out.println("total Occurance is : ");
        return ans;
    }
}
