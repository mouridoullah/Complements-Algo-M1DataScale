/**
 * 
 */
package SDA;

/**
 * @author bdame
 *
 */
public class Graphe {
	private Sommet[] tabSommets;
	
	public Graphe(int nbSommets){
		//cr�e un graphe, �tant donn� un nombre de sommets
		//les sommets sont alors num�rot�s de 0 � nbSommets-1
		tabSommets = new Sommet[nbSommets];
		//creation des Sommets
		for (int i=0; i< tabSommets.length; i++){
			tabSommets[i]= new Sommet(i); //sommet num�ro i
		}	
	}
	
	public Graphe(int[] tabSommetsNumerotes) {
		//cr�e un graphe, �tant donn� un tableau de num�ros de sommets
		tabSommets = new Sommet[tabSommetsNumerotes.length];
		//cr�ation des sommets
		for (int i=0; i< tabSommets.length; i++) {
			tabSommets[i]=new Sommet(tabSommetsNumerotes[i]);
			//num�ro du i�me sommet
		}
	}
	
	public void ajoutArc(int x, int y) {
		//d'abord, trouver l'indice de x
		int indice_x = trouverIndiceSommet(x);
		//ajouter y comme successeur du sommet tabSommets[indice_x];
		tabSommets[indice_x].ajoutSuccesseur(y);
	}
	
	public void affichage() {
		System.out.println("D�but graphe");
		for (int i=0; i< tabSommets.length; i++) {
			tabSommets[i].affichage();
		}
		System.out.println("Fin graphe");
	}
	
	public int trouverIndiceSommet (int id) {
		//trouve dans tabSommets l'indice du sommet de num�ro id
		for (int i=0; i< tabSommets.length; i++) {
			if (tabSommets[i].idSommet()==id) return i;
		}
		return (-1); //�chec : pas de sommet ayant ce num�ro !
	}
	
	public void parcoursLargeur(int x, boolean[] marque, int[] pere, int[] Long) throws Exception {
		File F = new File(tabSommets.length);
		int ind_x = trouverIndiceSommet(x);
		Long[ind_x] = 0;
		marque[ind_x] = true;
		
		F.enfiler(ind_x);
		
		while(!F.estVide()) {
			ind_x = F.defiler();
			Liste L = tabSommets[ind_x].successeurs();
			while(L != null) {
				int ind_y = trouverIndiceSommet(L.valeurTete());
				if(!marque[ind_y]) {
					marque[ind_y] = true;
					pere[ind_y] = ind_x;
					Long[ind_y] = Long[ind_x]+1;
					F.enfiler(ind_y);
					}
				L = L.queue();
			}
		}//fin while
	}//fin parcoursLargeur
	
	public void parcoursProfondeur(int x, boolean[] marque, int[] pere) {
		int ind_x = trouverIndiceSommet(x);
		marque[ind_x] = true;
		Liste L = tabSommets[ind_x].successeurs();
		while (L != null) {
			int y = L.valeurTete();
			int ind_y = trouverIndiceSommet(y);
			
			if (!marque[ind_y]) {
				pere[ind_y] = ind_x;
				parcoursProfondeur(y, marque, pere);
			}
			L = L.queue();
		}//fin while
	}//fin parcoursProfondeur
}

class Sommet {
	private int id;
	private Liste listeSuccesseurs = null;
	//pointe vers la liste des num�ros des successeurs du sommet
	public Sommet(int id) {
		this.id=id;
	}
	public int idSommet() {
		return id;
	}
	public Liste successeurs() {
		return listeSuccesseurs;
	}
	public void ajoutSuccesseur(int s) {
		listeSuccesseurs = new Liste(s, listeSuccesseurs);
	}
	public void affichage() {
		System.out.println("Sommet "+ id);
		System.out.print("Successeurs : ");
		Liste L = listeSuccesseurs;
		while(L != null){
			System.out.print (L.valeurTete()+ " ");
			L=L.queue();
		}
		System.out.println("");
	}
}