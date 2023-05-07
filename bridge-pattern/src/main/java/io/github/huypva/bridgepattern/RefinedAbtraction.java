package io.github.huypva.bridgepattern;

/*
 * @author huuypva
 */
public class RefinedAbtraction extends Abtraction {

    public RefinedAbtraction(Implementation implementation) {
        super(implementation);
    }

    public void refinedFeature() {
        implementation.method1();
    }
    
}
