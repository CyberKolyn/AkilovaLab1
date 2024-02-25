class NewClass // первичный класс
{
    public static void main(String args[])
    {
        // объект obj1 - реализация класса MyType
        MyType obj1=new MyType();
        obj1.myMethod(); // использование метода
        // доступ к открытой переменной
        System.out.println("---------obj1.myData="+obj1.myData);
        // объект obj2 - реализация класса MyType
        MyType obj2=new MyType(100);
        // доступ к открытой переменной
        System.out.println("---------obj2.myData="+obj2.myData);
    }
}