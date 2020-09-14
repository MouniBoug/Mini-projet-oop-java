/*
Nom:        Bouguelaa
Prénom:     Mounir
Groupe:     04

Réalisation d'un mini-projet de oop
*/

// classe abstraite
public abstract class AbstractMatrix {
    // les attributs encapsulés
    private  double[][] data;
    private  int nline;
    private  int ncolumn;
    
    // Constructeur par défau
    public AbstractMatrix() {
        nline = 1;
        ncolumn = 1;
        data[0][0] = 0;
    }
    
    // Constructeur surcharge
    public AbstractMatrix(int i, int j) {
        this.nline = i;
        this.ncolumn = j;
        this.data = new double[i][j]; 
        
        // initialise le tableau data par des zéros
        for(int c = 0; c < i; c++) {
            for(int k = 0; k < j; j++) {
                this.data[c][k] = 0;
            }
	}
    }
    
    // Les méthodes d’accès
    public int getNline() {
        return nline;
    }
    
    public int getNColumn() {
        return ncolumn;
    }
    
    public double getData(int i,int j) {
        return data[i][j];
    }
    
    public void setData(int i,int j, double value) {
        this.data[i][j] = value;
    }
    
    // Méthode d’afficher les éléments de la matrice
    public void print() {
        
        for (int i = 0; i < this.nline; i++) {
            for(int j = 0; j < this.ncolumn; j++) {
                System.out.print(data[i][j] + "    ");
            }
            System.out.println();
	}
    }
    
    // les méthodes abstraites
    public abstract AbstractMatrix add(AbstractMatrix M);
    public abstract AbstractMatrix multiply(AbstractMatrix M);
    
    
}




