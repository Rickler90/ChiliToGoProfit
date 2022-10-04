import java.util.Scanner;
class ChiliToGoProfit{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("**********************************");
		System.out.println("The Huntington Boys and Girls Club");
		System.out.println("            Fundraising           ");
		System.out.println("**********************************\n");

		System.out.print("what should you like to buy \nA for Adult meal $7\nC for Child meal $4\nB for Both \nEnter your choice : ");
		char cc = input.next().charAt(0);


		if (cc == 'A'|| cc =='a'){
			System.out.print("How many Adult meal do you want : ");
			int a = input.nextInt();
			int ap = (a*7);
			double af = ap-(a*4.35);
			System.out.println("\nYour order:\nAdult meal\t\t:\t"+a+"\nAdult meal Price\t:\t$"+ap+"\nChild meal\t\t:\t"+0+"\nChild meal Price\t:\t$"+0+"\ntotal meal\t\t:\t"+(a+0)+"\nTotal price\t\t:\t$"+ap);
			System.out.println("\nProfit:\nChild meal profit\t:\t$"+0+"\nAdult meal profit\t:\t$"+af+"\nTotal profit\t\t:\t$"+af);}
		else if (cc == 'C' || cc =='c'){			
			System.out.print("How many Child meal do you want : ");
			int c = input.nextInt();
			int cp = (c*4);
			double cf = cp-(c*3.10);
			System.out.println("\nYour order:\nAdult meal\t\t:\t"+0+"\nAdult meal Price\t:\t$"+0+"\nChild meal\t\t:\t"+c+"\nChild meal Price\t:\t$"+cp+"\ntotal meal\t\t:\t"+(0+c)+"\nTotal price\t\t:\t$"+cp);
			System.out.println("\nProfit:\nChild meal profit\t:\t$"+cf+"\nAdult meal profit\t:\t$"+0+"\nTotal profit\t\t:\t$"+cf);}
		else if (cc == 'B' || cc == 'b'){			
			System.out.print("How many Adult meal do you want : ");
			int a = input.nextInt();
			int ap = (a*7);
			System.out.print("How many Child meal do you want : ");
			int c = input.nextInt();
			int cp = (c*4);
			int total = cp+ ap;
			System.out.println("\nYour order:\nAdult meal\t\t:\t"+a+"\nAdult meal Price\t:\t$"+ap+"\nChild meal\t\t:\t"+c+"\nChild meal Price\t:\t$"+cp+"\ntotal meal\t\t:\t"+(a+c)+"\nTotal price\t\t:\t$"+total);
			double cf = cp-(c*3.10);
			double af = ap-(a*4.35);
			double tt = af+cf;
			System.out.println("\nProfit:\nChild meal profit\t:\t$"+cf+"\nAdult meal profit\t:\t$"+af+"\nTotal profit\t\t:\t$"+tt);	}



	}
}