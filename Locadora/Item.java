package Locadora;

public abstract class Item {
    
    public String titulo;
    public int anoLancamento;
    public String coment;

    public Item(){

    }

    public Item(String titulo,int anoLancamento,String coment){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.coment= coment;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getComent() {
        return this.coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }
    
    public abstract void listaInformacoes();

}
