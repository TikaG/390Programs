public class Sort {
	public int compares;
	public int[] array;
	
	public Sort(int[] array){
		this.array = array;
	}
	
	public void bruteSort(){
		for(int j=0; j<array.length;j++)
		 {
		     for (int i=j+1 ; i<array.length; i++)
		     {
		    	 if(array[i] < array[j])
		         {
		             int temp = array[j];
		             array[j] = array[i]; 
		             array[i] = temp;
		         }
	             compares++;
		     }

		 }
	}
	
	public void print(){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	
}
