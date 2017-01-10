import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TrainTest{
  Train train;
  Passenger pass;

  @Before 
  public void before() {
    train = new Train("Glasgow");
    pass = new Passenger();
  }

  @Test
  public void hasDest(){
    assertEquals("Glasgow", train.getDest()); 
  }

  @Test
  public void empty(){
    assertEquals(0,train.passCount());

  }

  @Test
  public void full(){
    for(int i = 0 ; i < 30; i++) {
      train.board(pass);
    }
    assertEquals(30,train.passCount());

  }

  @Test
  public void  fullafter30(){
    for(int i = 0 ; i < 40; i++) {
      train.board(pass);
    }
    assertEquals(true,train.isFull());

  }

  @Test
  public void empties(){
    train.board(pass);
    train.empty();
    assertEquals(0, train.passCount());
  }




  @Test
  public void canboard() {
    train.board(pass);
    assertEquals(1,train.passCount());

  }
}
