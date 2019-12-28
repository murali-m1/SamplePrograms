package com.murali;

public class Array2DProblem {

	public static void main(String[] args) {

		int arr[][] = { { 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 } };
		System.out.println("Input array --->");
		printArray(arr, 4, 5);
		System.out.println("Ouput array --->");
		matrixLogic(arr, 4, 5);
	}
	
	public static void printArray(int arr[][], int rowNum, int columnNum) {
		for (int row = 0; row < rowNum; row++) {
			for (int column = 0; column < columnNum; column++) {
				System.out.print(arr[row][column] + " ");
			}
			System.out.println();
		}
	}
	public static void matrixLogic(int a[][], int rowNum, int columnNum) {
		int result[][] = new int[rowNum][columnNum];

		for (int row = 0; row < rowNum; row++) {
			for (int column = 0; column < columnNum; column++) {
				if (a[row][column] == 1)
					result[row][column] = 1;
				else {
					// top 2 corners
					if (row == 0 && column == 0) {
						if ((a[row + 1][column] == 1) || (a[row][column + 1] == 1))
							result[row][column] = 1;
					} else if (row == 0 && column == columnNum - 1) {
						if (a[row][column - 1] == 1 || a[row + 1][column] == 1)
							result[row][column] = 1;
					}
					// bottom 2 corners
					else if (row == rowNum - 1 && column == 0) {
						if ((a[row - 1][column] == 1) || (a[row][column + 1] == 1))
							result[row][column] = 1;
					} else if (row == rowNum - 1 && column == columnNum - 1) {
						if ((a[row - 1][column] == 1) || (a[row][column - 1] == 1))
							result[row][column] = 1;
					}
					// top 0th row elements apart from corners
					else if (row == 0 && column != 0) {
						if (a[row][column - 1] == 1 || a[row][column + 1] == 1 || a[row + 1][column] == 1)
							result[row][column] = 1;
					}
					// bottom last row elements apart from corners
					else if (row == rowNum - 1 && column != 0) {
						if (a[row][column - 1] == 1 || a[row][column + 1] == 1 || a[row - 1][column] == 1)
							result[row][column] = 1;
					}
					// left 0th column elements apart from corners
					else if ((column == 0 && row != 0)) {
						if (a[row][column + 1] == 1 || a[row + 1][column] == 1 || a[row - 1][column] == 1)
							result[row][column] = 1;
					}
					// right last column elements apart from corners
					else if (column == columnNum - 1 && row != 0) {
						if (a[row][column - 1] == 1 || a[row - 1][column] == 1 || a[row + 1][column] == 1) {
							result[row][column] = 1;
						}
					} else {
						if (a[row][column - 1] == 1 || a[row][column + 1] == 1 | a[row - 1][column] == 1
								|| a[row + 1][column] == 1)
							result[row][column] = 1;
					}
				}
				System.out.print(result[row][column] + " ");
			}
			System.out.println("");
		}
	}

}
