package headless;

import org.powerbot.script.rt6.Item;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.Input;
import org.powerbot.script.Mouse;
import org.powerbot.script.rt6.Component;

public class Wait extends Task<ClientContext> {
  private int logIds = 1511;
  
  public Wait(ClientContext ctx) {
     super(ctx);
  }
  
  @Override
  public boolean activate() {
    return component(20).inViewport();
  }
  
  @Override
  public void execute() {
    Mouse.move(component(20).getLocation());
    hover();
    click(true);
  }
}
