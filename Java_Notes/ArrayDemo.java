public class ArrayDemo{
	public static void main(String[] agr){
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

		char jarr[][]={{'H','i'},{'H','e','l','l','o'},{'W','e','l','c','o','m','e'},{'D','e','a','r'}};

		String str[][]=new String[3][];
		str[0]=new String[]{"Welcome"};
		str[1]=new String[]{"Learn"};
		str[2]=new String[]{"Java"};

		int iarr[]={10,20,30,40,50};

		for(int i=0;i<iarr.length;i++){
			System.out.print(iarr[i]+" ");			
		}



		for(int x:iarr){
			System.out.print(x+" ");
		}

		System.out.print("\n-----------------------------------\n");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		System.out.print("-----------------------------------\n");
		for(int i=0;i<jarr.length;i++){
			for(int j=0;j<jarr[i].length;j++){
				System.out.print(jarr[i][j]+" ");
			}
		System.out.println();
		}
		System.out.print("-----------------------------------\n");
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[i].length;j++){
				System.out.print(str[i][j]+" ");
			}
		System.out.println();
		}	
	}
}