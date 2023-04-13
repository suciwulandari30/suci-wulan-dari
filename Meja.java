/* program Meja.java
	nama: Suci Wulan Dari
	tanggal: 11 April 2023
*/

public class Meja // ini adalah nama class
{ // buka kurung kurawal untuk mengawali program
	public int kaki_meja() // membuat sebuah variabel dengan tipe data integer
	{ // buka kurung kurawal untuk mengawali program
		return 70; // nilai dari variabel 
	} // tutup kurung kurawal untuk menutup program
	public int alas_meja() // membuat sebuah variabel dengan tipe data integer
	{ // buka kurung kurawal untuk mengawali program
		return 120;
	} // tutup kurung kurawal untuk menutup program
	public static void main(String[]args)
	{ // buka kurung kurawal untuk mengawali program
		Meja nama = new Meja(); // membuat variabel nama dengan tipe data meja, membuat object baru menggunakan keyword
		int kaki = nama.kaki_meja(); // membuat variabel kaki yang nilainya dari nama dengan kaki_meja
		int alas_meja = nama.alas_meja(); // membuat variabel alas_meja yang nilainya dari nama dengan alas_meja
		System.out.println(kaki * alas_meja); // menampilkan hasil dari variabel kaki * alas_meja
	} // tutup kurung kurawal untuk menutup program

} // tutup kurung kurawal untuk menutup program