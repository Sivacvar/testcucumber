package RunnerPackage;

import java.io.File;

import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReporting {

	public static void generatejvmreport(String filepath) {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\NewWork\\DemoCucumber\\Report");
		Configuration config = new Configuration(f,"automate the login feature");
		config.addClassifications("browser", "chrome");
		config.addClassifications("version", "112");
		config.addClassifications("sprint", "2 weeks");
		config.addClassifications("OS", "Windows");
		
		List<String> li = new ArrayList<String>();
		li.add(filepath);
		
		ReportBuilder builder = new ReportBuilder(li,config);
		builder.generateReports();
		
	}
}
