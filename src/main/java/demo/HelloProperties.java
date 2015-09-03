package demo;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello")
public class HelloProperties {

	/**
	 * Prefix of the welcome message.
	 */
	private String prefix = "Hello";

	/**
	 * Suffix of the welcome message.
	 */
	@NotNull
	private String target;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

}