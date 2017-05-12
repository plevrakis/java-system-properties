# java-system-properties
A more object-oriented way to get the system properties in a Java program.
Just create a SystemProperties object in your program and use it to retrieve 
individual system properties or all properties in a Map collection.

A few sample usages:


SystemProperties systemProperties = new SystemProperties();
systemProperties.readProperties();

// get the java home property
String javaHome = systemProperties.getJavaHome();

// get the java class path property
String javaClassPath = systemProperties.getJavaClassPath();

// get a Map with all the system properties
Map<String, String> systemPropertiesMap = systemProperties.getProperties();

// get the system line separator
String lineSeparator = systemProperties.getLineSeparator();
BufferedReader reader = new BufferedReader(new FileReader(filename));
String line;
StringBuilder sb = new StringBuilder();
while ((line = reader.readLine()) != null) {
sb.append(line + lineSeparator);
}
reader.close();

