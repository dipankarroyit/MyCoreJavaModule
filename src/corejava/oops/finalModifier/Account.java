package corejava.oops.finalModifier;

class Account {
	final int accNum;
	static int count;
	{
		accNum = ++count;
	}
}
