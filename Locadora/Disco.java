package Locadora;

public class Disco extends Item {

    private String artista;
    private int faixas;
    private String midia;
    

    public Disco() {
    }

    public Disco(String titulo, int anoLancamento, String coment,String artista, int faixas, String midia) {
        super(titulo, anoLancamento, coment);
        this.artista = artista;
        this.faixas = faixas;
        this.midia = midia;
    }
    
    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getFaixas() {
        return this.faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public String getMidia() {
        return this.midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }
    @Override
    public void listaInformacoes() {
        System.out.println(
        "▂▂▂▂▂▂▂▂▐ Informações do item ▐▂▂▂▂▂▂▂▂▂\n"+
        "Título: "+ this.getTitulo() +"\n"+
        "Ano de lançamento: "+ this.getAnoLancamento()+"\n"+
        "Comentário: "+ this.getComent()+"\n"+
        "▂▂▂▂▂▂▂▂▐ Informações do disco ▐▂▂▂▂▂▂▂▂\n"+
        "Artista: "+ this.getArtista()+"\n"+
        "Quantidade de faixas: "+ this.getFaixas()+"\n"+
        "Mídia: "+ this.getMidia()+"\n"+
        "▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂\n\n");
        

    }
    
}
