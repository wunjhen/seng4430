package FogIndex;


public class FogIndexController {
    private FogIndexModel model;
    private FogIndexView view;

    public FogIndexController(FogIndexModel model, FogIndexView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        String text = view.getInput();
        model.setText(text);
        double fogIndex = model.calculateFogIndex();
        view.displayFogIndex(fogIndex);
    }
}

