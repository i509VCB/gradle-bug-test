package me.i509.test;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TestPlugin implements Plugin<Project> {
	@Override
	public void apply(Project target) {
		target.getGradle().getSharedServices().registerIfAbsent("testService", TestService.class, params -> {
		});
	}
}
