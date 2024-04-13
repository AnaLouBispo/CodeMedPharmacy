package br.com.pagamento.sistema.exception;

public class PagamentoNotFoundException extends RuntimeException {
	
	
	
	//indentificador de versão
	//clase Serializable
	//final a variavel é definida uma unica vez
	//long => um int com maior quantidade de numeros disponiveis 
	private static final long serialVersionUID = 1L;
	
	public  PagamentoNotFoundException() {
		super();
	}
	
	public PagamentoNotFoundException(String mensagem){
		super(mensagem);
	}

}
