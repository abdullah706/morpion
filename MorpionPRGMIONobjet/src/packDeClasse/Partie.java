package packDeClasse;

import java.util.Scanner;

public class Partie {
	private Terrain terrain;
	private int nbJoueurs;
	private Joueur joueursPartiEnCours[];
	private char signeJoueur[];
	private int nbManchesTotal;
	private int nbManchesJoué;
	private int tourJoueur=0;
	private Scanner saisie;

	public void initialiserTerrain() {
		int longueur,hauteur;
		saisie = new Scanner(System.in);
		System.out.println("Veuillez choisir la longueur du terrain !");
		longueur = saisie.nextInt();
		System.out.println("Veuillez choisir la hauteur du terrain !");
		hauteur = saisie.nextInt();

		terrain= new Terrain(longueur, hauteur);
		determinerNbManches(longueur, hauteur);
	}

	private void determinerNbManches(int longueur, int hauteur) {
		this.nbManchesTotal=longueur*hauteur;
	}

	private void initialiserJoueurs() {
		char signeJoueur;
		for(int compteurJoueurs=0;compteurJoueurs<nbJoueurs;compteurJoueurs++) {
			System.out.println("Veuillez choisir votre Signe");
			signeJoueur=(saisie.nextLine()).charAt(0);
			joueursPartiEnCours[compteurJoueurs]=new Joueur(compteurJoueurs,signeJoueur);
		}
	}

	private void auTourDe() {
		if(tourJoueur<nbJoueurs)
			tourJoueur++;
		else 
			tourJoueur=0;
	}
	
	private boolean partieFini() {
		if(nbManchesJoué>=nbManchesTotal)
			return true;
		else 
			return false;
	}

	public void jouerPartie() {
		int propositionJoueur[]=new int[2];
		initialiserTerrain();
		initialiserJoueurs();
		do {
			auTourDe();
			do {
				propositionJoueur=joueursPartiEnCours[tourJoueur].ouPlacerPion();
			}
			while(terrain.verifierCasePrise(propositionJoueur));
			terrain.placeLePionEn(propositionJoueur, joueursPartiEnCours[tourJoueur]);
			
			
		}
		while(!partieFini());

	}


}
