package org.springframework.samples.petclinic.service;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p> Integration test using the jdbc profile.
 *
 * @author Thomas Risberg
 * @author Michael Isvy
 * @see AbstractClinicServiceTests AbstractClinicServiceTests for more details. </p>
 */

@SpringJUnitConfig(locations = {"classpath:spring/business-config.xml"})
@ActiveProfiles("jdbc")
class ClinicServiceJdbcTests extends AbstractClinicServiceTests {


}
