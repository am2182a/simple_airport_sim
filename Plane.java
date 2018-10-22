
public class Plane {

		public int id = 0; 
		public int time_added = 0; 
		public int time_waiting = 0; 
		
		public Plane (int idn, int time) {
			id = idn; 
			
			time_added = time; 
		}
		
		public void time_update (int time) {
			time_waiting = time - time_added; 
		}
}
