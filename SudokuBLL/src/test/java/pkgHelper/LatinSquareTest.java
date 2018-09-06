package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZeroTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		
		int[][] myArray2 = {{1,0,3},{2,3,1},{3,1,2}};
		LatinSquare ls2 = new LatinSquare(myArray2);
		
		assertFalse(ls.ContainsZero());
		assertTrue(ls2.ContainsZero());
	}
	@Test
	public void DoesElementExistTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		
		int[] myIntArray = {1,2,3,4,5};
		int iValue = 4;
		assertTrue(ls.doesElementExist(myIntArray, iValue));
		assertFalse(ls.doesElementExist(myIntArray, 0));
	}
	
	@Test
	public void GetColumnTest() {
		int[][] myArray = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare ls = new LatinSquare(myArray);
		int[] expect = {3,1,2};
		assertArrayEquals(ls.getColumn(2),expect);
		
	}

}
