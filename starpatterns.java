public class starpatterns {
    public static void main(String[] args) {
        System.out.println("Welcome to Star Pattern...");
        System.out.println("Enter a number:");
        int n=Integer.parseInt(System.console().readLine());
        for (int i=0;i<n;i++){
            for (int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j=1;j<i;j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j<(n-1);j++){
                System.out.print(" ");
            }
            for (int j=n-i;j>0;j--){
                System.out.print("*");
            }
            for (int j=n-1-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
