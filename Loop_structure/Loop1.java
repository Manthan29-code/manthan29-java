class Loop1 {
    public static void main(String[] args) {
        int i;        
        for (i = 0; i <= 5; i++) {
            System.out.println("I : " + i);
        }
        System.out.println("I : " + i);

        char ch = 'a';
        while (ch <= 'z') {
            System.out.print("\tch : " + ch);
            ch++;
        }
            System.out.println("ch : " + ch);


        i = 5;        
        do {
            System.out.println("I : " + i);
            i--;            
        } while (i >= 1);
    } // main
} // class
