package com.lasarobotics.library.controller;

/**
 * Contains button state variables
 */
public enum ButtonState {
    NOT_PRESSED(0), PRESSED(1), RELEASED(2), HELD(3);           //Held down (called after PRESSED)
    
    public final int value;
    
    public ButtonState(int v) {
        this.value = v;
    }
}
