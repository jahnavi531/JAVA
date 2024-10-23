//class cast exception
class Test{
    public static void main(String[] args) {
        Object obj = new Object();
        String str = (String) obj;             //unable to convert string bcoz it is child object

    }
}




