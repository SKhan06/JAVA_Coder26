class TypeCasting{
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1323;
        int i = 123453;
        float f = 1.46f;
        double d = .23424;
        double result = (f*b) + (i/c) - (d*s); 
        System.out.println((f*b) + " + " + (i/c) + " - " + (d*s) + " = " + result);
    }
        
}