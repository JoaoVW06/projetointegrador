package projetointegrador;

import projetointegrador.entity.Produto;
import projetointegrador.enums.TipoEnum;

public class MainApp2 {

	public static void main(String[] args) {
		Produto produto = Produto.builder().id(1).nome("Dembele").descricao("nao aceitamos pet").t(TipoEnum.BASICO).build();
	}

}
