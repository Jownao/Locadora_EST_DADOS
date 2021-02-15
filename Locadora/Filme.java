package Locadora;

public class Filme extends Item {

    public String diretor;
    public int duracao;
    public String genero;

    public Filme() {
    }

    public Filme(String titulo, int anoLancamento, String coment,String diretor, int duracao, String genero) {
        super(titulo, anoLancamento, coment);
        this.diretor = diretor;
        this.duracao = duracao;
        this.genero = genero;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void listaInformacoes() {
        System.out.println(
        "▂▂▂▂▂▂▂▂▐ Informações do item ▐▂▂▂▂▂▂▂▂▂\n"+
        "Título: "+ this.getTitulo() +"\n"+
        "Ano de lançamento: "+ this.getAnoLancamento()+"\n"+
        "Comentário: "+ this.getComent()+"\n"+
        "▂▂▂▂▂▂▂▂▐ Informações do filme ▐▂▂▂▂▂▂▂▂\n"+
        "Diretor: "+ this.getDiretor() +"\n"+
        "Duração: "+ this.getDuracao() +"\n"+
        "Gênero: "+ this.getGenero() +"\n"+
        "▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂\n\n");
        

    }

    
    
}
