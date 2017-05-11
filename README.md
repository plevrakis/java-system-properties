# java-system-properties
A more object-oriented way to get the system properties in a Java program.
Just create a SystemProperties object in your program and use it to retrieve 
individual system properties or all properties in a Map collection.


    SystemProperties systemProperties = new SystemProperties();
    systemProperties.readProperties();
    String javaHome = systemProperties.getJavaHome();
    String javaClassPath = systemProperties.getJavaClassPath();
    Map<String, String> systemPropertiesMap = systemProperties.getProperties();

