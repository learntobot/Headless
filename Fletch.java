package headless;

import org.powerbot.script.Condition;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Item;

public class Fletch extends Task<ClientContext> {
  private int feather = 314;
  private int shaft = 52;
  
  public Fletch(ClientContext ctx) {
     super(ctx);
  }
  
  @Override
  public boolean activate() {
    return ctx.backpack.inViewport()
            && ctx.backpack().contains(feather + shaft)
            && ctx.players.local().animation() == -1;
  }
  
  @Override
  public void execute() {
    Condition.sleep();
    feather.interact(true, shaft);
  }
}
