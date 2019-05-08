package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		int n =0;
		Random numbers = new Random();
		n = numbers.nextInt(9);
		int n2 = numbers.nextInt(9);
		int n3 = numbers.nextInt(9);
		int n4 = numbers.nextInt(9);
		int n5 = numbers.nextInt(9);
		JOptionPane.showMessageDialog(null, "Lottery Ticket Numbers " + n + n2 + n3 + n4 +n5);
		
		
		
	}
}
