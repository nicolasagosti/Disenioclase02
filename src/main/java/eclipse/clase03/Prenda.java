package eclipse.clase03;

public class Prenda {
	TipoPrenda tipo;
	int precioBase;
	Material material;
	Color colorPrincipal;
	Color colorSecundario = null; // Lo inicializo en null para que no me de problemas si no lo inicializo.
	
	
	//Creo un constructor sin color secundario para poder no inicializarlo.
	public Prenda(TipoPrenda tipo, int precioBase,Material material,Color colorPrincipal) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
	}
	public Prenda(TipoPrenda tipo, int precioBase,Material material,Color colorPrincipal,Color colorSecundario) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario= colorSecundario;
	}
	
	
}
