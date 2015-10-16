package fichetp2;

public class Client extends CompteBancaire{
     

	public Client(int a, int c, String nom) {
		super(a, c);
		this.nom=nom;
	}

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
    
}
