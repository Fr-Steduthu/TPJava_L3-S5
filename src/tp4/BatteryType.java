
package tp4;

public enum BatteryType{
	C, D, AA, AAA, Undefined;
	
	public static BatteryType match(String b) {
		switch(b) {
		case "AA":
			return AA;
		case "AAA":
			return AAA;
		case "C":
			return C;
		case "D":
			return D;
		default:
			return Undefined;
	
		}
	}
	
	public static String match(BatteryType b) {
		return b.toString();
	}
	
	@Override
	public String toString() {
		switch(this) {
		case AA:
			return "AA";
		case AAA:
			return "AAA";
		case C:
			return "C";
		case D:
			return "D";
		default:
			return "Undefined";
	
		}
	}

package tp4;

public enum BatteryType{
	C, D, AA, AAA, Undefined;
	
	public static BatteryType match(String b) {
		switch(b) {
		case "AA":
			return AA;
		case "AAA":
			return AAA;
		case "C":
			return C;
		case "D":
			return D;
		default:
			return Undefined;
	
		}
	}
	
	public static String match(BatteryType b) {
		return b.toString();
	}
	
	@Override
	public String toString() {
		switch(this) {
		case AA:
			return "AA";
		case AAA:
			return "AAA";
		case C:
			return "C";
		case D:
			return "D";
		default:
			return "Undefined";
	
		}
	}

}