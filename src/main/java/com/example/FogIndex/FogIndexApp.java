package com.example.FogIndex;


public class FogIndexApp {
    public static void main(String[] args) {
        FogIndexView view = new FogIndexView();
        FogIndexModel model = new FogIndexModel("23213");
        FogIndexController controller = new FogIndexController(model, view);
        controller.updateView();
    }
}

