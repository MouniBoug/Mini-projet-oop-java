

import java.util.Scanner;

public class mainMethod {
    public static void main(String[] args) {
        int x,y;
        double v;
        Scanner sc = new Scanner(System.in);
        
        // Obtenir les données de l'utilisateur
        System.out.println("entrer les demonsions de la premiere matrice");
        x = sc.nextInt();
        y = sc.nextInt();
        Matrix m=new Matrix(x,y);
        
        System.out.println("entrer les demonsions de la deuxième matrice");
        x = sc.nextInt();
        y = sc.nextInt();
        Matrix l = new Matrix(x,y);
        
        System.out.println("entrer les valeurs de la premiere matrice");
        for(int i = 0; i< m.getNline(); i++) {
        for(int j = 0; j < m.getNColumn(); j++) {
                v = sc.nextDouble();
                m.setData(i, j, v);
        }}
        
        System.out.println("entrer les valeurs de la deuxième matrice");
        for(int c = 0;c<l.getNline();c++) {
            for(int k = 0; k < l.getNColumn(); k++) {
                v = sc.nextDouble();
                l.setData(c, k, v);
            }
        }
        
        // Affichage
        System.out.println("la premiere matrice");
        m.print();
        System.out.println();
        
        System.out.println("la deuxième matrice");
        l.print();
        System.out.println();
        
        System.out.println("l'addition");
        m.add(l).print();
        System.out.println();
        
        System.out.println("la multiplication");
        m.multiply(l).print();
    }
}
