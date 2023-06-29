package javaapplication21;

public class Circul {
    int radius;
    static int diametr;
    
    private Circul(){
        
    }
    public Circul(int radius){
        this.setRadius(radius);
    }
    public void setRadius(int rad){
        radius=rad;
    }
    public static void setDiametr(int dim){
        diametr=dim;
    }

    @Override
    public String toString() {
        return "Circul{" + "radius=" + radius +"diametr="+diametr;
    }
    
}
