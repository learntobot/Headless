package headless;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Script.Manifest(name = "Headless Arrow Maker", description = "Quickly combines feathers and arrow shafts.")
public class HeadlessArrow extends PollingScript<ClientContext> {
  private List<Task> taskList = new ArrayList<Task>);
  
  @Override
  public start() {
    taskList.addAll(Arrays.asList(new Chop(ctx), new Drop(ctx)));
  }
  
  @Override
  public void poll() {
    for (Task task : taskList) {
      if (task.activate()) {
          task.execute();
      }
    }
  }
}
