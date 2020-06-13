public class Main
{
	public static void main(String args[]){
	    
	    int[] arr={2,5,4,1,3,7,6};
	    
          for(int i=0;i<arr.length;){
            if(arr[i]==i+1){
               i++;
            }
            else{
                int temp1=arr[i];
                int temp2=arr[arr[i]-1];
                arr[i]=temp2;
                arr[temp1-1]=temp1;
            }
        }
         System.out.println("Sorted array from Cyclic sort is: ");
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
        }
  }
}
