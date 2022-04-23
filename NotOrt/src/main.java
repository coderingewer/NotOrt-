import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int mat, tur, fiz, kim, tar, muz;
		Scanner not = new Scanner(System.in);

		System.out.println("Matematik notunuzu girin: ");
		mat = not.nextInt();

		System.out.println("Türkçe notunuzu girin: ");
		tur = not.nextInt();

		System.out.println("Fizik notunuzu girin: ");
		fiz = not.nextInt();

		System.out.println("Kimya notunuzu girin: ");
		kim = not.nextInt();

		System.out.println("Tarih notunuzu girin: ");
		tar = not.nextInt();

		System.out.println("Müzik notunuzu girin: ");
		muz = not.nextInt();

		int toplam = mat + tur + fiz + kim + tar + muz;
		int ort = toplam / 6;
		boolean sonuc = ort > 60;
		String str = sonuc ? "Geçti" : "Geçmedi";
		
		System.out.println(str);
	
	}

}
