import javafx.css.Match;

public class R3Vector { //класс, описывающий радиус-вектор с началом в 0;0, а конец где угодно
    public double x,y,z;
    public R3Vector(double x, double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){
        return this.z;
    }

    public void  out(){ System.out.println("("+x+", "+y+", "+z+")"); }

   /* Сумма одного вектора
   public R3Vector sum(R3Vector a){
        return new R3Vector(x+a.x,y+a.y,z+a.z);
    } */

    public static R3Vector sum(R3Vector a, R3Vector b){ return new R3Vector(a.x+b.x,a.y+b.y,a.z+b.z); }

    public void scale(double k){
        this.x*=k;
        this.y*=k;
        this.z*=k;
    }

    public void translate(double dx, double dy, double dz){
        x+=dx;
        y+=dy;
        z+=dz;
    }

    public static double scalarProduct(R3Vector a, R3Vector b){
     double scalarProduct = a.x*b.x+a.y*b.y+a.z*b.z;
        return scalarProduct;
    }

    public static R3Vector vectorProduct(R3Vector a, R3Vector b){
        return new R3Vector(a.y*b.z-a.z*b.y,a.z*b.x-a.x*b.z,a.x*b.y-a.y*b.x);
    }


    public static R3Vector rotateX(R3Vector a, double u){
        u=u*Math.PI/180;
        double y1=a.y*Math.cos(u)+ a.z*Math.sin(u);
        double z1= -a.y*Math.sin(u)+a.z*Math.cos(u);
        a.y=y1; a.z=z1;
       // System.out.print("Поворот по оси X= ");
        return new R3Vector(a.x,a.y,a.z);
    }

    public static R3Vector rotateY(R3Vector a,double u){
        u=u*Math.PI/180;
        double x1=a.x*Math.cos(u)+ a.z*Math.sin(u);
        double z1= -a.x*Math.sin(u)+a.z*Math.cos(u);
        a.x=x1; a.z=z1;
       // System.out.print("Поворот по оси Y= ");
        return new R3Vector(a.x,a.y,a.z);
    }

    public static R3Vector rotateZ(R3Vector a, double u){
        u=u*Math.PI/180;
        double x1=a.x*Math.cos(u)- a.y*Math.sin(u);
        double y1=a.x*Math.sin(u)+a.y*Math.cos(u);
        a.x=x1; a.y=y1;
       // System.out.print("Поворот по оси Z= ");
        return new R3Vector(a.x,a.y,a.z);
    }

    public static R3Vector rotateXYZ(R3Vector a, double u, double q, double w){
       return rotateX(a,u).rotateY(a,q).rotateZ(a,w);
    }

}
