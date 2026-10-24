package Collections;

import java.util.Arrays;

/*
An Array is collection of similar types of data item in different location
in array we start index from 0 to n-1.

Types of array:
1-D:An array with single subscript is called 1-D
syntax:
datatype arrayname[]=new datatype[size];

2-D:An array with two subscript is called 2-D
syntax:
datatype arrayname[][]=new datatype[row][column];

 */
public class ArrayExample {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=45;
        arr[1]=67;
        arr[2]=90;
        arr[3]=100;
        arr[4]=78;
        System.out.println(arr[0]);

        System.out.println("--------------------------");
        String students[]={"Manasvi","Kunjan","Parul"};
        for (String s: students){
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        for (int i=0;i<students.length;i++)
        {
            System.out.printf("arr[%d]=",i  );
            System.out.printf("%s\n",students[i]);
        }
        System.out.println("------------------------");

        int x,y;
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,8,7,2}};
        for(x=0;x<3;x++)
        {
            for(y=0;y<4;y++)
            {
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println();
        }

    }
}
