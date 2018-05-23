package service;

import model.Pais;
import dao.PaisDAO;
import java.util.ArrayList;

public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	public int criar(Pais pais) {
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais){
		dao.atualizar(pais);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Pais carregar(int id){
		return dao.carregar(id);
	}
	
	public Pais maiorPopulacao(int populacao) {
		return dao.maiorPopulacao(populacao);
	}
	
	public Pais menorArea(double area) {
		return dao.menorArea(area);
	}
	
	public Pais aleatorio(int id){
		return dao.aleatorio(id);
	}
	public ArrayList<Pais> dashboard(){
		return dao.dashboard();
	}
}
