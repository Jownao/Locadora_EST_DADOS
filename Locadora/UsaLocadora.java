package Locadora;

public class UsaLocadora {
    public static void main(String[] args){

        Locadora alugado = new Locadora();
		
        //Primeiro teste
		Disco disco1 = new Disco("Samba Social Clube 5", 2014, "Vários Sambas", "Vários Artistas", 12, "CD");
		Disco disco2 = new Disco("Pode Entrar", 2009, "Ivete e Convidados", "Ivete Sangalo", 14, "DVD");
		
		alugado.novoDisco(disco1);
        alugado.novoDisco(disco2);
	    alugado.listarDiscos();

		//Segundo teste
	    Filme filme1 = new Filme("Smurfs 2", 2013, "Gargamel cria a versão malvada dos Smurfs", "Raja Gosnell", 140, "Animação");
	    Filme filme2 = new Filme("Os mercenários 2", 2012, "De volta ao mundo", "Simon West", 210, "Animação");
	    
	    alugado.novoFilme(filme1);
	    alugado.novoFilme(filme2);
	    alugado.listarFilmes();
    }
}
