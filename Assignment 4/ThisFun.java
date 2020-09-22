
//33.	Write a program to demonstrate 
//	functionalities of this keyword in java. 

class This{
    private int No;
    private String Name;

    void getData(int No, String Name){
        this.No = No;
        this.Name = Name;

    }

    void showData(){
        System.out.println(No+" "+Name);
    }

}


class This{
    public static void main(String[] args) {
        This e = new This();
        e.getData(111, "Sumit");
        e.showData();
    }
}