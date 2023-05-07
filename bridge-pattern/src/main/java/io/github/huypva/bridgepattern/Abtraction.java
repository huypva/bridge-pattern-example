package io.github.huypva.bridgepattern;

import lombok.AllArgsConstructor;

/**
 * @author huypva
 */
@AllArgsConstructor
public class Abtraction {
    
    protected Implementation implementation;

    public void feature() {
        implementation.method1();
        implementation.method2();
    }
}
