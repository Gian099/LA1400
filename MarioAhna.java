package MiletiGianMarco;
import robocode.*;

public class MarioAhna extends JuniorRobot
{
	int north = 0;
	int east = 90;
	int south = 180;
	int west = 270;
	
	public void run() {

		setColors(white, green, red);
		int heightdistance;
		int widthdistance;
		heightdistance = fieldHeight - robotY;
		widthdistance = fieldWidth - robotX;
		turnTo(0);
		ahead(heightdistance);
		turnTo(90);
		ahead(widthdistance);
		
		
		while(true) {
			turnTo(east);
			ahead(fieldHeight);
			out.println("Corner: Bottom right");
			turnTo(north);
			ahead(fieldWidth);
			out.println("Corner: Bottem left");
			turnTo(west);
			ahead(fieldHeight);
			out.println("Corner: Top left");
			turnTo(south);
			ahead(fieldWidth);
			out.println("Corner: Top right");
		}
	}

	public void runCloseToWall() {
		int travelDistance = fieldHeight - robotX - 300;turnTo(north);ahead(travelDistance);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		turnGunTo(scannedAngle);
		fire(2.5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		back(20);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		back(10);
	}	
}
