package io.github.huypva.bridgepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Concrete2Implementation implements Implementation{
    
    @Override
    public void method1() {
        log.info("Concrete2 implementation");
    }

    @Override
    public void method2() {
        log.info("Concrete2 implementation 2");
    }
}
