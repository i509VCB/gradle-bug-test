plugins {
	id("java-library")
	id("java-gradle-plugin")
	id("maven-publish")
}

group = "me.i509"
version "0.1.0"

dependencies {
	implementation(gradleApi())
}

gradlePlugin {
	plugins {
		create("testPlugin") {
			id = "me.i509.test"
			implementationClass = "me.i509.test.TestPlugin"
			version = project.version
		}
	}
}
