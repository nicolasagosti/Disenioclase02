package eclipse.clase03;

public class Atuendo {
	Prenda superior;
	Prenda inferior;
	Prenda zapato;
	Prenda accesorio;
	
	public Atuendo(Prenda superior, Prenda inferior, Prenda zapato, Prenda accesorio){
		this.superior = superior;
		this.inferior = inferior;
		this.zapato = zapato;
		this.accesorio = accesorio;
	}
	//creo un constructor sin accesorio por si el atuendo no lo tiene.
	public Atuendo(Prenda superior, Prenda inferior, Prenda zapato){
		this.superior = superior;
		this.inferior = inferior;
		this.zapato = zapato;
	}
}
