class Solution {
    public void pattern20(int n) {
        int sp = 2*n - 2;
        for (int i = 1; i <= 2*n - 1; i++){
	    int stars = i;
            if (i > n){
                stars = 2*n - i;
            }
            for (int j = 0; j < stars; j++){
                System.out.print("*");
            }
            for (int j = 0; j < sp; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
	    if (i < n) sp -= 2;
	    else sp += 2;
        }
    }
    public static void main(String[] args){
        Solution sol = new Solution();
	int n = 5;
        sol.pattern20(n);
    }
}
