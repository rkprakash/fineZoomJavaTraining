class PrintGrid{
	public static void main(String args[]){
		int input[][]=new int[10][10];
		//System.out.println();
		int n=input.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("-");
			}
			System.out.println();
		}
	}
}