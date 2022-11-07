import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderTests {
  @Test
  public void cangGetStateNameTexas() {
	  var expectedState = "Texas";
	  
	  var actualState = States.Texas.Name;
	  
	  Assert.assertEquals(actualState,expectedState,"State name should be returned.");
  }
  @Test
  public void cangGetStateNameFlorida() {
	  var expectedState = "Florida";
	  
	  var actualState = States.Florida.Name;
	  
	  Assert.assertEquals(actualState,expectedState,"State name should be returned.");
  }
  @Test
  public void canGetStateAbbreviationTexas(){
	  var expectedAbbreviation = "TX";
	  
	  var actualAbbreviation = States.Texas.Abbreviation;
	  
	  Assert.assertEquals(actualAbbreviation,expectedAbbreviation,"State abbreviation should be returned.");
	  
  }
  @Test
  public void canGetStateAbbreviationWashington(){
	  var expectedAbbreviation = "WN";
	  
	  var actualAbbreviation = States.Washington.Abbreviation;
	  
	  Assert.assertEquals(actualAbbreviation,expectedAbbreviation,"State abbreviation should be returned.");
	  
  }
  @Test
  public void canGetCityMiami() {
	  var expectedCity = "Miami";
	  
	  var actualCity = Cities.Miami.Name;
	  
	  Assert.assertEquals(expectedCity,actualCity,"City should be returned."); 
  }
  @Test
  public void canGetCitySeattle() {
	  var expectedCity = "Seattle";
	  
	  var actualCity = Cities.Seattle.Name;
	  
	  Assert.assertEquals(expectedCity,actualCity,"City should be returned."); 
  }
  @Test
  public void canGetNFLTeam() {
	  var expectedCity = "Texans";
	  
	  var actualCity = NflTeams.Texans.Name;
	  
	  Assert.assertEquals(expectedCity,actualCity,"NFL team should be returned."); 
  }
  @Test
  public void canGetStateNameFromObjectMotherLouisiana(){
	  var expectedState = "Louisiana";
	  
	  var actualState = getState(LocationObjectMothers.NewOrleans());
	  
	  Assert.assertEquals(actualState.Name,expectedState,"State should be returned.");
  }
  @Test
  public void canGetStateNameFromObjectMotherTexas(){
	  var expectedState = "Texas";
	  
	  var actualState = getState(LocationObjectMothers.Houston());
	  
	  Assert.assertEquals(actualState.Name,expectedState,"State should be returned.");
  }
  private State getState(LocationObjectMother mother) {
	
	return mother.State;
  }
}
