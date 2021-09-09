import java.util.*;
public class ParkingSystem implements IParking {
	Integer big,  medium, small;
	public ParkingSystem(Integer big, Integer medium, Integer small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addCar(int carType) {
		// TODO Auto-generated method stub
		if (carType == big) return true;
		if (carType == medium) return true;
		if (carType == small) return false;
		return false;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IParams params = IParking.parse();
		ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(),params.getSmall());
		ArrayList<Integer> plan = params.getPlanParking();
		for (int i = 0; i < plan.size(); i++) {
            ps.addCar(plan.get(i));
        }
        ps.print();
	}

}
