public class practice {
    public static void main(String[] args) {
      int array[]={10,20,10,30,40,50,30};
      System.out.println(firstOccurance(array,30,0));
    }
    public static int firstOccurance(int array[],int key,int i){
        // base condition
        if(i>=array.length){
            return -1;
        }

        if(array[i]==key){
            return i;
        }
        return firstOccurance(array,key,++i);
    }
   
}

