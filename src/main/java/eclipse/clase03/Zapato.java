package eclipse.clase03;

public class Zapato extends TipoPrenda{
	String tipo = "Zapato";
	Categoria categoria = Categoria.calzado;
	
	public Zapato(){
	    super("Zapato",Categoria.calzado);
	}
}
