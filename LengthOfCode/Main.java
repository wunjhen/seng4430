package LengthOfCode;

public class Main {
    public static void main(String[] args) {
        LengthOfCodeModel model = new LengthOfCodeModel();
        LengthOfCodeView view = new LengthOfCodeView();
        LengthOfCodeController controller = new LengthOfCodeController(model, view);
        controller.calculateLength();
    }
}
