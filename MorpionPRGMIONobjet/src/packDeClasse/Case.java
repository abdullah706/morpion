package packDeClasse;

public class Case {
	private boolean comboHorizontale,comboVerticale,comboDiagonaleDescendante,comboDiagonaleMontante;
	private Joueur joueur;
	
	public Case() {
		comboHorizontale=true;
		comboVerticale=true;
		comboDiagonaleDescendante=true;
		comboDiagonaleMontante=true;
		this.joueur=null;
	}
	
	public void joueurProprietaire(Joueur joueur) {
		this.joueur=joueur;
	}
	
	public void consommerCombo(String direction) {
		switch (direction) {
		case "horizontale":
			comboHorizontale=false;
			break;
		case "verticale":
			comboVerticale=false;
			break;
		case "diagonaleDescendante":
			comboDiagonaleDescendante=false;
			break;
		case "diagonaleMontante":
			comboDiagonaleMontante=false;
			break;

		default:
			break;
		}
	}
	
	public boolean estLibre() {
		return this.joueur==null;
	}

}
