package  com.example.LengthOfIdentifiers;
;

public class LengthOfIdentifiersController {
    
    private LengthOfIdentifiersModel model;
    private LengthOfIdentifiersView view;
    public static int value;
    public LengthOfIdentifiersController(LengthOfIdentifiersModel model, LengthOfIdentifiersView view) {
        this.model = model;
        this.view = view;
    }
    public LengthOfIdentifiersController() {
       
    }

    public int analyzeIdentifiers() {
        int averageLength = model.calculateAverageIdentifierLength();
        return view.displayAverageIdentifierLength(averageLength);
    }

}
