class CmdOne {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("It is mandatory to pass two arguments in command line");
            return;
        }

        System.out.println(args[0] + " Technologies " + args[1]);
    }
}
