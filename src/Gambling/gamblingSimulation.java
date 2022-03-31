package Gambling;

import java.util.Scanner;

public class GamblingSimulation {
	static int EVERY_DAY_STAKE=100;
    int BET_PER_DAY=1;
    public static void main(String[]args) {
    	int win;
    	int winrate=0;
    	int totalamount=100;
    	Scanner S =new Scanner(System.in);
    	System.out.println("enter a no of turns");
    	int play = S.nextInt();
    	win =(int)Math.floor(Math.random())%2;
    	for(int i=1;i<=play;i++)
    		if(win==1)
    		{
    			winrate=winrate+win;
    			System.out.println("gambler win");
    			totalamount=totalamount+win;
    		}
    		else if(win==0) {
    			winrate=winrate-win;
    			System.out.println("gambler loose");
    			totalamount=totalamount-1;


    		}
    	if(totalamount>=50) {
			System.out.println("gambler win"+totalamount);
    	}
    	else if(totalamount<=50)
    	{
    		System.out.println("gambler loose" +totalamount);
    	}
    }
    
}
