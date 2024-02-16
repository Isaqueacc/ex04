package Main;
import java.util.Scanner;
import media.Add;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Add add = new Add();	
		
		
		System.out.print("Digite a primeira nota: ");
		add.A = sc.nextDouble();
		
		 System.out.print("Digite a segunda nota: ");
		 add.B = sc.nextDouble();
		 
		 add.Notation();
		 
		 sc.close();
	}

}
