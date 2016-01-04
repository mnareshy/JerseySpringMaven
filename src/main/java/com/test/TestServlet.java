package com.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

public class TestServlet extends HttpServlet{
	
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

	PrintWriter pw =  resp.getWriter();
	pw.write("Hello World !!!!!!");
	
	ServletConfig config = getServletConfig();
	String initPara = config.getInitParameter("com.sun.jersey.config.property.packages");
	
	ServletContainer  container = new ServletContainer();
	
//	container.RESOURCE_CONFIG_CLASS = "/RESTfulExample/src/main/java/com.test/TestServica.java";
	
	pw.write("\n");
	pw.write(initPara);
	pw.write("\n");
	ResourceConfig rc = new PackagesResourceConfig("com.sample");
	pw.write(rc.getClasses().toString() + " " + rc.getRootResourceClasses());	
	/*File file = new File("com.test");
	pw.write("\n");
	pw.write(file.getAbsolutePath());
	*/
	
	
	
	
	pw.close();
}

}