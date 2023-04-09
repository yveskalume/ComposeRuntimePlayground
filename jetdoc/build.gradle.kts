plugins {
    id("kotlin")
}

group = "com.yveskalume.jetdoc"
version = "0.0.1"

dependencies {
    implementation("org.jetbrains.compose.runtime:runtime:1.3.1")
    implementation("org.apache.poi:poi:5.2.3")
    implementation("org.apache.poi:poi-ooxml:5.2.3")
}

tasks.test {
    useJUnitPlatform()
}