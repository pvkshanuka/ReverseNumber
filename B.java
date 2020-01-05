import java.util.Scanner;
import java.lang.Math; 

class B{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);

System.out.println("Please enter number.");

int num1 =0;
int num2 =0;
int len = 0;
try{

num1 = Integer.parseInt(sc.next());
long temp = 1;
long temp2 = 1;
while (temp <= num1){
    len++;
    temp *= 10;
}

System.out.println("len "+--len);

if(len < 1){
System.out.println(11);
}else{
System.out.println(Math.pow(11,len)+--len);
}





}catch(Exception e){
System.out.println("Invalid Number!");
}



}

}