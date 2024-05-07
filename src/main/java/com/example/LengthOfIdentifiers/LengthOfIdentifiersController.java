package  com.example.LengthOfIdentifiers;
;

public class LengthOfIdentifiersController {
    
    private LengthOfIdentifiersModel model;
    private LengthOfIdentifiersView view;

    public LengthOfIdentifiersController(LengthOfIdentifiersModel model, LengthOfIdentifiersView view) {
        this.model = model;
        this.view = view;
    }

    public String analyzeIdentifiers() {
        double averageLength = model.calculateAverageIdentifierLength();
        return view.displayAverageIdentifierLength(averageLength);
    }
}
