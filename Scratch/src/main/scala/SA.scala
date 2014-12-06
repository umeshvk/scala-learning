object SA extends App {
  //new Top log
  this gather "4 tables" //having 3 legs 
  
  def gather(y : String) = { 
    
    this
  }
  
}

class Axxx extends Bxxx with App
class Bxxx extends Cxxx
class Cxxx

class CB  {
  
    def log() {
    println("CB")
  }

}

trait TXDud {
  val a = 1000
}

trait TX {
  
  def log() {
    println("TX")
  }


}

trait T0 extends CB {

  /*
  override def log() {
    println("T0")
    //super.log
  }
  * 
  */


}

trait T1 extends TXDud {

  /*
  def log() {
    println("T1")
    //super.log();
  }
  * 
  */

}

trait T2 extends TXDud {
  /*
  override def log() {
    println("T2")
     //super.log();
  }
  */
}

trait T3 extends TXDud {
  /*
  override def log() {
    println("T3")
     //super.log();
  }
  */
}

class Below extends CB{
    def   logHide() {
    println("Below")
    //super.log();
  }
}

class Top extends Below with T1 with T2 with T3 with T0 {
  override def log() {
    println("Top")
    super.log
  }
}

