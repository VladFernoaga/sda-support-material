package ro.unitbv.operations;

public class TernaryOperation {

	/**
	 * if age is less then 18 return string child else adult
	 */
	public String isChild(int age) {
		String result = null;
		if (age < 18) {
			result ="child";
		} else {
			result = "adult";
		}
		return result;
	}

	public String isChildTerneryOp1(int age) {
		String result = age < 18 ? "child" : "adult";
		return result;
	}
	
	public String isChildTerneryOp2(int age) {
		return age < 18 ? "child" : "adult";
	}
}
