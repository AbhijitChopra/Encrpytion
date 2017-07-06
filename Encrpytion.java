//Main Encrpytion Tool

import java.util.Scanner;

import caesar.Caesar;



public class Encrpytion 
{

	public static void main(String[] args) 
	{
		int key;
		String s1;
		int ch;
		int ch1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s1=scan.nextLine();
		System.out.println("Enter the key : ");
		key=scan.nextInt();
		System.out.println("Which Encrpytion Method Will You Use : 1)Caesar ");
		ch=scan.nextInt();
		switch (ch) 
		{
			case 1:
			{
				Caesar ca = new Caesar(s1,key);
				System.out.println("Do you want to : 1)Encrpyt 2)Decrpyt");
				ch1=scan.nextInt();
				switch(ch1)
				{
					case 1 : 
					{
						ca.encrpty();
						break;
					}
					case 2:
					{
						ca.decrpty();
						break;
					}
				}
				break;
			}
			
			default:
			{
				System.out.println("Plz choose a valid choice");
				break;
			}
			
		}
		scan.close();
	}

}
