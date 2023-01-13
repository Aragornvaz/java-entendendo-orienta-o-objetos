public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaAscanio = new Conta(6646,969060);
		contaAscanio.deposita(100);
		contaAscanio.deposita(50);
		System.out.println(contaAscanio.getSaldo());

		boolean conseguiuRetirar = contaAscanio.saca(20);
		System.out.println(contaAscanio.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaMarcela = new Conta(6644,969063);
		contaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaMarcela.transfere(300, contaAscanio);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaMarcela.getSaldo());
		System.out.println(contaAscanio.getSaldo());
	}

}