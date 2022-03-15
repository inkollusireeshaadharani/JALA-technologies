//Print the fields/instance members of the parent class using super

class tas21{
	int a=100;
}

class tas2 extends tas21{
	void display() {
		System.out.println(super.a);
	}
}