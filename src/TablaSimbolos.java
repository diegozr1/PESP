import java.util.HashMap;
import java.util.Iterator;

public class TablaSimbolos {
	
	HashMap<String, Simbolo> t;
	
	public TablaSimbolos() {
		t = new HashMap<String, Simbolo>();
	}
	
	public Simbolo insertar(String nombre, String tipo, String scope) {
		Simbolo s = new Simbolo(nombre, new Integer(0), tipo, scope);
		t.put(nombre,  s);
		return s;		
	}
	
	public Simbolo buscar(String nombre) {
		return (Simbolo)(t.get(nombre));
	}
	
	public void imprimir() {
		Iterator it = t.values().iterator();
		while(it.hasNext()) {
			Simbolo s =  (Simbolo) it.next();
			System.out.println(s.nombre + ": "+s.valor);
		}
	}
	
}
