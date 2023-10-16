import java.util.Scanner;
public class Uts_3 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int jumlahUang, pecahan100 = 0, pecahan50 = 0, pecahan20 = 0, pecahan10 = 0,
    pecahan5 = 0, uang = 0, sisa = 0;

System.out.print("Masukkan jumlah uang ");
jumlahUang = input.nextInt();

uang = jumlahUang;

for (int pembagi = 100; uang/pembagi > 0; uang = sisa ) {
  pecahan100++;
  sisa = uang - pembagi;
}

for (int pembagi = 50; uang/pembagi > 0;  uang = sisa ) {
  pecahan50++;
  sisa = uang - pembagi;
}


for (int pembagi = 20; uang/pembagi > 0; uang = sisa ) {
  pecahan20++;
  sisa = uang - pembagi;
}


for (int pembagi = 10; uang/pembagi > 0; uang = sisa ) {
  pecahan10++;
  sisa = uang - pembagi;
}


for (int pembagi = 5; uang/pembagi > 0; uang = sisa) {
  pecahan5++;
  sisa = uang - pembagi; 
}

System.out.println("hasil penukaran " + jumlahUang); 
System.out.println("pecahan 100 " + pecahan100 + " lembar");
System.out.println("pecahan 50 " + pecahan50 + " lembar");
System.out.println("pecahan 20 " + pecahan20 + " lembar");
System.out.println("pecahan 10 " + pecahan10 + " lembar");
System.out.println("pecahan 5 " + pecahan5+ " lembar");

    

}
  
}
