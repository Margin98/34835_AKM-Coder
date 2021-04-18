/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Margin Patel
 */
public class Main {
	public static void main(String[] args) {
            int i,j = 0;
		TriCardGame pt = new TriCardGame();
                Scanner input = new Scanner(System.in);
                System.out.println("\nDo you Wanna play Three-Card game \n Press 1 for play \n press 2 for exit  ");
                i = input.nextInt();
                do{
                if(i==1){
                    
		pt.addPlayers("Margin Patel");
		pt.addPlayers("Computer");
		pt.setPlayerCard();
		pt.winner();
                System.out.println("\nDo you Wanna play Again \n Press 1 for play \n press 2 for exit ");
                j = input.nextInt();
                }
                else{
                 System.out.println("\nByeeee \n Have a Nice Day:)  ");
                }
                }while(j==1);
	}
}
