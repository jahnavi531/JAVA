/*class Test{
    public static void main(String[] args) {
        int a = Integer.parseInt("Twenty");            //numberformat exception
        System.out.println(a*10);
    }
}*/







class Test{
    public static void main(String[] args) { 
        try{
            int a = Integer.parseInt("Twenty");  
            System.out.println(a*10);
        }
        catch(NumberFormatException nfe){
            //nfe.printStackTrace();
            System.err.println(nfe.getMessage());
            System.out.println(nfe.getClass());
        }
    }
}