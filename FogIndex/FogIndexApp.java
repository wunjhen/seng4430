package FogIndex;


public class FogIndexApp {
    public static void main(String[] args) {
        FogIndexView view = new FogIndexView();
        FogIndexModel model = new FogIndexModel("");
        FogIndexController controller = new FogIndexController(model, view);
        
        controller.updateView();
    }
}

