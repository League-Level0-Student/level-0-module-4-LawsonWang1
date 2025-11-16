package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
	
	public static void main(String[] args) {


	String score = JOptionPane.showInputDialog("What was your last test score?");
	double percent = Double.parseDouble(score);
	if (percent >= 90) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for this test." );
	}
	
	
	
	}
}
