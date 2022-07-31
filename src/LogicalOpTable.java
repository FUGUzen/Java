class logicalOpTable {
    public static void main(String[] args) {
        System.out.println("P\t    Q\t    AND\t    OR\t    XOR\t    NOT");
        boolean p;
        boolean q;

        p = true; q = true;
        System.out.print(retNumb(p) +"\t" + retNumb(q) + "\t");
        System.out.print((retNumb(p) & retNumb(p)) + "\t" + (retNumb(p) | retNumb(q)) + "\t");
        System.out.println((retNumb(p) ^ retNumb(q)) + "\t" + (retNumb(!p)));

        p = true; q = false;
        System.out.print(retNumb(p) +"\t" + retNumb(q) + "\t");
        System.out.print((retNumb(p) & retNumb(q)) + "\t" + (retNumb(p) | retNumb(q)) + "\t");
        System.out.println((retNumb(p) ^ retNumb(q)) + "\t" + (retNumb(!p)));

        p = false; q = true;
        System.out.print(retNumb(p) +"\t" + retNumb(q) + "\t");
        System.out.print((retNumb(p) & retNumb(q)) + "\t" + (retNumb(p) | retNumb(q)) + "\t");
        System.out.println((retNumb(p) ^ retNumb(q)) + "\t" + (retNumb(!p)));

        p = false; q = false;
        System.out.print(retNumb(p) +"\t" + retNumb(q) + "\t");
        System.out.print((retNumb(p) & retNumb(q)) + "\t" + (retNumb(p) | retNumb(q)) + "\t");
        System.out.println((retNumb(p) ^ retNumb(q)) + "\t" + (retNumb(!p)));

    }
    public static int retNumb(boolean p) {
        int result;
        if(true) {
            result = 1;
        }
        if(!p) {
            result = 0;
        }
        return  result;
    }
}

