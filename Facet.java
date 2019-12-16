import java.awt.*;
import java.awt.geom.Path2D;

public class Facet {
    private R3Vector[] vertex;
    public Color color;


    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4, Color color){
        //this.color=color;
        vertex = new R3Vector[4];
        vertex[0]=v1;
        vertex[1]=v2;
        vertex[2]=v3;
        vertex[3]=v4;
        this.color=color;
    }

    public void outFacet(){
        for (int i = 0; i< vertex.length; i++){
            System.out.print((i+1)+" вершина ");
            vertex[i].out();
        }
    }

     /*public static R3Vector rotate(R3Vector[] facets, double ux, double uy, double uz) {
        for (int i = 0; i < 4; i++) {
           return R3Vector.rotateXYZ(facets[i], ux, uy, uz);
        }*/

     public void rotate(double ux,double uy,double uz){
         for (int i = 0; i< vertex.length; i++){
             vertex[i].rotateXYZ(vertex[i], ux,uy,uz);
         }
     }

     public void scale(double k){
        for (int i = 0; i< vertex.length; i++){
            vertex[i].scale(k);
        }
    }

    public void translate(double dx, double dy, double dz){
        for (int i = 0; i< vertex.length; i++){
            vertex[i].translate(dx,dy,dz);
        }
    }

    public double normal(){
         R3Vector a= new R3Vector(vertex[1].getX() - vertex[0].getX(), vertex[1].getY() - vertex[0].getY(), vertex[1].getZ() - vertex[0].getZ());
         R3Vector b=new R3Vector(vertex[2].getX() - vertex[1].getX(), vertex[2].getY() - vertex[1].getY(), vertex[2].getZ() - vertex[1].getZ());
         R3Vector c= a.vectorProduct(a,b);
        return c.getZ();
    }

    public void draw(Graphics2D g){
         for(int i=0; i<vertex.length;i++){
             Path2D p= new Path2D.Double();
             p.moveTo(vertex[0].getX(),vertex[0].getY());
             p.lineTo(vertex[1].getX(),vertex[1].getY());
             p.lineTo(vertex[2].getX(),vertex[2].getY());
             p.lineTo(vertex[3].getX(),vertex[3].getY());
             p.lineTo(vertex[0].getX(),vertex[0].getY());
             p.closePath();
             g.setColor(color);
             g.draw(p);
             g.fill(p);
         }
    }
}
// в классе грань вычисление нормали, векторное произведение граней, ра