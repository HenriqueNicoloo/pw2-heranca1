
public class TestaEBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EBook ebook = new EBook();
		ebook.setMarcaDAgua("CPB");
		ebook.setValor(30.00);
		ebook.setTitulo("Como fazer amizades");
		ebook.setCategoria("Auto ajuda");
		ebook.setAutor("M?rio Barreto Fran?a");
		ebook.aplicarDesconto();
		System.out.println(ebook.getMarcaDAgua() + "\n" + ebook.getValor() + "\n" + ebook.getTitulo() + "\n" + ebook.getCategoria() + "\n" + ebook.getAutor());
	}

}
