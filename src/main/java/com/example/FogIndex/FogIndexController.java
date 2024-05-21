package com.example.FogIndex;


public class FogIndexController {
    private FogIndexModel model;
    private FogIndexView view;
    public  static int value;

    public FogIndexController(FogIndexModel model, FogIndexView view) {
        this.model = model;
        this.view = view;
    }
    public FogIndexController() {

    }
    public int updateView() {
        // String text = view.getInput();
       // model.setText(text);
        int fogIndex = model.calculateFogIndex();
        return view.displayFogIndex(fogIndex);
    }
}

