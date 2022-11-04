package logic;

import java.util.Random;

public class MyMatriz {
private int [][]matriz;
private int rows,cols;
public MyMatriz( int rows, int cols) {
	
	this.rows = rows;
	this.cols = cols;
	matriz= new int [rows][cols];
}
private void fillMatriz() {
	for(var i=0;i<matriz.length;i++) {
		for (var j=0;j<matriz[i].length;j++) {
			matriz[i][j]=new Random().nextInt(50)+1;
		}
	}
}
public int [][]getMatriz(){
	return matriz.clone();
}

}
