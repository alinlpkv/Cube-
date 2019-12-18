import javax.swing.*;
import java.awt.*;

public class Cube {
    private Facet[] facets;

    public Cube(){
        facets= new Facet[6];
        //задняя
        facets[0]= new Facet( new R3Vector(0,0,0), new R3Vector(1,0,0),new R3Vector(1,1,0),new R3Vector(0,1,0), Color.RED);
       //правая
        facets[1]= new Facet( new R3Vector(1,0,0), new R3Vector(1,0,1),new R3Vector(1,1,1),new R3Vector(1,1,0), Color.BLUE);
        //нижняя
        facets[2]= new Facet( new R3Vector(1,0,1), new R3Vector(1,0,0),new R3Vector(0,0,0),new R3Vector(0,0,1), Color.BLACK);
        //левая
        facets[3]= new Facet( new R3Vector(0,0,0), new R3Vector(0,1,0),new R3Vector(0,1,1),new R3Vector(0,0,1), Color.GREEN);
        //сверху
        facets[4]= new Facet( new R3Vector(0,1,0), new R3Vector(1,1,0),new R3Vector(1,1,1),new R3Vector(0,1,1), Color.YELLOW);
        //передняя
        facets[5]= new Facet( new R3Vector(0,1,1), new R3Vector(1,1,1),new R3Vector(1,0,1),new R3Vector(0,0,1), Color.ORANGE);
    }

    public void rotateCube(double ux,double uy,double uz){
        for (int i = 0; i< facets.length; i++){
            facets[i].rotate(ux,uy,uz);
        }
    }

    public void scale(double k){
        for (int i = 0; i< facets.length; i++){
            facets[i].scale(k);
        }
    }

    public void translate(double dx, double dy, double dz){
        for (int i = 0; i< facets.length; i++){
            facets[i].translate(dx,dy,dz);
        }
    }

   public void draw(Graphics2D g){
        for(int i=0;i<facets.length;i++){
            //если повернуто лицом то рисуется
            if ( facets[i].normal() > 0) {
                facets[i].draw(g);
                System.out.println("координата z "+ facets[i].normal()+" грань "+i);
          }
        }
   }

   public void perpdraw(Graphics2D g){
       for(int i=0;i<facets.length;i++){
           //если повернуто лицом то рисуется
           if ( facets[i].normal() > 0) {
               facets[i].perpdraw(g);
               System.out.println("координата z "+ facets[i].normal()+" грань "+i);
          }
       }
   }

}
