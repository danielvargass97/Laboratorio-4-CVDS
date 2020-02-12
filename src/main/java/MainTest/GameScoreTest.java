package MainTest;
import hangman.model.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GameScoreTest {

	@Test
	public void OriginalScorePuntos(){
		// Descuento por más de 20 días de antelación y edad mayor a 65 años
		OriginalScore prueba= new OriginalScore();
		int Resultado = prueba.CalculateScore(10,6);
		Assert.assertEquals(Resultado,40);
	}
	
	@Test
	public void BonusScorePuntos(){
		// Descuento por más de 20 días de antelación y edad mayor a 65 años
		BonusScore prueba= new BonusScore();
		int Resultado = prueba.CalculateScore(3,5);
		Assert.assertEquals(Resultado,5);
	}
	
	@Test
	public void PowerScorePuntos(){
		// Descuento por más de 20 días de antelación y edad mayor a 65 años
		PowerScore prueba= new PowerScore();
		int Resultado = prueba.CalculateScore(3,10);
		Assert.assertEquals(Resultado,45);
	}
	
	@Test
	public void PowerScorePuntos2(){
		// Descuento por más de 20 días de antelación y edad mayor a 65 años
		PowerScore prueba= new PowerScore();
		int Resultado = prueba.CalculateScore(8,12);
		Assert.assertEquals(Resultado,500);
	}
}
