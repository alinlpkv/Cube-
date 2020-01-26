public class Degree {
    private int d;

    public Degree(){
        d = 0;
    }

    public int getDegree(){
        return d;
    }

    public void increment(){
        d+=15;

      //  this.setChanged();  //случилось событие, за которым кто-то наблюдает
       // this.notifyObservers(); //this.notifyObservers("1"); оповешает наблюдателя
    }

    public void minus(){
        d-=15;

     //   this.setChanged();  //случилось событие, за которым кто-то наблюдает
     //   this.notifyObservers(); //this.notifyObservers("1"); оповешает наблюдателя
    }
}
