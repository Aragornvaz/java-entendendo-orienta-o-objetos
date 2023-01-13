public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaMarcela = new Conta(6646,969060);
		System.out.println(contaMarcela.getSaldo());

		contaMarcela.setTitular(new Cliente());
		System.out.println(contaMarcela.getTitular());

		contaMarcela.getTitular().setNome("Marcela");
		System.out.println(contaMarcela.getTitular().getNome());

	}
}