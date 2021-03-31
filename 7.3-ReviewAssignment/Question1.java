class Question1 {
    public static void main (String[] args) {
        int x = 33;
        int y = 44;
        int gcf = getGCF(x,y);
        System.out.print(gcf);
    }
    
    public static int getGCF(int x, int y) {
        if (x == y) return x;
        if (x > y) return getGCF(x-y,y);
        else return getGCF(x,y-x);
    }
}
