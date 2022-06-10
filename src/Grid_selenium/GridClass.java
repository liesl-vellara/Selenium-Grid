package Grid_selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridClass {
	
	public static void main(String[] args) throws MalformedURLException {
		
		// checking if the node has the desired capabilities
		
		// I am expecting that the other machine that we are connecting with
		// chrome is there
		DesiredCapabilities cp = DesiredCapabilities.chrome();
		
		// when you are running on a remote machine we call the webdriver as 
		// remote webdriver
		// and we check the capability of the node
		//WebDriver driver = new RemoteWebDriver(cp);
		
		// before we give the webdriver, we have to specify where our remote
		// machine is, therefore we use new URL("ip address for nodes to register with)
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.136:4444/wd/hub"), cp);
		
		// script can be added here
		// it will hit the hub, and then run to the node
		// it will run on the command prompt of the node
	}

}
