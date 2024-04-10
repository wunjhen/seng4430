package LengthOfIdentifiers;

public class Main {
    public static void main(String[] args) {
        String programText = "int myVariable; MyClass myClass = new MyClass(); myClass.myMethod();";
        LengthOfIdentifiersModel model = new LengthOfIdentifiersModel(programText);
        LengthOfIdentifiersView view = new LengthOfIdentifiersView();
        LengthOfIdentifiersController controller = new LengthOfIdentifiersController(model, view);
        controller.analyzeIdentifiers();
    }
}

