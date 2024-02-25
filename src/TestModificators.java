class A
{
    public int k; // тип public - - доступ и в теле класса и по объекту класса
    private int n; // тип private - доступ только в теле класса
    A() { k=2; n=11; } // конструктор, инициализация переменных-элементов
    int summa() { return k+n; } // метод класса, использующий обе переменные
    // методы для доступа к защищенному элементу n класса A
    // по объекту класса A вне тела класса A
    public int getN() { return n; }
    public void setN(int nn) { n=nn; }
}

class TestModificators
{
    public static void main(String args[])
    {
        A obj=new A(); // создание объекта класса A
        // получить значение переменных

        int kk=obj.k; System.out.println("k="+kk);
        int nn=obj.getN(); System.out.println("n="+nn);

        // установить значения переменных и
        // вызвать метод, использующий
        //закрытую и открытую переменные
        obj.k=10; obj.setN(15);
        int s=obj.summa(); System.out.println("summa="+s);
    }
}