package com.example.FogIndex;


public class FogIndexController {
    private FogIndexModel model;
    private FogIndexView view;

    public FogIndexController(FogIndexModel model, FogIndexView view) {
        this.model = model;
        this.view = view;
    }

    public String updateView() {
        // String text = view.getInput();
       // model.setText(text);
        double fogIndex = model.calculateFogIndex();
        return view.displayFogIndex(fogIndex);
    }
}

