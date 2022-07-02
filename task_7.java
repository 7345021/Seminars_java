// Задача №7 На шахматной доске расставить 8 ферзей так, 
// чтобы они не били друг друга.

public class task_7 {
	public static int count=0;	
	public static int N=8;
	public static void main(String[] args) {
		int[][] arr=new int[N][N];	
		eightQueen(0,arr);	
	}
	
	public static void eightQueen(int row, int[][] arr) {
		if(row==N){
			count++;
			System.out.println(" "+count+"Вид:");
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}else{
			// Делаем резервную копию массива
			int[][] newArr=new int[N][N];
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[i].length;j++){
					newArr[i][j]=arr[i][j];
				}
			}
			for(int col=0;col<N;col++){
			/*
			 
			*/
				if(noDangerous(row,col,newArr)){
					for(int c=0;c<N;c++){
						newArr[row][c]=0;
					}
					newArr[row][col]=1;
					eightQueen(row+1, newArr);
				}
			}
		}	
	}
	public static boolean noDangerous(int row, int col, int[][] newArr) {
		//Наверху
		for(int r=row-1;r>=0;r--){
			if(newArr[r][col]==1){
				return false;
			}
		}
		
		for(int r=row-1,c=col-1;r>=0&&c>=0;r--,c--){
			if(newArr[r][c]==1){
				return false;
			}
		}
		
		for(int r=row-1,c=col+1;r>=0&&c<N;r--,c++){
			if(newArr[r][c]==1){
				return false;
			}
		}
		return true;
	}
}



