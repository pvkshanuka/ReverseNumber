import java.util.Scanner;

class A{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);

System.out.println("Please enter number.");

int num1 =0;
int num2 =0;
try{

num1 = Integer.parseInt(sc.next());

if(num1%10 == 0){
int mul =num1/10;

if(mul%10 == 0){
num2 = 1;
}else{

num2 = num1-(9*(mul));
}
}else{

if(num1%10 ==1 || num1<10 || num1%11==0){
num2=num1;
}else{

num2 = num1+((num1-11)*9);

}

}

System.out.println(num2);

}catch(Exception e){
System.out.println("Invalid Number!");
}



}

}