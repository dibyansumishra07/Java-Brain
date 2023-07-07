package dummycodes;

class SampleA {
	final String data;
	String name;
	public SampleA() {
		data = "shruti";
		System.out.println("SampleA: default constructor");
	}
	
	public SampleA(String name){
		this.data = "dibyanshu";
		this.name = name;
	}

}

class ChildSampleA {
	public static void main(String[] args) {
		SampleA a = new SampleA();
		
	}
}
