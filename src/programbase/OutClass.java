package programbase;

class OutClass {
	private int age = 12;
 
	public void outPrint(final int x) {
		class InClass {
			public void InPrint() {
				int $a=3;
				System.out.println(x);
				System.out.println(age);
			}
		}
		new InClass().InPrint();
	}
}