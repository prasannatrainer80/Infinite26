package com.java.day3;

public class JaggedArray1 {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];

        jagged[0]=new int[]{12,45,221};
        jagged[1]=new int[]{66,112,521};
        jagged[2]=new int[]{58,88,81};

        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.print(jagged[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
