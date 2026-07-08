class CmdTwo {
    public static void main(String args[]) {

        if (args.length != 1) {
            System.out.println("It is mandatory to pass one argument.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}


