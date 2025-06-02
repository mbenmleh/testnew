plugins {
    java
    application
}

group = "com.inass"
version = "1.0"

repositories {
    mavenCentral()
}

application {
    mainClass.set("_StudentRecordsManager.StudentManager")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
