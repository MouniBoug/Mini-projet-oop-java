

public class Matrix extends AbstractMatrix {
    
    // Constructeur de Matrix
    public Matrix (int i,int j) {   
	super(i,j); // Appelant le constructeur de la classe parent
    }
    
    // Méthode d'addition 
    public AbstractMatrix add(AbstractMatrix M) {
	Matrix x =  new Matrix(M.getNline(), M.getNColumn());
        for(int i = 0; i < M.getNline(); i++) {
            for(int j = 0; j < M.getNColumn(); j++) {
                x.setData(i, j, M.getData(i, j) + this.getData(i, j));
            }
        }

        return x;
    }

    // Méthode de multiplication
    public AbstractMatrix multiply(AbstractMatrix M) {
	Matrix x = new Matrix(getNline(), M.getNColumn());
	double y = 0;
	if (this.getNColumn() == M.getNline()) {
            for(int i = 0; i < getNline(); i++) {
                for(int j = 0; j < M.getNColumn(); j++) {
                    for(int c = 0; c < M.getNColumn(); c++) {
                        y = y + (getData(i, c) * M.getData(c, j));
                    }
                    x.setData(i, j, y);
                    y = 0;
                }
            }
		
	}
       
	return x;
    }
    
}
