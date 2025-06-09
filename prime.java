public class prime {
public static void main(String[] args) {
for (int i = 2; i <= 100; i++) {
boolean p = true;
for (int j = 2; j <= i / 2; j++) {
if (i % j == 0) {
p = false;
break;
} 
}
if (p) {
System.out.println("Prime number: " + i);
}
}
}
}
