import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 Dong");
		System.out.println("2 Rupee");
		System.out.println("3 Dollar");
		System.out.println("4 Euro");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the currency");
		int choice = sc.nextInt();
		
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		
		switch (choice) {
		case 1: {
			Dollar_to_other(amount);
			break;
		}
		case 2: {
			Dong_to_other(amount);
			break;
		}
		case 3: {
			Rupee_to_other(amount);
			break;
		}
		case 4: {
			Euro_to_other(amount);
			break;
		}
	}
}
	
		public static void Dong_to_other( double amount ) {
			System.out.println("1 Dong = " + 0.000041 + " Dollar " );
			System.out.println(amount + " Dong = " + (amount*0.000041) + " Dollar ");
			
			System.out.println("1 Dong = " + 0.000037 + "Euro" );
			System.out.println(amount + " Dong = " + (amount*0.000037) + " Euro " );
			
			System.out.println("1 Dong = " + 0.0034 + "Ruppe" );
			System.out.println(amount + " Dong = " + (amount*0.0034) + " Ruppe " );
		}
		
		
		public static void Dollar_to_other(double amount ) {
			System.out.println("1 Dollar = " + 24686.00 + " Dong " );
			System.out.println(amount + " Dollar = " + (amount*24686.00) + " Dong " );
			
			System.out.println("1 Dollar = " + 0.92 + "Euro" );
			System.out.println(amount + " Dollar = " + (amount*0.92) + "Euro" );
			
			
			System.out.println("1 Dollar = " + 82.92 + "Ruppe" );
			System.out.println(amount + " Dollar = " + (amount*82.92) + "Ruppe" );
		
		}
		
		public static void Rupee_to_other(double amount ) {
			System.out.println("1 Rupee = " + 297.69 + " Dong " );
			System.out.println(amount + " Rupee = " + (amount*297.69) + " Dong " );
			
			System.out.println("1 Rupee = " + 0.011 + "Euro" );
			System.out.println(amount + " Rupee = " + (amount*0.011) + "Euro" );
			
			
			System.out.println("1 Rupee = " + 0.012 + "Dollar" );
			System.out.println(amount + " Rupee = " + (amount*0.012) + "Dollar" );
		}
		
		public static void Euro_to_other(double amount ) {
			System.out.println("1 Euro = " + 26782.21 + " Dong " );
			System.out.println(amount + " Euro = " + (amount*26782.21) + " Dong " );
			
			System.out.println("1 Euro = " + 89.95 + "Rupee" );
			System.out.println(amount + " Euro = " + (amount*89.94) + "Rupee" );
			
			
			System.out.println("1 Euro = " + 1.08 + "Dollar" );
			System.out.println(amount + " Euro = " + (amount*1.08) + "Dollar" );
			
		}
		
	}

