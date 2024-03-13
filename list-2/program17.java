class Program17 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
	int sum = c.add(5, 3);
        System.out.println("Sum: " + sum);

	Rectangle r = new Rectangle();
	int area = r.calculateArea(4, 5);
        System.out.println("Area: " + area);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class Rectangle {
    public int calculateArea(int l, int w) {
        return l * w;
    }
}

