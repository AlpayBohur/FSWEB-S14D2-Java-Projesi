package com.workintech.enums;

public enum PaintColor {
    BLUE("#00000ff"),
    RED("#ff0000"),
    GREEN("#3cb371"),
    WHITE("#ffffff");

    private String hexCode;

    PaintColor(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode(){
        return hexCode;
    }
}
