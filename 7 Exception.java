import java.util.Scanner;

public class Exception

{

public static void main(String[] args)

{

Scanner sc=new Scanner(System.in);

try

{

System.out.print("Enter size of array: ");

int size=sc.nextInt();

int arr[]=new int[size];

System.out.println("Array of size "+ size +" created successfully.");

}

catch(NegativeArraySizeException e)

{

System.out.println("caught Exception: "+ e); 

}

try

{

int arr[] = {10,20,30};

System.out.println("Trying to access 4th Element...");

System.out.println(arr[3]);

} 

catch(ArrayIndexOutOfBoundsException e)

{

System.out.println("caught Exception: "+ e);

}

}

}
