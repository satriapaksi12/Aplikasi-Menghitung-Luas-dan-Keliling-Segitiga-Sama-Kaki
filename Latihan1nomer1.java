import java.util.Scanner;
class Latihan1nomer1{
	static Scanner data = new Scanner (System.in);
	public static void  main(String[] abc) {
		
		double s1,s2,sisimiring,tinggi,alas,luas,keliling;
		
	System.out.println("----Menghitung Luas dan Keliling Segitiga Sama Kaki----");
	System.out.println("     ");
	
	System.out.print("Masukkan tinggi segitiga :");
	tinggi = data.nextDouble();data.nextLine();
	System.out.print("Masukkan alas segitiga :");
	alas = data.nextDouble();data.nextLine();
	
	//perhitungan mencari sisi miring segitiga
	sisimiring=(double)Math.sqrt(Math.pow(tinggi,2)+Math.pow(alas*0.5,2));
	s1=sisimiring;
	s2=s1;
	
	System.out.println("Sisi miring: " +sisimiring);
	
	//mencari luas dan keliling segitiga sama kaki
	luas=(double)0.5*alas*tinggi;
	keliling=(double)s1+s2+alas;
	
	System.out.println("Luas Segitiga: " +luas);
	System.out.println("Keliling Segitiga: " +keliling);	
	}
}