public class Multi_Dimensional {
    public static void main(String[] args) {
        int arr1[][]={{2,3,4},{6,7,8}};
        int arr2[][]={{2,3,4},{6,7,8}};
        int mat[][]=new int[2][3];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                mat[i][j]=arr1[i][j]*arr2[i][j];
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
