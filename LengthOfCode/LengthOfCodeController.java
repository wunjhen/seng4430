package LengthOfCode;

public class LengthOfCodeController {
    private LengthOfCodeModel model;
    private LengthOfCodeView view;

    public LengthOfCodeController(LengthOfCodeModel model, LengthOfCodeView view) {
        this.model = model;
        this.view = view;
    }

    public void calculateLength() {
        String code = view.getCodeFromUser();
        int length = model.calculateLength(code);
        view.displayResult(length);
    }
    //d
}

