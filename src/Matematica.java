import java.util.ArrayList;

public class Matematica {
	private ArrayList<Integer> sumas;
	
	/**
	 * Crea un objeto de clase Matematica que tiene la posibilidad
	 * de sumar dos numeros o compararlos
	 */
	public Matematica(){
		this.sumas=new ArrayList<>();
	}
	
	/**
	 * Suma los dos numeros introducidos como parametros, y devuelve
	 * el resultado y ademas guarda el resultado en un array
	 * @param a	El numero que se sumara
	 * @param b	El otro numero que se sumara
	 * @return El resultado de la suma
	 */
	public int suma(int a,int b){
		int suma=a+b;
		sumas.add(suma);
		
		return suma;
	}
	
	/**
	 * Compara los numeros introducidos para saber si el primer introducido
	 * es mayor que el otro
	 * @param a El numero que se comparara si es mayor
	 * @param b El numero con quien se conparara
	 * @return	True: el primero es mayor | False: el primero no es mayor
	 */
	public boolean mayor(int a, int b){
		if(a>b){
			return true;
		}
		return false;
	}
	
	/**
	 * Devuelve el historial de los resultados de las sumas
	 * @return ArrayList de tipo int
	 */
	public ArrayList<Integer> getSumas() {
		return sumas;
	}
	
	/**
	 * Establece  el historial de los resultados de las sumas
	 * @param sumas ArrayList de tipo int
	 */
	public void setSumas(ArrayList<Integer> sumas) {
		this.sumas = sumas;
	}
}
