/** 
 * The purpose of this class is to model a television.
 * Susan Searles, February 26, 2020
 */

public class Television {

	private	final 	String 	MANUFACTURER;	// brand name
	private	final 	int 	SCREEN_SIZE;	// size of television screen
	private	boolean	powerOn;				// status of power
	private	int 	channel;				// station showing on the television
	private	int		volume;					// loudness value
	
		/**
		 * Constructor
		 * @param MANUFACTURER	
		 * @param SCREEN_SIZE
		 */
		public Television(String manuf, int screen){
			MANUFACTURER = manuf;
			SCREEN_SIZE = screen;
			powerOn = false;
			volume = 20;
			channel = 2;
		}
		
		/** Accessor method definition: getVolume
		 * 
		 * @return volume
		 */
		public int getVolume(){
			return volume;
		}
		
		/** Accessor method definition: getChannel
		 * 
		 * @return channel
		 */
		public int getChannel() {
			return channel;
		}
		
		/** Accessor method definition: getManufacturer
		 * 
		 * @return MANUFACTURER
		 */
		public String getManufacturer(){
			return MANUFACTURER;
		}
		
		/** Accessor method definition: getScreenSize
		 * 
		 * @return SCREEN_SIZE
		 */
		public int getScreenSize() {
			return SCREEN_SIZE;
		}
		
		/** Mutator to accept a value to be stored in channel
		 * 
		 * @param station
		 */
		public void setChannel(int station) {
			channel = station;
		}
	
		/** Mutator to toggle the power
		 * 
		 */
		public void power() {
			powerOn = !powerOn;
		}
		
		/** Mutator to increase volume
		 * 
		 */
		public void increaseVolume(){
			volume+=1;
		}
		
		/** Mutator to decrease volume
		 * 
		 */
		public void decreaseVolume(){
			volume-=1;
		}
}


