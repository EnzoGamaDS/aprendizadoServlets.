package br.ucsal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Controller {
	private static List<Model> lista = new ArrayList<Model>();
	private static Integer chaveSequencial = 1;
	
	
	public void adiciona(Model empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
	}
	public List<Model> getEmpresas(){
		return Controller.lista;//coloca o nome da classe ao inves de um this, pq ele é um objeto e não um atributo
	}
	public void removeEmpresa(Integer id) {
		
		Iterator<Model> i = lista.iterator();
		
		while(i.hasNext()) {
			Model empresa = i.next();
			
			if (empresa.getId() == id) {
				i.remove();
			}
		}
	}
	
	public Model findId(Integer id) {
		for (Model empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
