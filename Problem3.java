package interview;

public class Problem3 {
public static void main(String[] args) {
	int a=1;
	if (a%2==0) {
		a--;
	}
	int b=1;
	for(int i=1;i<=a;i++) {
		System.out.println(b);
		b=b+2;
	}
}
}
