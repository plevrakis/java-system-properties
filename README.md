# java-system-properties
A more object-oriented way to get the system properties in a Java program.
Just create a SystemProperties object in your program and use it to retrieve 
individual system properties or all properties in a Map collection.


    SystemProperties systemProperties = new SystemProperties();
    systemProperties.readProperties();
    String javaHome = systemProperties.getJavaHome();
    String javaClassPath = systemProperties.getJavaClassPath();
    Map<String, String> systemPropertiesMap = systemProperties.getProperties();
    
    String lineSeparator = systemProperties.getLineSeparator();
	BufferedReader reader = new BufferedReader(new FileReader(filename));
	String line;
	StringBuilder sb = new StringBuilder();
	while ((line = reader.readLine()) != null) {
		sb.append(line + <b>lineSeparator</b>);
	}
	reader.close();
