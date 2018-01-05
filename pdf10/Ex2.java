import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 9
		String buraco = "QqRAaOopPDdbe";
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String palavra = scan.nextLine();
		int count = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (buraco.contains(palavra.charAt(i)+"") == true) {
				count++;
			}
			else if (palavra.charAt(i) == 'B' || palavra.charAt(i)== 'g') {
				count += 2;
			}
		}
		System.out.println(count);
	}

}
