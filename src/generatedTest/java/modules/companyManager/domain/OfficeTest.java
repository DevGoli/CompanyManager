package modules.companyManager.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class OfficeTest extends AbstractDomainTest<Office> {

	@Override
	protected Office getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Office.MODULE_NAME, Office.DOCUMENT_NAME);
	}
}