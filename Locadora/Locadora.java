package Locadora;

public class Locadora {

    private Disco[] listaDeDiscos = new Disco[2];
    private Filme[] listaDeFilmes = new Filme[2];

    
	private int indiceD;
	
	
	private int indiceF;
    	
	
    public Locadora() {
    }
    
    public void novoDisco(Disco d) {
        this.listaDeDiscos[this.indiceD++] = d;
    }
    

    public void novoFilme(Filme f) {
        this.listaDeFilmes[this.indiceF++] = f;
    }
    

    public void listarDiscos() {
        for (Disco disco : listaDeDiscos) {
            disco.listaInformacoes();
        }
    }
    

    public void listarFilmes() {
        for (Filme filme : listaDeFilmes) {
            filme.listaInformacoes();
        }
    }
}
