package programbase.timecosttime;

interface Playable
{   
  void play();   
}    
  
interface Bounceable 
{
  void play();
}    
  
interface Rollable extends Playable, Bounceable 
{   
  Ball ball = new Ball("PingPang");   
}

class Ball implements Rollable 
{   
  private String name;    
  
  public String getName() 
  {   
    return name;   
  }    
  
  public Ball(String name) 
  {   
    this.name = name;           
  }

  public static void main(String[] args) {
    Rollable.ball.play();
  }
  
  @Override
  public void play()
  {
    System.out.println(ball.getName());   
  }   
}   
