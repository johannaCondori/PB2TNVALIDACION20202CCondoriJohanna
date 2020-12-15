package Condori.johanna34739934;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unlam.pb2.eva03.VehiculoInexistente;

public class Camion  {
	
	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	
	
	private String patente;
	private List <Producto> listaProductos;
	
	
	public Camion (String patente) {
		this.patente=patente;
		listaProductos=new ArrayList<Producto>();
	}
	
	
	public Boolean cargarProducto(Producto producto) {
		/*
		 * carga el producto en la lista de producto 
		 *   
		 * 
		 */
		
		
		return this.listaProductos.add(producto);
		
		
	
	}
	 public Producto buscarProducto(Integer idProducto) {
		 for (Producto producto : listaProductos) {
			if(producto.getId().equals(idProducto)==true)
				return producto;
		}
		return null;
	 }
	
	public Producto descargarProducto(Integer idProducto) throws ProductoInexistenteException {
	
		/*
		 * buesca y un producto por su id y devuelve el producto encontrado
		 * por otro lado elimina dicho producto de la coleccion
		 * encaso que el idProducto no se encuentre retorna una exception ProductoInexistenteException
		 */
		Producto productoBuscado=null;
		if(buscarProducto(idProducto)!=null) {
			productoBuscado=buscarProducto(idProducto);}
		
		else {
			throw new ProductoInexistenteException("id de producto inexistente");
		}
		listaProductos.remove(buscarProducto(idProducto));
		
	return productoBuscado;
	}
	

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public List<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	
}
