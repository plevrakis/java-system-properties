import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * <code>SystemProperties</code> provides a more object-oriented way to get the
 * system properties. 
 * Sample usage: 
 * <code>
 * 		SystemProperties systemProperties = new SystemProperties();
 *		systemProperties.readProperties();
 *		String javaHome = systemProperties.getJavaHome();
 *		String javaClassPath = systemProperties.getJavaClassPath();
 *              Map<String, String> systemPropertiesMap = systemProperties.getProperties();
 * <code>
 * 
 * @author Panagiotis Plevrakis <br>
 *         Email: pplevrakis@hotmail.com <br>
 *         URL: https://github.com/plevrakis/
 */
public class SystemProperties {

	private String javaHome = null;
	private String javaVersion = null;
	private String javaVendor = null;
	private String javaVendorUrl = null;
	private String javaVirtualMachineName = null;
	private String javaVirtualMachineVersion = null;
	private String javaVirtualMachineSpecificationVersion = null;
	private String javaVirtualMachineSpecificationVendor = null;
	private String javaVirtualMachineSpecificationName = null;
	private String javaVirtualMachineVendor = null;
	private String javaSpecificationVersion = null;
	private String javaSpecificationVendor = null;
	private String javaSpecificationName = null;
	private String javaCompiler = null;
	private String javaExtensionDirectories = null;
	private String javaClassPath = null;
	private String javaLibraryPath = null;
	private String javaIOtempDirectory = null;
	private String fileSeparator = null;
	private String lineSeparator = null;
	private String pathSeparator = null;
	private String operatingSystemArch = null;
	private String operatingSystemName = null;
	private String operatingSystemVersion = null;
	private String systemLanguage = null;
	private String userDirectory = null;
	private String userHome = null;
	private String userName = null;
	private Toolkit toolKit = null;
	private Runtime runTime = null;
	private Dimension screenSize = null;
	private Map<String, String> properties = null;

	public SystemProperties() {

		javaHome = System.getProperty("java.home");
		javaVersion = System.getProperty("java.version");
		javaVendor = System.getProperty("java.vendor");
		javaVendorUrl = System.getProperty("java.vendor.url");
		javaVirtualMachineName = System.getProperty("java.vm.name");
		javaVirtualMachineVersion = System.getProperty("java.vm.version");
		javaVirtualMachineSpecificationVendor = System.getProperty("java.vm.specification.vendor");
		javaVirtualMachineSpecificationName = System.getProperty("java.vm.specification.name");
		javaVirtualMachineVendor = System.getProperty("java.vm.vendor");
		javaSpecificationVersion = System.getProperty("java.specification.version");
		javaSpecificationVendor = System.getProperty("java.specification.vendor");
		javaSpecificationName = System.getProperty("java.specification.name");
		javaCompiler = System.getProperty("java.compiler");
		javaExtensionDirectories = System.getProperty("java.ext.dirs");
		javaClassPath = System.getProperty("java.class.path");
		javaLibraryPath = System.getProperty("java.library.path");
		javaIOtempDirectory = System.getProperty("java.io.tmpdir");
		fileSeparator = System.getProperty("file.separator");
		lineSeparator = System.getProperty("line.separator");
		pathSeparator = System.getProperty("path.separator");
		operatingSystemArch = System.getProperty("os.arch");
		operatingSystemName = System.getProperty("os.name");
		operatingSystemVersion = System.getProperty("os.version");
		systemLanguage = System.getProperty("user.language");
		userDirectory = System.getProperty("user.dir");
		userHome = System.getProperty("user.home");
		userName = System.getProperty("user.name");
		toolKit = Toolkit.getDefaultToolkit();
		screenSize = toolKit.getScreenSize();

		properties = new HashMap<>();
		properties.put("screen size", screenSize.toString());
		properties.put("java home", javaHome);
		properties.put("java version", javaVersion);
		properties.put("java vendor", javaVendor);
		properties.put("java vendor url", javaVendorUrl);
		properties.put("java virtual machine", javaVirtualMachineName);
		properties.put("java virtual machine version", javaVirtualMachineVersion);
		properties.put("java virtual machine specification vendor", javaVirtualMachineSpecificationVendor);
		properties.put("java virtual machine specification name", javaVirtualMachineSpecificationName);
		properties.put("java virtual machine vendor", javaVirtualMachineVendor);
		properties.put("java specification version", javaSpecificationVersion);
		properties.put("java specification vendor", javaSpecificationVendor);
		properties.put("java specification name", javaSpecificationName);
		properties.put("java compiler", javaCompiler);
		properties.put("java extension directories", javaExtensionDirectories);
		properties.put("java class path", javaClassPath);
		properties.put("java library path", javaLibraryPath);
		properties.put("java IO temp directory", javaIOtempDirectory);
		properties.put("file separator", fileSeparator);
		properties.put("line separator", lineSeparator);
		properties.put("path separator", pathSeparator);
		properties.put("operating system arch", operatingSystemArch);
		properties.put("operating system name", operatingSystemName);
		properties.put("operating system version", operatingSystemVersion);
		properties.put("system language", systemLanguage);
		properties.put("user directory", userDirectory);
		properties.put("user home", userHome);
		properties.put("user name", userName);

	}

	/**
	 * read properties
	 */
	public void readProperties() {

		for (Entry<String, String> entry : properties.entrySet()) {
			System.out.println(entry.getKey() + " -->> " + entry.getValue());
		}

	}

	/**
	 * @return the javaHome
	 */
	public String getJavaHome() {
		return javaHome;
	}

	/**
	 * @return the javaVersion
	 */
	public String getJavaVersion() {
		return javaVersion;
	}

	/**
	 * @return the javaVendor
	 */
	public String getJavaVendor() {
		return javaVendor;
	}

	/**
	 * @return the javaVendorUrl
	 */
	public String getJavaVendorUrl() {
		return javaVendorUrl;
	}

	/**
	 * @return the javaVirtualMachineName
	 */
	public String getJavaVirtualMachineName() {
		return javaVirtualMachineName;
	}

	/**
	 * @return the javaVirtualMachineVersion
	 */
	public String getJavaVirtualMachineVersion() {
		return javaVirtualMachineVersion;
	}

	/**
	 * @return the javaVirtualMachineSpecificationVersion
	 */
	public String getJavaVirtualMachineSpecificationVersion() {
		return javaVirtualMachineSpecificationVersion;
	}

	/**
	 * @return the javaVirtualMachineSpecificationVendor
	 */
	public String getJavaVirtualMachineSpecificationVendor() {
		return javaVirtualMachineSpecificationVendor;
	}

	/**
	 * @return the javaVirtualMachineSpecificationName
	 */
	public String getJavaVirtualMachineSpecificationName() {
		return javaVirtualMachineSpecificationName;
	}

	/**
	 * @return the javaVirtualMachineVendor
	 */
	public String getJavaVirtualMachineVendor() {
		return javaVirtualMachineVendor;
	}

	/**
	 * @return the javaSpecificationVersion
	 */
	public String getJavaSpecificationVersion() {
		return javaSpecificationVersion;
	}

	/**
	 * @return the javaSpecificationVendor
	 */
	public String getJavaSpecificationVendor() {
		return javaSpecificationVendor;
	}

	/**
	 * @return the javaSpecificationName
	 */
	public String getJavaSpecificationName() {
		return javaSpecificationName;
	}

	/**
	 * @return the javaCompiler
	 */
	public String getJavaCompiler() {
		return javaCompiler;
	}

	/**
	 * @return the javaExtensionDirectories
	 */
	public String getJavaExtensionDirectories() {
		return javaExtensionDirectories;
	}

	/**
	 * @return the javaClassPath
	 */
	public String getJavaClassPath() {
		return javaClassPath;
	}

	/**
	 * @return the javaLibraryPath
	 */
	public String getJavaLibraryPath() {
		return javaLibraryPath;
	}

	/**
	 * @return the javaIOtempDirectory
	 */
	public String getJavaIOtempDirectory() {
		return javaIOtempDirectory;
	}

	/**
	 * @return the fileSeparator
	 */
	public String getFileSeparator() {
		return fileSeparator;
	}

	/**
	 * @return the lineSeparator
	 */
	public String getLineSeparator() {
		return lineSeparator;
	}

	/**
	 * @return the pathSeparator
	 */
	public String getPathSeparator() {
		return pathSeparator;
	}

	/**
	 * @return the operatingSystemArch
	 */
	public String getOperatingSystemArch() {
		return operatingSystemArch;
	}

	/**
	 * @return the operatingSystemName
	 */
	public String getOperatingSystemName() {
		return operatingSystemName;
	}

	/**
	 * @return the operatingSystemVersion
	 */
	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	/**
	 * @return the systemLanguage
	 */
	public String getSystemLanguage() {
		return systemLanguage;
	}

	/**
	 * @return the userDirectory
	 */
	public String getUserDirectory() {
		return userDirectory;
	}

	/**
	 * @return the userHome
	 */
	public String getUserHome() {
		return userHome;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the toolKit
	 */
	public Toolkit getToolKit() {
		return toolKit;
	}

	/**
	 * @return the runTime
	 */
	public Runtime getRunTime() {
		return runTime;
	}

	/**
	 * @return the screenSize
	 */
	public String getScreenSize() {

		return screenSize.toString();
	}

	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	@Override
	public String toString() {
		return "SystemProperties [javaHome=" + javaHome + ", javaVersion=" + javaVersion + ", javaVendor=" + javaVendor
				+ ", javaVendorUrl=" + javaVendorUrl + ", javaVirtualMachineName=" + javaVirtualMachineName
				+ ", javaVirtualMachineVersion=" + javaVirtualMachineVersion
				+ ", javaVirtualMachineSpecificationVersion=" + javaVirtualMachineSpecificationVersion
				+ ", javaVirtualMachineSpecificationVendor=" + javaVirtualMachineSpecificationVendor
				+ ", javaVirtualMachineSpecificationName=" + javaVirtualMachineSpecificationName
				+ ", javaVirtualMachineVendor=" + javaVirtualMachineVendor + ", javaSpecificationVersion="
				+ javaSpecificationVersion + ", javaSpecificationVendor=" + javaSpecificationVendor
				+ ", javaSpecificationName=" + javaSpecificationName + ", javaCompiler=" + javaCompiler
				+ ", javaExtensionDirectories=" + javaExtensionDirectories + ", javaClassPath=" + javaClassPath
				+ ", javaLibraryPath=" + javaLibraryPath + ", javaIOtempDirectory=" + javaIOtempDirectory
				+ ", fileSeparator=" + fileSeparator + ", lineSeparator=" + lineSeparator + ", pathSeparator="
				+ pathSeparator + ", operatingSystemArch=" + operatingSystemArch + ", operatingSystemName="
				+ operatingSystemName + ", operatingSystemVersion=" + operatingSystemVersion + ", systemLanguage="
				+ systemLanguage + ", userDirectory=" + userDirectory + ", userHome=" + userHome + ", userName="
				+ userName + ", toolKit=" + toolKit + ", runTime=" + runTime + ", screenSize=" + screenSize
				+ ", properties=" + properties + "]";
	}

}
