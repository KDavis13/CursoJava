package productos;

/*
 * Enum dise�ada para hacer de factor�a
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