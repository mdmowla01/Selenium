import WebApplication.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class titleTest extends TestBase {
   Amazon amazon;
   Azure azure;
   Brightspace brightspace;
   Ebay ebay;
   Facebook facebook;
   Google google;
   Nyu nyu;
   Oracle oracle;
   Toolsqa toolsqa;
   String title;

   @Test
   public void TestTitleAmazon()
   {
      driver.get("https://www.amazon.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Amazon.com. Spend less. Smile more.", title);

   }

   @Test
   public void TestTitleAzure()
   {
      driver.get("https://azure.microsoft.com/en-us/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Cloud Computing Services | Microsoft Azure", title);

   }

   @Test
   public void TestTitleBrightSpace()
   {
      driver.get("https://www.d2l.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("D2L | Creators of the Brightspace Learning Management System Software (LMS Software)", title);

   }

   @Test
   public void TestTitleEbay()
   {
      driver.get("https://www.ebay.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Electronics, Cars, Fashion, Collectibles & More | eBay", title);

   }

   @Test
   public void TestTitleFacebook()
   {
      driver.get("https://www.facebook.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Facebook - Log In or Sign Up", title);

   }

   @Test
   public void TestTitleGoogle()
   {
      driver.get("https://www.google.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Google", title);

   }

   @Test
   public void TestTitleNyu()
   {
      driver.get("https://www.nyu.edu/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("NYU", title);

   }

   @Test
   public void TestTitleOracle()
   {
      driver.get("https://www.oracle.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Oracle | Cloud Applications and Cloud Platform", title);

   }

   @Test
   public void TestTitleToolsqa()
   {
      driver.get("https://www.toolsqa.com/");
      title = getTitleText();
      System.out.println(title);
      Assert.assertEquals("Tools QA", title);

   }





}
