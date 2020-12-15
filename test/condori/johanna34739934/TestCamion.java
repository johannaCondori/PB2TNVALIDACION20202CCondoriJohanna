package condori.johanna34739934;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Condori.johanna34739934.Camion;
import Condori.johanna34739934.Producto;
import Condori.johanna34739934.ProductoInexistenteException;
import Condori.johanna34739934.TiendaCamion;

public class TestCamion {
	

	@Test
	public void queSeAgregueUnProducto() {
	Camion miCamion=new Camion("123");
	Producto producto1= new Producto(1, 10.2,"arroz", 1.0);
	
	miCamion.cargarProducto(producto1);
	
	assertTrue(miCamion.getListaProductos().contains(producto1));
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() {
		Camion miCamion=new Camion("123");
		Producto producto1= new Producto(1, 10.2,"arroz", 1.0);
		
		miCamion.cargarProducto(producto1);
		
		try {
			miCamion.descargarProducto(producto1.getId());
		} catch (ProductoInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertFalse(miCamion.getListaProductos().contains(producto1));
	
	}
	
	//obligatorio
	@Test
	
	public void queDescargueUnProductoInexistenteLanceUnaException() {
	
	
	}
	
}
