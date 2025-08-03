// import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int array[]={0,18,20,30};
        int ans=evenNumberOfDigit(array,0);
        System.out.println(ans);
        
    }   
    public static boolean linearSearch1(int array[],int size,int key,int i){
        // Edge case
        if(size==0){
            return false;
        }
        // base case
        if(size<0){
            return false;
        }
        if(array[i]==key){
            return true;
        }
        return linearSearch1(array,--size,key,++i);
    } 
    public static boolean searchInRange(int array[],int start,int end,int key,int i){
        // for(int i=start;i<=end;i++){
        //     if(array[start]==key){
        //         return true;
        //     }
        //     ++start;
        // }
        // return false;

        // base case
        if(end==i){                                                    
            return false;
        }
        if(array[i]==key){
            return true;
        }
        return searchInRange(array,start,end,key,++i);
    }
    public static int finMin(int array[],int size,int min,int i){
        if(size==0){
            return min;
        }
        if(array[i]<min){
            min=array[i];
           
        }
        return finMin(array,--size,min,++i);
        
        
        
    }
    public static boolean searchIn2DArray(int array[][],int key){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static int countNum(int num){
        if (num<0) {
            num=num*-1;
        }
        if (num==0) {
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static boolean checkEven(int num){
       int numberOfDigit=countNum(num);
       if(numberOfDigit%2==0){
        return true;
       }
       return false;
    }
    public static int evenNUmberDigit(int array[]){
       int count=0;
       for(int num:array){
        if(checkEven(num)){
            count++;
        }
       }
       return count;
    }
        

    
}
