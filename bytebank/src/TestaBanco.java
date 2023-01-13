public class TestaBanco {
	public static void main(String[] args) {
		Cliente ascanio = new Cliente();
		ascanio.setNome("Ascanio Vaz");
		ascanio.setCpf("222.222.222.-22");
		ascanio.setProfissao("programador");

		Conta contaAscanio = new Conta(6646,969060);
		contaAscanio.deposita(100);

		contaAscanio.setTitular(ascanio);
		System.out.println(contaAscanio.getTitular().getNome());
		System.out.println(contaAscanio.getTitular());

	}
}