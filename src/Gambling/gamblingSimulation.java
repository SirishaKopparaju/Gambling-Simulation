package Gambling;

public class GamblingSimulation {
	int EVERY_DAY_STAKE=100;
    int BET_PER_DAY=1;
	public static void main(String[] args) {
		int WIN=0;
		int BET= (int) Math.floor(Math.random()*10)%2;
		if(BET==1) {
			System.out.println("Gambler wins the game");
		}
		else
		{
			System.out.println("Gambler loose the game");
		}
        
}
}
