package etudiant;



public class TestEtudiant {
    public static void main(String[] args) {
        String name = args[0];
        Etudiant myEtudiant = new Etudiant(name);
        myEtudiant.travailler();
        myEtudiant.seReposer();
        
    }
}
