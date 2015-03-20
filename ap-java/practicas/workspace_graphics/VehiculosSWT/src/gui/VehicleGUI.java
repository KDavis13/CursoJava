package gui;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.jface.window.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

import vehiculos.*;

public class VehicleGUI extends Window {

	// Contenedores de nivel intermedio
	private Composite composite1;

	private Text txtMarca, txtModelo, txtProv, txtNum, txtLetras, txtConsumo;
	private Combo cmbAnyCompra;
	private Table Table;

	protected VehicleGUI(Shell shell) {
		super(shell);
	}

	public static void main(String[] args) {

		// Definimos una ventan
		Shell shell = new Shell();

		// Aquí se llama al constructor de la ventana
		VehicleGUI crearVehicle = new VehicleGUI(shell);

		// si le pones true se queda esperando a que hace que la ventana se
		// mantenga abierta hasta que el usuario la cierre
		crearVehicle.setBlockOnOpen(true);
		// Esto es lo hace que se mantenga la ventana abierta
		crearVehicle.open();

		Display.getCurrent().dispose();
	}

	public Control createContents(Composite parent) {
		
		//Establecemos las medidas, la posición y el título de la ventana
		parent.getShell().setSize(370, 400);
		parent.getShell().setLocation(300, 200);
		parent.getShell().setText("Entrada de vehiculos");

		composite1 = new Composite(parent, SWT.NONE);

		//Al poner en el constructor el contenedor en el que estará no hay que poner el add (SOLO para SWT
		Label label1 = new Label(composite1, SWT.NONE);
		label1.setText("Marca");
		label1.setLocation(5, 5);
		label1.setSize(50, 20);

		txtMarca = new Text(composite1, SWT.BORDER);
		txtMarca.setText("");
		txtMarca.setLocation(5, 25);
		txtMarca.setSize(90, 20);

		// ******************************************

		Label label2 = new Label(composite1, SWT.NONE);
		label2.setText("Modelo");
		label2.setLocation(105, 5);
		label2.setSize(100, 20);

		txtModelo = new Text(composite1, SWT.BORDER);
		txtModelo.setText("");
		txtModelo.setLocation(105, 25);
		txtModelo.setSize(250, 20);

		// ********************************************

		Label label3 = new Label(composite1, SWT.NONE);
		label3.setText("Año");
		label3.setLocation(5, 50);
		label3.setSize(50, 20);

		cmbAnyCompra = new Combo(composite1, SWT.NONE);

		
		for (int i = 2009; i >= 1950; i--) {
			cmbAnyCompra.add(String.valueOf(i));
		}

		cmbAnyCompra.setLocation(5, 70);
		cmbAnyCompra.setSize(60, 20);

		// ********************************************

		Label label4 = new Label(composite1, SWT.NONE);
		label4.setText("Matricula");
		label4.setLocation(75, 50);
		label4.setSize(60, 20);

		txtProv = new Text(composite1, SWT.BORDER);
		txtProv.setText("");
		txtProv.setLocation(75, 70);
		txtProv.setSize(30, 20);

		txtNum = new Text(composite1, SWT.BORDER);
		txtNum.setText("");
		txtNum.setLocation(108, 70);
		txtNum.setSize(50, 20);

		txtLetras = new Text(composite1, SWT.BORDER);
		txtLetras.setText("");
		txtLetras.setLocation(160, 70);
		txtLetras.setSize(30, 20);

		// ********************************************

		Label label5 = new Label(composite1, SWT.NONE);
		label5.setText("Consumo/Km");
		label5.setLocation(220, 50);
		label5.setSize(70, 20);

		txtConsumo = new Text(composite1, SWT.BORDER);
		txtConsumo.setText("");
		txtConsumo.setLocation(220, 70);
		txtConsumo.setSize(30, 20);

		// ********************************************

		Table tabla = crearTabla(composite1);

		// ********************************************

		Button btnCrearVehiculo = new Button(composite1, SWT.PUSH);
		btnCrearVehiculo.setText("Crear vehiculo");
		btnCrearVehiculo.setLocation(260, 100);
		btnCrearVehiculo.setSize(90, 25);

		Button btnListarVehiculos = new Button(composite1, SWT.PUSH);
		btnListarVehiculos.setText("Listar vehiculos");
		btnListarVehiculos.setLocation(260, 340);
		btnListarVehiculos.setSize(90, 25);

		
		btnCrearVehiculo
				.addMouseListener(new org.eclipse.swt.events.MouseAdapter() {
					public void mouseUp(org.eclipse.swt.events.MouseEvent e) {
						crearVehiculo();
					}
				});

		btnListarVehiculos
				.addMouseListener(new org.eclipse.swt.events.MouseAdapter() {
					public void mouseUp(org.eclipse.swt.events.MouseEvent e) {
						mostrarDatosTabla();
					}
				});

		return parent;
	}

	// Comprobar que todos los campos se han rellenado

	private boolean controles_rellenados() {
		boolean retorno = true;

		if (txtMarca.getText() == "")
			retorno = false;
		if (txtModelo.getText() == "")
			retorno = false;
		if (cmbAnyCompra.getText() == "")
			retorno = false;
		if (txtProv.getText() == "")
			retorno = false;
		if (txtNum.getText() == "")
			retorno = false;
		if (txtLetras.getText() == "")
			retorno = false;
		if (txtConsumo.getText() == "")
			retorno = false;

		return retorno;
	}

	// Después de crear un vehiculo hay que limpiar los campos
	private void limpiar_controles() {
		txtMarca.setText("");
		txtModelo.setText("");
		cmbAnyCompra.setText("");
		txtProv.setText("");
		txtNum.setText("");
		txtLetras.setText("");
		txtConsumo.setText("");
	}

	// Recorrer el vector de vehiculos y mostrarlos en la tabla
	private void mostrarDatosTabla() {

		Table.removeAll();
		Vector<Vehicle2> v = Vehicle2.getVehicles();
		Iterator<Vehicle2> it = v.iterator();
		Vehicle2 tmpVehicle;
		int i = 0;

		while (it.hasNext()) {
			i++;
			tmpVehicle = it.next();

			TableItem fila_actual = new TableItem(Table, SWT.NONE);

			fila_actual.setText(0, String.valueOf(i));
			fila_actual.setText(1, tmpVehicle.getMarca());
			fila_actual.setText(2, tmpVehicle.getModel());
			fila_actual.setText(3, String.valueOf(tmpVehicle.getAny()));
			fila_actual.setText(4, tmpVehicle.getMatrícula());
			fila_actual.setText(5, String.valueOf(tmpVehicle.getConsum()));
		}
	}

	
	private void crearVehiculo() {
		if (controles_rellenados()) {

			int anyCompra = Integer.parseInt(cmbAnyCompra
					.getText());
			int num = Integer.parseInt(txtNum.getText());
			float consumo = Float.parseFloat(txtConsumo
					.getText());

			new Vehicle2(txtMarca.getText(), txtModelo
					.getText(), anyCompra, txtProv.getText(),
					num, txtLetras.getText(), consumo);

			limpiar_controles();
			mostrarDatosTabla();

		} else {
			MessageBox messageBox = new MessageBox(composite1
					.getShell(), SWT.ICON_WARNING);

			messageBox
					.setMessage("Debe rellenar todos los campos.");
			messageBox.setText("Atención");
			messageBox.open();

			 
		}
	}
	
	private org.eclipse.swt.widgets.Table crearTabla(Composite composite1) {
		Table = new Table(composite1, SWT.FULL_SELECTION | SWT.BORDER);
		Table.setLocation(5, 140);
		Table.setSize(350, 180);
		Table.setHeaderVisible(true);
		Table.setLinesVisible(true);

		TableColumn tableColumn0 = new TableColumn(Table, SWT.NONE);
		tableColumn0.setWidth(20);
		tableColumn0.setText("#");
		
		TableColumn tableColumn1 = new TableColumn(Table, SWT.NONE);
		tableColumn1.setWidth(60);
		tableColumn1.setText("Marca");
		
		TableColumn tableColumn2 = new TableColumn(Table, SWT.NONE);
		tableColumn2.setWidth(60);
		tableColumn2.setText("Modelo");
		
		TableColumn tableColumn3 = new TableColumn(Table, SWT.NONE);
		tableColumn3.setWidth(60);
		tableColumn3.setText("Año");
		
		TableColumn tableColumn4 = new TableColumn(Table, SWT.NONE);
		tableColumn4.setWidth(80);
		tableColumn4.setText("Matricula");
		
		TableColumn tableColumn5 = new TableColumn(Table, SWT.NONE);
		tableColumn5.setWidth(60);
		tableColumn5.setText("Consumo");
		
		return Table;
	}
}
