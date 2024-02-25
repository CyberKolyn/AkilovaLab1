class StaticAndDynamic
{
    int i=0; // переменная экземпляра
    static int j=0; // переменная класса
    // статические методы
    static void setJ(int k)
    {
        System.out.println("Static Method"); j=k;
    }
    static int getJ()
    {
        System.out.println("Static Method"); return j;
    }
    // динамические методы
    void setI(int k)
    {
        System.out.println("Dynamic Method"); i=k;
    }
    int getI()
    {
        System.out.println("Dynamic Method"); return i;
    }
    int summa()
    {
        // в динамических методах можно
        // использовать статические переменные
        System.out.println("Dynamic Method"); return i+j;
    }
}
class TestElements
{
    public static void main(String args[])

    {
        int ii,jj;
        // для использования элементов класса объект необязателен
        // использование статической переменной
        StaticAndDynamic.j=6; jj=StaticAndDynamic.j;
        System.out.println("Main, jj="+jj);
        // вызов статических методов
        StaticAndDynamic.setJ(4); jj=StaticAndDynamic.getJ();
        System.out.println("Main, jj="+jj);
        // перед использованием элементов экземпляра
        // требуется реализовать объект (экземпляр)
        StaticAndDynamic obj=new StaticAndDynamic();
        // использование динамической переменной
        obj.i=3; ii=obj.i;
        System.out.println("Main, ii="+ii);
        // вызов динамическим методов
        obj.setI(8); ii=obj.getI();
        System.out.println("Main, ii="+ii);
        // вызов метода, в котором используются
        // динамическая и статическая переменные
        ii=obj.summa();
        System.out.println("Main, summa="+ii);
    }
}