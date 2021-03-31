package practices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NextGeneration 
{
  @Test
  public void testing()
  {
	  System.out.println("Executing test method");
  }
  @Test
  public void Display()
  {
	  System.out.println("executing display method");
  }
  @Test
  public void sum()
  {
	  System.out.println("executing sum method");
  }
  @BeforeMethod
  public void add()
  {
	  System.out.println("executing add method");
  }
  @AfterMethod
  public void mul()
  {
	  System.out.println("executing mul method");
  }
  @BeforeClass
  public void Division()
  {
  System.out.println("executing division method");
  } 
  @AfterClass
  public void random()
  {
	  System.out.println("executing random method");
  }
}
