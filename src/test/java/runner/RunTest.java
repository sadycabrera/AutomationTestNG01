package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//**MEDIANTE ESTE CLASE SE PUEDE EJECUTAR LAS PRUEBAS MEDIANTE JUNIT o TESTNG A LA VEZ SIN MODIFICAR NADA.*//

@CucumberOptions(features={"src/test/java/features/DocumentoWeb.feature"}
					,glue={"stepdefinations","utility"},
					 plugin = {"pretty", "html:target/cucumber"}
		)
//SE ACTIVAS Test PARA EJECUTAR CON 
//@Test
//@RunWith(Cucumber.class)
//public class RunTest {

//}


@RunWith(Cucumber.class)

public class RunTest extends AbstractTestNGCucumberTests{

}
