package io.github.huypva.bridgepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Main {

  public static void main(String[] args) {

    log.info("Abtraction");
    Implementation concrete1Impl = new Concrete1Implementation();
    Abtraction abtraction = new Abtraction(concrete1Impl);
    abtraction.feature();

    log.info("RefinedAbtraction");
    Implementation concrete2Impl = new Concrete1Implementation();
    RefinedAbtraction refindAbtraction = new RefinedAbtraction(concrete2Impl);
    refindAbtraction.refinedFeature();
  }
}
