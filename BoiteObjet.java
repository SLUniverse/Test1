import java.util.ArrayList;
// Classe générique avec une liste d'objets de type T
public class BoiteObjet<T> {
    private ArrayList<T> contenu; //Une ArrayList<T> pour stocker les objets de type T
    // Constructeur pour initialiser la liste
    public BoiteObjet() {
        this.contenu = new ArrayList<>();
    }
    // Méthode pour ajouter un élément à la boite
    public void ajouter(T element) {
        contenu.add(element);
    }
    // Méthode pour obtenir un élément par index
    public T obtenir(int index) {
        return contenu.get(index);
    }
    // Méthode pour supprimer un élément par index
    public void supprimer(int index) {
        contenu.remove(index);
    }
    // Méthode pour vider la boite
    public void vider() {
        contenu.clear();
    }
    // Méthode pour vérifier si la boite est vide
    public boolean estVide() {
        return contenu.isEmpty();
    }
    // Méthode pour obtenir le nombre d'éléments dans la boite
    public int taille() {
        return contenu.size();
    }
    // Méthode pour chercher un élément dans la boite
    public T chercher(T element) {
        for (T item : contenu) {
            if (item.equals(element)) {
                return item; // Élément trouvé
            }
        }
        return null; // Élément non trouvé
    }
    // Méthode pour afficher le contenu de la boite
    @Override
    public String toString() {
        return "Boite contient : " + contenu.toString();
    }}
