import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {
	@Dado("que eu criei um arquivo corretamente")
	public void queEuCrieiUmArquivoCorretamente() {

	}
	@Quando("eu executá-lo")
	public void euExecutáLo() {

	}
	@Então("a expecificação deve finalizar com sucesso")
	public void aExpecificaçãoDeveFinalizarComSucesso() {

	}
	
	private int contador = 0;
	
	@Dado("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) {
		contador = int1;
		
	}
	@Quando("eu incrementar {int}")
	public void euIncrementar(Integer int1) {
		contador = contador + int1;
	}
	@Então("o valor do contador será {int}")
	public void oValorDoContadorSerá(Integer int1) {
		System.out.println(int1);
		System.out.println(contador);
		System.out.println(int1==contador);
		Assert.assertTrue(int1==contador);
		Assert.assertEquals(18,contador);
	}

}
