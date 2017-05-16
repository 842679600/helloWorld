package 排序;

public class 选择排序 {
	
	public static void main(String[] args) {
		int[] arr={1,10,20,30,50,90,45,63,78,52};
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		
		printArr(arr);
	}

	private static void printArr(int[] arr) {
		for(int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
	}

}
