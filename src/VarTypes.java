class VarTypes
{
    public static void main(String args[])
    {
         // переменная примитивного типа
        int varPrimitive;
        // сразу после объявления можно в нее записывать данные
        varPrimitive=1;
        // переменная ссылочного типа
        int varReference[]; // или: int[] varReference;
        // выделение памяти для переменной этого типа
        varReference=new int[3];
        // теперь можно сохранять данные в переменной этого типа
        varReference[0]=2;
        varReference[1]=3;
        varReference[2]=4;
        System.out.println("varPrimitive="+varPrimitive);
        System.out.println("varReference[0]="+varReference[0]);
        System.out.println("varReference[1]="+varReference[1]);
        System.out.println("varReference[2]="+varReference[2]);
    }
}