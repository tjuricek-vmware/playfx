plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.9"
    id("org.beryx.jlink") version "2.20.0"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:28.2-jre")

    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

application {
    // Define the main class for the application.
    mainClassName = "playfx.App"
}

val test by tasks.getting(Test::class) {
    // Use junit platform for unit tests
    useJUnitPlatform()
}

javafx {
    version = "14.0.1"
    modules = mutableListOf("javafx.controls")
}

jlink {
    launcher {
        name = "playfx"
    }
}