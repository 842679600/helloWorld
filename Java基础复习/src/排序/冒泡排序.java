package еепР;

public class ц╟ещеепР {
	
	public static void main(String[] args) {
		int[] arr={1,10,20,30,50,90,45,63,78,52};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					arr= swap(j,j+1,arr);
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	}

	private static int[] swap(int i, int j, int[] arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}

}
