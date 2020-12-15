package Condori.johanna34739934;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion extends Camion implements ITienda {
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	
	
	public TiendaCamion(String Patente) {
		super(Patente);
		 ventas= new ArrayList<Producto>();
		 estadoDeCaja=false;
		
		
	}

	
	

	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria
		ventas.clear();
		estadoDeCaja=true;

		
	}


	// No permite vender si la caja esta Cerrada y lanza CajaCerradaException
		// Si el producto no existe Lanza Una Excepcion ProductoInexistenteException

	@Override
	public void vender(Integer idProducto) throws cajaCerradaException, ProductoInexistenteException {
		// TODO Auto-generated method stub
		if(estadoDeCaja==true) {
			ventas.add(buscarProducto(idProducto));
		}else{
			throw new cajaCerradaException("caja cerrada");
		}
	}


	//cierra la caja arma y retorna el reporte Diario

	@Override
	public Reporte cierreZ() {
		estadoDeCaja=false;
		return null;
	}


}
