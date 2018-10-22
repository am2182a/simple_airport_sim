import java.util.*; 


public class Main_Simulation {
	
	
	//Creates a random double from 0.0 to 0.9
	public static double rando_gen() {
		return Math.random();
	}
	
	
	//Decides if a plane should be added to Landing Queue
	public static Queue<Plane> add_landing(Queue<Plane> Landing_Runway, int time, int id_landing) {
		double add_plane = rando_gen(); 
		double num_decide = rando_gen(); 
		// 60% chance that plane will be added to the Landing Queue during a step 
				if (add_plane > 0.4) {
					//15% chance that 2 planes will be added to Landing Queue if Queue has more than 8 planes
					if (Landing_Runway.size() > 8 && num_decide > 0.85) {
						for(int i = 0; i<2; i++) {
						Plane a = new Plane(id_landing+=2, time); 
						Landing_Runway.add(a); 
						}
					}
					//65% chance that 1 plane will be added to Landing Queue if Queue has more than 8 planes
					else if (Landing_Runway.size() > 8 && num_decide > 0.2) {
						Plane a = new Plane(id_landing+=2, time); 
						Landing_Runway.add(a); 
					}
					//15% chance that 3 planes will be added to Landing Queue if Queue has 4,5,6, or 7 planes
					else if (Landing_Runway.size() >= 4 && num_decide > 0.85) {
						for(int i = 0; i<3; i++) {
							Plane a = new Plane(id_landing+=2, time); 
							Landing_Runway.add(a); 
						}
					}
					//30% chance that 1 plane will be added to Landing Queue if Queue has 4,5,6, or 7 planes
					else if (Landing_Runway.size() >= 4 && num_decide > 0.55) {
						Plane a = new Plane(id_landing+=2, time); 
						Landing_Runway.add(a); 
					}
					//40% chance that 2 planes will be added to Landing Queue if Queue has 4,5,6 or 7 planes
					else if (Landing_Runway.size() >=0 && num_decide > 0.15) {
						for(int i = 0; i<2; i++) {
							Plane a = new Plane(id_landing+=2, time); 
							Landing_Runway.add(a); 
						}
					}
					//15% chance that 1 plane will be added to Landing Queue if Queue is less than 4 planes
					else if (Landing_Runway.size() >=0 && num_decide > 0.85) {
						Plane a = new Plane(id_landing+=2, time); 
						Landing_Runway.add(a); 
					}
					//25% chance that 2 planes will be added to Landing Queue if Queue is less than 4 planes
					else if (Landing_Runway.size() >= 0  && num_decide > 0.6) {
						for(int i = 0; i<2; i++) {
							Plane a = new Plane(id_landing+=2, time); 
							Landing_Runway.add(a); 
						}
					}
					//50% chance that 3 planes will be added to Landing Queue if Queue is less than 4 planes
					else if (Landing_Runway.size() >= 0 && num_decide > 0.1) {
						for(int i = 0; i<3; i++) {
							Plane a = new Plane(id_landing+=2, time); 
							Landing_Runway.add(a); 
						}
					}
				}
				return Landing_Runway;
			}
	
	//Updates how long planes have been waiting
	public static Queue<Plane> updatewaittimes(Queue<Plane> Runway, int time) {
		int size = Runway.size(); 
		for (int i = 0; i < size; i++) {
			Plane b = Runway.remove(); 
			b.time_update(time);
			Runway.add(b); 
		}
		return Runway;
	}
	
	//Decides if a plane should be added to the Takeoff Queue
	public static Queue<Plane> add_takeoff(Queue<Plane> Takeoff_Runway, int time, int id_takeoff) {
		double add_plane = rando_gen(); 
		double num_decide = rando_gen(); 
		// 60% chance that plane will be added to the Takeoff Queue during a step 
				if (add_plane > 0.4) {
					//15% chance that 2 planes will be added to Takeoff Queue if Queue has more than 8 planes
					if (Takeoff_Runway.size() > 8 && num_decide > 0.85) {
						for(int i = 0; i<2; i++) {
						Plane a = new Plane(id_takeoff+=2, time); 
						Takeoff_Runway.add(a); 
						}
					}
					//65% chance that 1 plane will be added to Takeoff Queue if Queue has more than 8 planes
					else if (Takeoff_Runway.size() > 8 && num_decide > 0.2) {
						Plane a = new Plane(id_takeoff+=2, time); 
						Takeoff_Runway.add(a); 
					}
					//15% chance that 3 planes will be added to Takeoff Queue if Queue has 4,5,6, or 7 planes
					else if (Takeoff_Runway.size() >= 4 && num_decide > 0.85) {
						for(int i = 0; i<3; i++) {
							Plane a = new Plane(id_takeoff+=2, time); 
							Takeoff_Runway.add(a); 
						}
					}
					//30% chance that 1 plane will be added to Takeoff Queue if Queue has 4,5,6, or 7 planes
					else if (Takeoff_Runway.size() >= 4 && num_decide > 0.55) {
						Plane a = new Plane(id_takeoff+=2, time); 
						Takeoff_Runway.add(a); 
					}
					//40% chance that 2 planes will be added to Takeoff Queue if Queue has 4,5,6 or 7 planes
					else if (Takeoff_Runway.size() >=0 && num_decide > 0.15) {
						for(int i = 0; i<2; i++) {
							Plane a = new Plane(id_takeoff+=2, time); 
							Takeoff_Runway.add(a); 
						}
					}
					//15% chance that 1 plane will be added to Takeoff Queue if Queue is less than 4 planes
					else if (Takeoff_Runway.size() >=0 && num_decide > 0.85) {
						Plane a = new Plane(id_takeoff+=2, time); 
						Takeoff_Runway.add(a); 
					}
					//25% chance that 2 planes will be added to Takeoff Queue if Queue is less than 4 planes
					else if (Takeoff_Runway.size() >= 0  && num_decide > 0.6) {
						for(int i = 0; i<2; i++) {
							Plane a = new Plane(id_takeoff+=2, time); 
							Takeoff_Runway.add(a); 
						}
					}
					//50% chance that 3 planes will be added to Takeoff Queue if Queue is less than 4 planes
					else if (Takeoff_Runway.size() >= 0 && num_decide > 0.1) {
						for(int i = 0; i<3; i++) {
							Plane a = new Plane(id_takeoff+=2, time); 
							Takeoff_Runway.add(a); 
						}
					}
				}
				return Takeoff_Runway;
			}

	//Plane lands; remove one from the landing queue
	public static Queue<Plane> plane_lands(Queue<Plane> Landing_Runway) {
		Plane r = Landing_Runway.remove();
		System.out.println("Plane " + r.id + " is cleared to land");
		return Landing_Runway; 
	}
	
	//Plane takes off; remove one from the take-off queue
	public static Queue<Plane> plane_takesoff(Queue<Plane> Takeoff_Runway) {
		Plane t = Takeoff_Runway.remove();
		System.out.println("Plane " + t.id + " is cleared to takeoff");
		return Takeoff_Runway; 
	}

	//Updates the id of a queue and gives it to main method
	public static int update_id(Queue<Plane> Runway) {
		int id = 0;
		int size = Runway.size(); 
		for (int i = 0; i < size; i++) {
			Plane b = Runway.remove(); 
			id = b.id; 	
			Runway.add(b);
		}
		return id;
	}
	
	public static int average_wait(Queue<Plane> Runway, int average_waittime) {
		int average_waittime2 = 0; 
		int size = Runway.size(); 
		for (int i = 0; i < size; i++) {
			Plane b = Runway.remove(); 
			average_waittime2 += b.time_waiting; 
			Runway.add(b); 
		}
		average_waittime2 /= size; 
		average_waittime = (average_waittime + average_waittime2)/2; 
		return average_waittime;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Plane> Landing_Runway = new LinkedList<>(); 
		Queue <Plane> Takeoff_Runway = new LinkedList<>(); 
		int id_landing = 1; 
		int id_takeoff = 0; 
		int planes_landed = 0;
		int planes_takenoff = 0;
		int time = 0; 
		int average_waittime = 0; 
		for (int step = 0; step<24; step++) {
				if (time < 10)
					System.out.println("The time is 12:0" + time);
				else if (time < 60) 
					System.out.println("The time is 12:" + time);
				else if (time < 70)
					System.out.println("The time is 01:0" + (time%60));
				else if (time < 120)
					System.out.println("The time is 01:" + (time%60));
				else
					System.out.println("The time is 02:00");
				Landing_Runway = add_landing(Landing_Runway, time, id_landing); 
				System.out.println("The landing queue size: " + Landing_Runway.size());
				Takeoff_Runway = add_takeoff(Takeoff_Runway, time, id_takeoff);
				System.out.println("The takeoff queue size: " + Takeoff_Runway.size());
				
				id_landing = update_id(Landing_Runway); 
				id_takeoff = update_id(Takeoff_Runway);
				// If one of the queues has 50% or more of all the planes (ground and air) then use both runways to decrease that queue
				if (((Landing_Runway.size() - Takeoff_Runway.size()) >= (int)((Landing_Runway.size() + Takeoff_Runway.size()) / 2)) && Landing_Runway.size() > 2) {
					Landing_Runway = plane_lands(Landing_Runway); 
					Landing_Runway = plane_lands(Landing_Runway); 
					planes_landed+=2; 
				} else if (((Takeoff_Runway.size() - Landing_Runway.size()) >= (int)((Takeoff_Runway.size() + Landing_Runway.size()) / 2)) && Takeoff_Runway.size() > 2) {
					Takeoff_Runway = plane_takesoff(Takeoff_Runway);
					Takeoff_Runway = plane_takesoff(Takeoff_Runway);
					planes_takenoff+=2; 
				} else if (Takeoff_Runway.size() > 0 && Landing_Runway.size() > 0) {
					Landing_Runway = plane_lands(Landing_Runway); 
					planes_landed++; 
					Takeoff_Runway = plane_takesoff(Takeoff_Runway);
					planes_takenoff++;
				} else if (Landing_Runway.size() > 0) {
					Landing_Runway = plane_lands(Landing_Runway); 
					planes_landed++; 
				} else if (Takeoff_Runway.size() > 0) {
					Takeoff_Runway = plane_takesoff(Takeoff_Runway);
					planes_takenoff++;
				}
			
				
			//Printing the time for each step
			time+=5; 
			Landing_Runway = updatewaittimes(Landing_Runway, time); 
			Takeoff_Runway = updatewaittimes(Takeoff_Runway, time); 
			if (Landing_Runway.size() > 0 && Takeoff_Runway.size() > 0)
				average_waittime = (average_wait(Landing_Runway, average_waittime) + average_wait(Takeoff_Runway, average_waittime)) / 2; 
			System.out.println("");
		}
		
		System.out.println(planes_landed + " planes have landed at the airport");
		System.out.println(planes_takenoff + " planes have taken off");
		System.out.println("The average waittime was: " + average_waittime + " min");
		}
	}


