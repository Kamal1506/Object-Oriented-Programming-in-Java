class Addition{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b, double c){
        return a+b+c;
    }
}

class Main{
    public static void main(String args[]){
        Addition sum = new Addition();
        System.out.println(sum.add(5,5,5.5));
    }
}
