//passing an array and returning an array
import java.lang.*;
import java.io.*;
import java.util.*;

class Array
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int col=sc.nextInt();
int arr[][]=new int[row][col];

int [][] input()
{

System.out.println("enter elements");
for(int i=0;i<row;++i)
{
for(int j=0;j<col;++j)
{
arr[i][j]=sc.nextInt();
}
}
return arr;
}

void display(int [][] arr)
{
for (int i=0;i<row;++i)
{
for(int j=0;j<col;++j)
{
System.out.println(arr[i][j]+"\t");
}
System.out.print("\n");
}
}

int[][] inverse(int [][]arr)
{
int [][]rev=new int[row][col];
for(int i=0,k=row-1;i<row && k>0;++i,--k)
{
for(int j=0, l=col-1;j<col && l>0;++j,--l)
{
rev[i][j]=arr[k][l];
System.out.println(rev[i][j]+"\t");
}
System.out.print("\n");
}
return rev;
}

int[][] transpose(int [][]arr)
{
int [][]trans=new int[col][row];
for(int i=0;i<row;++i)
{
for(int j=0;j<col;++j)
{
trans[j][i]=arr[i][j];
System.out.println(trans[j][i]+"\t");
}
System.out.print("\n");
}
return trans;
}

}

class Main
{
public static void main(String[] args)
{
System.out.println("Enter no of row & no of col");
int [][]ar=new int [row][col];
ar=a1.input();
Array a1=new Array();
a1.input();
a1.display(ar);
a1.inverse(ar);
a1.transpose(ar);

}
}
