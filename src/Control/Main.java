package Control;

import Model.Image;
import Persistence.ImageListLoader;
import UserInterface.ApplicationFrame;
import UserInterface.ImageViewer;
import UserInterface.ImageViewerPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    private static final String pathName= "/Users/soraya/NetBeansProjects/ImageViewer/pictures";
    private Map<String, Command> commandMap;
    private ApplicationFrame frame;
    
    public static void main(String[] args) {
        System.out.println(pathName);
        new Main().execute();
    }
    
    private void execute() {
        List<Image> images = new ImageListLoader(pathName).load();
        frame = createApplicationFrame();
        frame.getImageViewer().setImage(images.get(0));
        createCommands();
        frame.setVisible(true);
    }
    
    private ImageViewer createImageViewer(Image image){
        ImageViewer viewer = new ImageViewerPanel();
        viewer.setImage(image);
        return viewer;
    }
    
    private ApplicationFrame createApplicationFrame(){
        return new ApplicationFrame(new ActionListenerFactory() {

            @Override
            public ActionListener createActionListener(final String action) {
                return new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Command command = commandMap.get(action);
                        if (command==null) {
                            return;
                        }
                        command.execute();
                    }
                };
            }
        });
    }
    private void createCommands(){
        commandMap = new HashMap<>();
        commandMap.put("Prev", new PrevImageCommand(frame.getImageViewer()));
        commandMap.put("Next", new NextImageCommand(frame.getImageViewer()));
    }
}
