package project;


	import org.testng.annotations.Test;

	public class TestClass extends Website {
		
		@Test(priority=1)
		public void config() throws Exception{
			Website.Websitemethod();
		}
		@Test(priority=2)
		public void config2() throws Exception{
			CheckOut.CheckOutmethod();
		}
		@Test(priority=3)
		public void buynow() throws Exception{
			BuyNow.BuyNowmethod();
		}
		
		

}
