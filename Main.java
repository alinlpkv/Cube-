public class Main {

    public static void  main(String[] args) {
        R3Vector a = new R3Vector(10, 10, 10);
        R3Vector b = new R3Vector(10, 10, 10);
        a.out();
       //b.out();
       // R3Vector c= R3Vector.sum(a,b);
        //c.out();
        //a.sum(a).sum(a).out();
        //a.scale(5);
        //a.out();
        //a.translate(1,2,-3);
       // a.out();
      //  a.scalar(a,b);
       // a.vector(a,b).out();
     /*   a.rotateX(a,90);
        a.out();
        a.rotateY(a,90);
        a.out();
        a.rotateZ(a,90);
        a.out();
        b.rotateXYZ(b, 90,90,90 ).out();
        Facet f= new Facet(new R3Vector(0,0,0),new R3Vector(0,1,0),new R3Vector(1,1,0),new R3Vector(1,0,0));
        f.outFacet();
        f.rotate(0,0,90);
        System.out.println(" ");
        f.outFacet();
        System.out.println(" ");
        f.scale(5);
        f.outFacet();
        System.out.println(" ");
        f.translate(1,2,-3);
        f.outFacet(); */
        Cube c= new Cube();
        c.scale(100);
       c.translate(-50,-50,-50);
        c.rotateCube(100,70,15);
        Viewer v= new Viewer(c);
        //c.translate(50,70,70);
    }
}
