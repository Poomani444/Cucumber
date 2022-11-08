package com.array  ;

public class Multi_D {
	
	public static void main(String[] args) {
		String ss[][]= new String[3][3];
		ss[0][0]="SRM";
		ss[0][1]="PEC";
		ss[0][2]="SSN";
		ss[1][0]="REC";
		ss[1][1]="PBC";
		ss[1][2]="AUC";
		ss[2][0]="RIT";
		ss[2][1]="VIT";
		ss[2][2]="MIT";
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(ss[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
