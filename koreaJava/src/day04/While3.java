package day04;

public class While3 {
		public static void main(String[] args) {
			int i = 0;
			while(i<10) {
				System.out.println(i+"번");
				 i += 1;
			}
			
			
			int h = 0;
			while(h < 5) {
				System.out.println("안녕");
				h++;
			}
			
			int k = 0;
			int sum = 0;
			while(k < 11) {
			//	System.out.println(k);
				sum += k;
				k++;
			}
			System.out.println(sum);
			
			int l = 0;
			int p = 0;
			while(l < 51) {
				p += l;
				l++;
			}
			System.out.println(p);
		}
}
