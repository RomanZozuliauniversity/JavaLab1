class Main {
    /**
     * Main class displays the result of performing functions.
     * @author Roman Zozulia KN-204.
     * @since 1.0
     */
    public static void main(String[] args){
        Fibonacci d = new Fibonacci();
        if(args.length==0){
            d.num(d.valueNum());
        }
        else{
            d.num(Integer.parseInt(args[0]));
            }
        }
}
