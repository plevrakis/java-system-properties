# java-system-properties
A more object-oriented way to get the system properties in a Java program


    SystemProperties systemProperties = new SystemProperties();
    systemProperties.readProperties();
    String javaHome = systemProperties.getJavaHome();
    String javaClassPath = systemProperties.getJavaClassPath();
    Map<String, String> systemPropertiesMap = systemProperties.getProperties();

