class TestMethods
{
    static int v=0;
    // функция, не возвращающая значение
    static void setV(int i)
    {
        v=i;
        System.out.println("Void method!");
    }
    // фунция с возвращаемым значением
    static int getV()
    {
        System.out.println("Returning method!");
        return v;
    }
    // функция для проверки работы с параметрами
    static int func(int a, int b[])
    {
        a=a+1;
        b[0]=b[0]+1;
        System.out.println("a="+a+" b[0]"+b[0]); // a=2 b=2
        return a; // return 2
    }
    // сравнение двух целых
    static String compare(int i,int j)
    {
        if(i==j)
            return ""+i+" and "+j+" are equal";
        else
        {
            if(i>j)
                return ""+i+" greater than "+j;
            else
                return ""+j+" greater than "+i;
        }
    }
    // совмещение метода с другим числом параметров
    static String compare(int i,int j,int k)
    {
        String S="";
        S=S+compare(i,j)+'\n';
        S=S+compare(i,k)+'\n';
        S=S+compare(j,k);
        return S;
    }
    // совмещение метода с параметрами другого типа
    static String compare(double i,double j)
    {
        if(i==j)
            return ""+i+" and "+j+" are equal";
        else
            if(i>j)
                return ""+i+" greater than "+j;
            else
                return ""+j+" greater than "+i;
    }

    // главный метод - точка входа
    public static void main(String args[])
    {
        // вызов метода, не возвращающего значения
        setV(5);

        // вызов метода, возвращающего значение
        int vv=getV();

        // передача параметров: примитивные и ссылочные типы
        int A; int B[]=new int[1];
        A=1; B[0]=1;
        System.out.println("A="+A+" B[0]="+B[0]); // A=1 B[0]=1

        int aa=func(A,B);
        System.out.println("aa="+aa);
        System.out.println("A="+A+" B[0]="+B[0]); // A=1 B[0]=2

        // вызов совмещенных методов
        String S;
        S=compare(2,5); System.out.println(S);
        S=compare(3,1,6); System.out.println(S);
        S=compare(1.5,2.1); System.out.println(S);
    }
}
