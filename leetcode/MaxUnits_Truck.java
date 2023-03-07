package leetcode;

public class MaxUnits_Truck {

	public int maximumUnits(int[][] boxTypes, int truckSize) {
		int res = 0;
		int m = 0;
		for (int i = 0; i < truckSize; i++) {
			
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void hi() {
		System.out.println("just a casual static bro");
	}
}
/** python - https://leetcode.com/problems/maximum-units-on-a-truck/description/
 * def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
	boxTypes.sort(key=lambda a:-a[1])
	max_units = 0
	for box in boxTypes:
		if truckSize < 0 : break
		max_units += min(truckSize, box[0]) * box[1]
		truckSize -= box[0]
	return max_units
*/
 