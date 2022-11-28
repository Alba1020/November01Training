public class SelectWebDriver {
	public Browser getInstance(String str) {
		if(str.equals("Firefox"))
		{
			return new FirefoxWebDriver();
		}
		else if(str.equals("Edge")) {
			return new MicrosoftEdgeWebDriver();
		}
		else {
			return new ChromeWebDriver();
		}
	}
}
