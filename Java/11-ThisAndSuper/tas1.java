//Print the fields/instance members of the current class using this and without using object


class tas11{
	int x=10;
	int y=20;
	void display() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
}
class tas1{
	public static void main(String args[]) {
		tas11 t=new tas11();
		t.display();
	}
}