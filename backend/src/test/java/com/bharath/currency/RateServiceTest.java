package com.bharath.currency;
import org.junit.jupiter.api.Test;import static org.junit.jupiter.api.Assertions.*;
class RateServiceTest{@Test void cacheEntryRecordWorks(){var rates=new RateService.Rates("EUR",java.util.Map.of("USD",1.1));assertEquals("EUR",rates.base());assertEquals(1.1,rates.rates().get("USD"));}}
