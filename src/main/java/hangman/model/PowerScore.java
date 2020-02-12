package hangman.model;

public class PowerScore implements GameScore {
	public  int Score = 0;
	public int CalculateScore(int correctCount, int incorrectCount) {
		int ScoreNegativo = incorrectCount*8;
		double ScorePositivo = Math.pow(5, correctCount);
		int ScorePositivo2 = (int)ScorePositivo;
		Score = ScorePositivo2 - ScoreNegativo;
		if (Score <= 0) {
			return 0;
		}
		else if (Score >= 500) {
			return 500;
		}
		else {
			return Score;
		}
	}
}
