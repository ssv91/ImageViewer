package Commands;

import java.awt.event.ActionListener;

public interface Command extends ActionListener {
    
    public void execute();
}
