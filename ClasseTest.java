package fichetp2;

import java.util.Scanner;

public class ClasseTest {
	static Scanner clavier= new Scanner(System.in);
	public static void main(String[] args) {
		String n="p";double somme;
		String name,n1;
		int rep,v1;
		int v;
		      do{
			  System.out.println("Quel est votre nom?");
			  name=clavier.nextLine();
			  
			  do{
			  System.out.println("Voulez-vous créer un compte ? O/N");
			  n1=clavier.nextLine();}while(n.equals("N")&& n.equals("O") && n.equals("n")&& n.equals("o"));
			  do{
			  System.out.println("Quel type de compte souhaitez-vous créer ?\n1-Tapez 1 pour compte 1\n2-Tapez 2 pour compte 2"); 
			  v=clavier.nextInt();}while(v!=1 && v!=2);
			   if (v==1){
				  Client Compte1= new Client(1,5,name);
				  
				 do{
			  System.out.println("1-Pour versement tapez svp 1\n2-Pour retrait tapez 2 svp\n3- consulter le compte");
			     rep=clavier.nextInt();}while(rep!=1 && rep!=2 && rep!=3);
				  do{
			     System.out.println("Entrez le montant svp !");
			      somme=clavier.nextDouble();}while(somme<0);
			     if(rep==1)
			     Compte1.ajout(somme);
			     
			     else if(rep==2)
			     Compte1.retrait(somme);
			     else
			     System.out.println(Compte1);
			   }
			   else{
				   
						  Client Compte2= new Client(2,5,name);
						  
						 do{
					  System.out.println("1-Pour versement tapez svp 1\n2-Pour retrait tapez 2 svp\n3- consulter le compte");
					     rep=clavier.nextInt();}while(rep!=1 && rep!=2 && rep!=3);
						  do{
					     System.out.println("Entrez le montant svp !");
					      somme=clavier.nextDouble();}while(somme<0);
					     if(rep==1){
					     Compte2.ajout(somme);
					     }
					     else if(rep==2)
					     Compte2.retrait(somme);
					     else
					     System.out.println(Compte2);
					     System.out.println("Merci, Bonne journée!");
				  

			  System.out.println("Voulez-vous refaire ? O/N)");
			  n=clavier.nextLine();
			 }while(!n.equals("N")&& !n.equals("O") && !n.equals("n")&& !n.equals("o"));
				  
				  
			 
				 }while(!n.equals("N")&& !n.equals("O") && !n.equals("n")&& !n.equals("o"));
			  }
		      
}
