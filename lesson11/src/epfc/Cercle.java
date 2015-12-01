
package epfc;


public class Cercle {
    static int nrInstance = 0;
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
        nrInstance++;
    }
    public double getAir(){
        return Math.PI*rayon*rayon;
        
    }
}
