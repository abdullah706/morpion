package packDeClasse;

public class Terrain {
	private static final byte CASE_VIDE=0;
	private Case cases[][];
	private int longeurTerrain,HauteurTerrain;
	private char signesJoueurs[];
	
	public Terrain(int longueur,int hauteur) {
		this.longeurTerrain=longueur;
		this.HauteurTerrain=hauteur;
		initialiserTerrain();
	}
	
	public void initialiserTerrain() {
		this.cases=new Case[longeurTerrain][HauteurTerrain];
		for(int positionY=0;positionY<HauteurTerrain;positionY++) 
			for(int positionX=0;positionX<longeurTerrain;positionX++) {
				cases[positionX][positionY]=new Case();
			}
	}
	
	public void initialiserSignesJoueurs() {
		
	}
	
	public void afficherTerrain() {
		for(int positionY=0;positionY<HauteurTerrain;positionY++) 
			for(int positionX=0;positionX<longeurTerrain;positionX++) {
				
			}
	}
	public boolean verifierCasePrise(int[] proposition) {
		if(cases[proposition[0]][proposition[1]].estLibre())
			return true;
		else
			return false;
	}
	
	public void placeLePionEn(int[] proposition,Joueur joueur) {
		cases[proposition[0]][proposition[1]].joueurProprietaire(joueur);
	}
}


