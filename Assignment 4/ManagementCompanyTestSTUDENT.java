

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	

	public void setUp() throws Exception {
		//student create a management company
		ManagementCompany mgm;
		//student add three properties, with plots, to mgmt co
		Property p1, p2, p3, p4, p5, p6;
		
		@Before
		public void setUp() throws Exception{
			p1 = new Property ("Grand Teton", "Jackson Hole", 3000.00, "Ansel Adams", 1, 1, 2, 2);
			p2 = new Property ("Badlands", "Wall", 4000.00, "Teddy Roosevelt", 4, 4, 2, 2);
			p3 = new Property ("Glacier", "Whitefish", 5000.00, "John Muir", 6, 6, 2, 2);
			
			mgm = new ManagementCompany("TrailLover", "12345", 5);
			
			mgm.addProperty(p1);
			mgm.addProperty(p2);
			mgm.addProperty(p3);
		}


	@After
	public void tearDown() {
		//student set mgmt co to null  
		p1p2=p3=null;
		mgm = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
//		fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property ("FourArgs", "Las Vegas", 2000.00, "Elvis Presley");
		//student should add property with 8 args
		p5 = new Property ("EightArgs", "Seattle", 4000.00, "Barney Fife", 9, 9, 1, 1);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		p6 = new Property ("TooBig", "Great Falls", 2000.00, "Mr. Ed", 2, 7, 1, 1);
	}
 
	@Test
	public void testMaxRentProp() {
//		fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(mgm.MaxRentProp(), 5000.00);
	}

	@Test
	public void testTotalRent() {
		fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(mgm.totalRent(), 18000.00);
	}
	}

 }