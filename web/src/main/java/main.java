class main {

    public static void main(String[] args) {

        Parser parser = new Parser();
        Root root = parser.parse();

        System.out.println(root.toString());
    }
}