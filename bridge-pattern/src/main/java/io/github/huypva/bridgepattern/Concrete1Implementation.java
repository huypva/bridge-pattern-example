package io.github.huypva.bridgepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Concrete1Implementation implements Implementation{

    @Override
    public void method1() {
        log.info("Concrete1 implementation 1");
    }
    
    @Override
    public void method2() {
        log.info("Concrete1 implementation 2");
    }
}
