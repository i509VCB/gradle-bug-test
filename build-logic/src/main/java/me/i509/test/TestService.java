package me.i509.test;

import org.gradle.api.provider.Property;
import org.gradle.api.services.BuildService;
import org.gradle.api.services.BuildServiceParameters;

public abstract class TestService implements BuildService<TestService.Params> {
	public interface Params extends BuildServiceParameters {
		// A property without a `get` prefix
		Property<String> someProperty();
	}
}
