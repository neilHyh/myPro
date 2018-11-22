package AbstractFactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//获取形状为Circle的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		//获取形状为Rectangle的对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		//获取形状为Square的对象
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//获取颜色为RED的对象
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		Color color2 = colorFactory.getColor("Green");
		color2.fill();
		Color color3 = colorFactory.getColor("BLUE");
		color3.fill();
	}
}
