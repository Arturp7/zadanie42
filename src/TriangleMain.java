public class TriangleMain {
    public static void main(String[] args) {
        TriangleCheck check = new TriangleCheck();
        Triangle triangle1 =  new Triangle(3,4,5); // to jest trójkąt prostokątny
        Triangle triangle2 =  new Triangle(5,12,13); // to jest trójkąt prostokątny
        Triangle triangle3 =  new Triangle(5,14,8); // to nie jest trójkąt prostokątny


        //check1.isRightTriangle(triangle1);
        System.out.println(check.isRightTriangle(triangle1));
        System.out.println(check.isRightTriangle(triangle2));
        System.out.println(check.isRightTriangle(triangle3));






//        System.out.println(triangle1.calc());
//        System.out.println(triangle2.calc());




    }
}
