package fichetp2; 

public class CompteBancaire {
	private int numeroDeCompte;
    private int tauxDInteret;
    public int getTauxDInteret() {
		return tauxDInteret;
	}

	public void setTauxDInteret(int tauxDInteret) {
		this.tauxDInteret = tauxDInteret;
	}
	private double solde; 
	public int getNumeroDeCompte() {
		return numeroDeCompte;
	}

	public void setNumeroDecompte(int numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	public CompteBancaire (int numeroDeCompte,int tauxDInteret){
		this.numeroDeCompte=numeroDeCompte;
	    this.tauxDInteret=tauxDInteret;
	}
    public String toString(){
    	return " Numero de compte= "+ numeroDeCompte+ " , Taux d'interet = "+tauxDInteret+ " et solde= "+ solde;
    }
    public double calcul(){
    	return (this.solde*this.tauxDInteret)/100;
    }
 

	public void ajout(double somme){	
    		this.solde=this.solde+somme;
    }
    public void retrait(double somme){
    	if(this.getSolde()>=somme)
    		this.solde=this.solde-somme;
    	else
    		System.out.println("retrait impossible !");
    }
}
