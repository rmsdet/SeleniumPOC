package spec;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import util.ConfigReadrer;
public class SpecBuilder {

	public static RequestSpecification getRequestSpec() {

        return new RequestSpecBuilder()
                .setContentType(ConfigReadrer.getProperty("contentType"))
                .build();
    }
	
}
