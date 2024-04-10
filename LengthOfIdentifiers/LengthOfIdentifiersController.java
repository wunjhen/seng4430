package LengthOfIdentifiers;

public class LengthOfIdentifiersController {
    
    private LengthOfIdentifiersModel model;
    private LengthOfIdentifiersView view;

    public LengthOfIdentifiersController(LengthOfIdentifiersModel model, LengthOfIdentifiersView view) {
        this.model = model;
        this.view = view;
    }

    public void analyzeIdentifiers() {
        double averageLength = model.calculateAverageIdentifierLength();
        view.displayAverageIdentifierLength(averageLength);
    }
}
