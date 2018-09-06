package pkgHelper;

public class LatinSquare {
	private int[][] myLatinSquare;	//2D integer array
	
	public LatinSquare(int[][] twoDimArray) {
		this.myLatinSquare=twoDimArray;
	}
	public boolean ContainsZero() {
		for(int col=0; col< myLatinSquare.length;col++) {
			for(int row=0; row< myLatinSquare.length;row++) {
				if(myLatinSquare[col][row]==0)
					return true;
			}
		}
		return false;
	}
	public boolean doesElementExist(int[] arr, int iValue) {
		for(int i:arr)
		{
			if(i == iValue)
				return true;
		}
		return false;	
	}
	public int[] getColumn(int iCol) {
		int col[] = new int [myLatinSquare.length];
		int x = 0;
		for(int[] i : myLatinSquare)
		{
			col[x]=i[iCol];
			x++;
		}
		return col;
	}
	public int[][] getLatinSquare(){
		return myLatinSquare;
	}
	public int[] getRow(int iRow) {
		return myLatinSquare[iRow];
	}
	}

	
