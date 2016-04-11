package nomessignificativos;

import java.util.ArrayList;
import java.util.List;

public class CampoMinado {
	
	private List<int[]> lista;

	public List<int[]> getTodos() {
		List<int[]> lista1 = new ArrayList<>();
		for(int[] x : lista) {
			if(x[0] == 4) {
				lista1.add(x);
			}
		}
		return lista1;
	}
}
