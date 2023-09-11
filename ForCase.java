
class ForCase{

    public static void starMethod(int value){
        for(int i = 0 ; i<=value ; i++){
            if(i%2==0){
                for(int j = 0 ; j<i ; j++){
                    System.out.print("* ");
                }
            }else if(i == 1){
                System.out.println("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        starMethod(10);
       
    }
}


