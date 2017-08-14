import java.lang.*;
import java.io.*;
import java.util.*;

class Matrix
{
public static void main(String[] ar) throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter no rows of matrix A:");
int rowA=sc.nextInt();
System.out.print("Enter no column of matrix A:");
int colA=sc.nextInt();

System.out.print("Enter no rows of matrix B:");
int rowB=sc.nextInt();
System.out.print("Enter no column of matrix B:");
int colB=sc.nextInt();

//initialization of matrix aA
int aA[][]=new int[rowA][colA];
for(int i=0;i<rowA;++i)
{
for(int j=0;j<colA;++j)
{
System.out.print("Enter element of row"+(i+1)+"column"+(j+1)+":");
aA[i][j]=sc.nextInt();
}
}

for(int i=0;i<rowA;++i)
{
for(int j=0;j<colA;++j)
{
System.out.print(aA[i][j]+"\t");
}
System.out.println("\n");
}

//initialization of matrix aB
int aB[][]=new int[rowB][colB];
for(int i=0;i<rowB;++i)
{
for(int j=0;j<colB;++j)
{
System.out.print("Enter element of row"+(i+1)+"column"+(j+1)+":");
aB[i][j]=sc.nextInt();
}
}

for(int i=0;i<rowB;++i)
{
for(int j=0;j<colB;++j)
{
System.out.print(aB[i][j]+"\t");
}
System.out.println("\n");
}

System.out.println("enter choice:1-addition 2-upper-triangular 3-lower-triangular 4-transpose");
int choice=sc.nextInt();
switch(choice)
{
case 1:

//addition
int rowS=rowA;
int colS=colA;
int sum[][]=new int[rowS][colS];
if(rowA==rowB&&colA==colB)
{
for(int i=0;i<rowS;++i)
{
for(int j=0;j<colS;++j)
{
sum[i][j]=aA[i][j]+aB[i][j];
}
}
for(int i=0;i<rowA;++i)
{
for(int j=0;j<colA;++j)
{
System.out.print(sum[i][j] +"\t");
}
System.out.println("\n");
}
}
else
{
System.out.println("can't added");
}
break;

case 2:
//upper-triangular matrixA
int upper[][]=new int[rowA][colA];
System.out.println("\n"+"upper-triangular matrix is");
for(int i=0;i<rowA;++i)
{
for(int j=0;j<colA;++j)
{
if(i>j)
{System.out.print((upper[i][j]=0) +"\t");}
else
{System.out.print((upper[i][j]=aA[i][j]) +"\t");}
}
System.out.println("\n");}
break;

case 3:
//lower-triangular matrixA
int lower[][]=new int[rowA][colA];
System.out.println("\n"+"Lower-triangular matrix is");
for(int i=0;i<rowA;++i)
{
for(int j=0;j<colA;++j)
{
if(i<j)
{System.out.print((lower[i][j]=0) +"\t");}
else
{System.out.print((lower[i][j]=aA[i][j]) +"\t");}
}
System.out.println("\n");}
break;

case 4:
//transpose of matrixA
int trans[][]=new int[rowA][colA];
System.out.println("\n"+"transpose of amatrix is");
if (rowA==colA)
{
for(int j=0;j<colA;++j)
{
for(int i=0;i<rowA;++i)
{
System.out.print((trans[j][i]=aA[i][j]) +"\t");
}
System.out.println("\n");}
}}
elseif ((rowA)<(colA))
{
for(int i=0;i<rowA;++i)
{
for(int j=0;j<colA;++j)
{
System.out.print((trans[i][j]=aA[j][i]) +"\t");
}
System.out.println("\n");}
}}
elseif((rowA)<(colA))
{
for(int i=0;j<colA;++i)
{
for(int j=0;i<rowA;++j)
{
System.out.print((trans[i][j]=aA[j][i]) +"\t");
}
System.out.println("\n");}
}}
else
{System.out.println("don't know");}
break;


default:
System.out.println("not a valid no.");
break;
}

}
} 
