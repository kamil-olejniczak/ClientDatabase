package com.company;

import com.company.controller.AddressControllerIntegrationTest;
import com.company.controller.AddressControllerTest;
import com.company.controller.AddressRestControllerIntegrationTest;
import com.company.controller.AddressRestControllerTest;
import com.company.controller.ClientControllerIntegrationTest;
import com.company.controller.ClientControllerTest;
import com.company.controller.ClientRestControllerIntegrationTest;
import com.company.controller.ClientRestControllerTest;
import com.company.controller.HomeControllerTest;
import com.company.dao.AbstractDaoTest;
import com.company.model.ClientTest;
import com.company.service.HibernateAddressServiceTest;
import com.company.service.HibernateClientServiceTest;
import com.company.util.LoggerInjectorTest;
import com.company.util.MappingsTest;
import com.company.util.WebDataResolverAndCreatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoggerInjectorTest.class,
        WebDataResolverAndCreatorTest.class,
        MappingsTest.class,
//        FastTests.class,
        ClientTest.class,
        AbstractDaoTest.class,
        HibernateClientServiceTest.class,
        HibernateAddressServiceTest.class,
        HomeControllerTest.class,
        ClientControllerTest.class,
        ClientControllerIntegrationTest.class,
        AddressControllerTest.class,
        AddressControllerIntegrationTest.class,
        ClientRestControllerTest.class,
        ClientRestControllerIntegrationTest.class,
        AddressRestControllerTest.class,
        AddressRestControllerIntegrationTest.class
})
public class JUnitTestSuite {
    //intentionally empty - JUnitTestSuite is sufficient
}

