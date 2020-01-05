import java.util.Scanner;

class F{

public static void main(String[] args) {

boolean b = true;

while (b) {

Scanner sc = new Scanner(System.in);
System.out.println("Please enter number.");

int num = sc.nextInt();
int no = num;

int rev_num = 0;

int count = 0;
while (true) {
if (num / 10 > 0) {
count++;
num = num / 10;

} else {
break;
}
}

int x = 1;
for (int i = count; 0 <= i; i--) {
int pow = (int) Math.pow(10, i);
int mul = no / pow;
rev_num = rev_num + mul * x;
x = x * 10;
no = no - (mul * pow);
}
System.out.println(rev_num);
System.out.println("");
System.out.println("Do you want to continue? y or n");
if (sc.next().equals("n")) {
b = false;
}
}
}

}