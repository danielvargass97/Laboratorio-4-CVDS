package hangman.model;

public class OriginalScore implements GameScore{
	public int Score = 0;
	
	public OriginalScore() {
		
	}
	public  int CalculateScore(int correctCount, int incorrectCount) {
		Score = 100;
		int ScoreNegativo = incorrectCount*10;
		Score = Score - ScoreNegativo;
		if (Score <= 0) {
			return 0;
		}
		else {
			return Score;
		}
	}
}
