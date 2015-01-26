package productos;

/*
 * Enum diseñada para hacer de factoría
 */
public enum ProductoFactory {
	Excel("Excel"), Pdf("Pdf");

	private String tipo;
	
	// Constructor
	private ProductoFactory(String tipo) {
		this.tipo = tipo;
	}

	public Producto get() {
		switch (this) {
		case Excel:
			return new ExcelProducto();
		case Pdf:
			return new PdfProducto();
		default:
			throw new RuntimeException("Producto inexistente");
		}
	}

	@Override
	public String toString() {
		return tipo;
	}	
}