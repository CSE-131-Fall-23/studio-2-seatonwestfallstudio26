package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double startAmount;
		double winChance;
		double winLimit;
		
		Scanner in = new Scanner(System.in);
		System.out.println("How much money would you like to start with?: ");
		startAmount = in.nextDouble();
		
		System.out.println("What do you want your win chance to be (enter as a decimal): ");
		winChance = in.nextDouble();
		
		System.out.println("What do you want your end Win Limit to be: ");
		winLimit = in.nextDouble();
		
		double totalAmount;
		double randoVariable;
	
		int ruinCounter=0;
	
		totalAmount = startAmount;
		int totalSimulation;
		System.out.println("How many days do you want to simulate: ");
		totalSimulation = in.nextInt();

		
		for(double days=1; days<=totalSimulation; days++) {
			
			while (totalAmount < winLimit && totalAmount > 0)
			{		
				randoVariable=Math.random();
					if (randoVariable <= winChance)
					{
						totalAmount += 1;
						//System.out.println("Your new total is " + totalAmount + " dollars.");
					}
					else
					{
						totalAmount -=1;
						//System.out.println("Your new total is " + totalAmount + " dollars.");
					}
				}
			if (totalAmount==0) {
				ruinCounter++;
				totalAmount=startAmount;
				
			}
		}
		System.out.println("This is the number of days there were: "+totalSimulation+ " and This is the number of days you ruined "+ ruinCounter);
		}
	
	}

