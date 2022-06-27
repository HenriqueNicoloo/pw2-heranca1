
public class TestaLivroFisico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LivroFisico lf = new LivroFisico();
		lf.setAutor("Merlina Costa");
		lf.setCategoria("Aventura");
		lf.setTitulo("As crônicas de Paulo Açafrão");
		lf.setValor(30.00);
		lf.aplicarDesconto();
		lf.getTaxaImpressao();
		System.out.println(lf.getAutor() + "\n" + lf.getCategoria() + "\n" + lf.getTitulo() + "\n" + lf.getValor() + "\n" + lf.getTaxaImpressao());
		
	}

}
