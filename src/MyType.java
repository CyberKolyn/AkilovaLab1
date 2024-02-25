class MyType // объявляется класс
{
    public int myData=5; // переменная-элемент класса
    public void myMethod() // метод класса
    { // печать в методе
        System.out.print("myMethod!");
        System.out.println(" myData="+myData);
    }
    public MyType() // конструктор без параметров
    { // печать в конструкторе
        System.out.println("Constructor without parameters");
    }
    public MyType(int v) // конструктор с одним параметром
    { // печать в конструкторе
        System.out.print("Constructor with one parameter");
        System.out.println(" Setting myData="+v);
        myData=v;
    }
}
