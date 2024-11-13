package IntroToJUnitAnnotations;

import org.junit.*;

public class annotationHirarchyTest {

//ANNOTATION
  //MEthods run in alpha-Numberic

  @BeforeClass
  public static void BeforeShafClass(){
    System.out.println("Executed Before Class annotationHirarchyTest ");
  }

  @AfterClass
  public static void AfterShafClass(){
    System.out.println("Executed After Class annotationHirarchyTest ");
  }

  @Before
  public void beforeTest(){
    System.out.println("This is coming from beforeTest");
  }

  @After
  public void afterTest(){
    System.out.println("This is coming from afterTest");
  }

  @Test
  public void HalaMadrid(){
    System.out.println("This is coming from Test1");
  }

  @Test
  public void ViscaBarca(){
    System.out.println("This is coming from Test2");

  }

  @Test
  public void ManUnited(){
    System.out.println("This is coming from Test3");

  }


// go to mvn repo and grab junit latest, paste it into the POM.xml file inside dependencies
//  go create a new Java class inside java package -- src.test.java.newFolder/class
  // create more than 1 method, and run it using Junit @Test Annotation

}
