package hangman.model;

public class BonusScore implements GameScore {
	public  int Score = 0;
	public int CalculateScore(int correctCount, int incorrectCount) {
		int ScoreNegativo = incorrectCount*5;
		int ScorePositivo = correctCount*10;
		Score = ScorePositivo - ScoreNegativo;
		if (Score <= 0) {
			return 0;
		}
		else {
			return Score;
		}
	}
}
