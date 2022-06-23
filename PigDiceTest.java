package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.Scanner;

public class PigDiceTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		PigDice pd=new PigDice();
		System.out.println("Enter the name of player one ");
		String name1=sc.next();
		System.out.println("Enter the name of second player");
		String name2=sc.next();
		System.out.println(name1+ " goes first");
		int turn1 =pd.pigdice();
		System.out.println(name2+" turn to play");
		int turn2 =pd.pigdice();
		if(turn1<turn2) {
			System.out.println( name1 +" wins");
		}
		if(turn2<turn1) {
			System.out.println(name2+" wins");
		}
		if(turn1==turn2) {
			System.out.println("**** Draw ****");
		}
	
	}

}
