package springcloudconfig.client.greeting;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {
	private final GreetingProps props;

	public GreetingController(GreetingProps props) {
		this.props = props;
	}

	@GetMapping("greeting")
	public String greeting(){
		return props.getMessage();
	}
}

