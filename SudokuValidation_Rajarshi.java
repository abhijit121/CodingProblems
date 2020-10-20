package id2360_rajarshi.UPTECH_CJ_001.java_basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*@Author - rsan98k*/

public class SudokuValidation {

	public static void main(String[] args) {
		try {
			String sudokuInput = "3 6 7 5 3 5 6 2 9 1 2 7 0 9 3 6 0 6 2 6 1 8 7 9 2 0 2 3 7 5 9 2 2 8 9 7 3 6 1 2 9 3 1 9 4 7 8 4 5 0 3 6 1 0 6 3 2 0 6 1 5 5 4 7 6 5 6 9 3 7 4 5 2 5 4 7 4 4 3 0 7";
			sudokuInput = sudokuInput.replaceAll(" ", "");
			System.out.print(validSudokuCheck(sudokuInput));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static String validSudokuCheck(String sudokuMatrix) {
		int len = sudokuMatrix.length();
		int i=0;
		int countRow  = 0;
		int countColumn  = 0;
		
		while(len!=0) {
			String rowOfSudokuInputCharArray = sudokuMatrix.substring(i, i+9).replaceAll("0", "");
			Set<Character> rowOfSudokuInputAsSet = new LinkedHashSet<Character>();
			List<Character> rowOfSudokuInputAsList = new ArrayList<Character>();
			for(char eachCellOfSudoku : rowOfSudokuInputCharArray.toCharArray()) {
				rowOfSudokuInputAsList.add(eachCellOfSudoku);
				rowOfSudokuInputAsSet.add(eachCellOfSudoku);
			}
			if(rowOfSudokuInputAsList.size()==rowOfSudokuInputAsSet.size()) {
				countRow++;
			}
			i = i+9;
			len = len-9;
		}

		for(int k=0;k<9;k++) {
			List<Character> columnOfSudokuInput = new ArrayList<Character>();
			Set<Character> columnOfSudokuInputAsSet = new HashSet<Character>();
			for(int j=k;j<81;j=j+9) {
				if(sudokuMatrix.charAt(j)!='0') {
					columnOfSudokuInput.add(sudokuMatrix.charAt(j));
					columnOfSudokuInputAsSet.add(sudokuMatrix.charAt(j));
				}
			}
			if(columnOfSudokuInputAsSet.size()==columnOfSudokuInput.size()) {
				countColumn++;
			}
		}	
		if(countColumn == countRow) {
			return "Valid";
		} else {
			return "Not Valid";
		}
	}
}
