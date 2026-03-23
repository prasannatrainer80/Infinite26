package com.java.day3;

public class JaggedArray2 {
    public static void main(String[] args) {
        String[][] employs = new String[3][];
        String[] javEmps = new String[]{"Deva","Kaviya","Atchaya"};
        String[] dotnetEmps = new String[]{"Dhivya","Bavin","Nitish"};
        String[] sqlEmps = new String[]{"Noorey","Mega","Atchaya"};
//        employs[0]=new String[]{"Deva","Kaviya","Atchaya"};
//        employs[1]=new String[]{"Dhivya","Bavin","Nitish"};
//       employs[2]=new String[]{"Noorey","Mega","Atchaya"};
        employs[0]=javEmps;
        employs[1]=dotnetEmps;
        employs[2]=sqlEmps;
        for(int i=0;i<employs.length;i++){
            for(int j=0;j<employs[i].length;j++){
                System.out.print(employs[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
