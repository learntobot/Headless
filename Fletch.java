package headless;

import org.powerbot.script.Condition;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;
import org.powerbot.script.rt6.Camera;
import org.powerbot.script.rt6.Component;


public class Fletch extends Task<ClientContext> {
  private int feather = 314;
  private int shaft = 52;
  private int x = nextInt(5,85)
  private int y = nextInt(0,360)
  
  public Fletch(ClientContext ctx) {
     super(ctx);
  }
  
  @Override
  public boolean activate() {
    if{return ctx.backpack.inViewport();
            && ctx.backpack().contains(feather + shaft);
            && !component(42).inViewport();
            && !component(20).inViewport();
    } else  camera.pitch(x).yaw(y);
  }
  
  @Override
  public void execute() {
    Condition.sleep();
    feather.interact(true, shaft);
  }
}
