public class Train{

  private String dest;
  private Passenger[] seating;

  public Train(String dest){
    this.dest = dest;
    this.seating = new Passenger[30];
  }

  public String getDest(){
    return this.dest;
  }

  public void board(Passenger pass) {
    if (isFull()) return;
    int passcount = passCount();
    seating[passcount] = pass;

  }

  public boolean isFull(){
    return passCount() == seating.length;

  }

  public void empty(){
    for(int i=0;i<seating.length;i++)
    {
        seating[i] = null;
    }
  }

  public int passCount(){
    int count = 0;
    for (Passenger passenger : seating) {
    if(passenger != null) {
      count += 1;
    }
    }
    return count;
  }
}
